import 'package:flutter/material.dart';

// ignore: non_constant_identifier_names
final ITEM_COUNT = 1000;

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("My Application"),
        ),
        body: ListView.builder(
          itemBuilder: (BuildContext context, int position) {
            return MyItem(
              Text(
                "Test $position",
                textAlign: TextAlign.left,
              ),
              position % 2 == 0
                  ? Image.asset("assets/image1.jpg", width: 100.0)
                  : Image.asset("assets/image2.jpg", width: 100.0),
            );
          },
          itemCount: ITEM_COUNT,
        ),
      ),
    );
  }
}

class MyItemState extends State<MyItem> {
  bool checked = false;

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 66.0,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: <Widget>[
          widget.image,
          Expanded(
            child: Padding(
              padding: EdgeInsets.fromLTRB(10.0, 0.0, 10.0, 0.0),
              child: widget.itemName,
            ),
          ),
          Padding(
            padding: EdgeInsets.all(5.0),
            child: Checkbox(
              value: checked,
              onChanged: (bool value) {
                setState(() {
                  checked = !checked;
                });
              },
            ),
          )
        ],
      ),
    );
  }
}

class MyItem extends StatefulWidget {
  final itemName;
  final image;

  MyItem(this.itemName, this.image);

  @override
  MyItemState createState() => MyItemState();
}
