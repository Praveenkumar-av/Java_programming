/* A TextArea is similar to a text field, but it can accommodate several lines of
text. 

To create a TextArea :
TextArea ta = new TextArea(); // a blank text area is created
TextArea ta = new TextArea(rows,columns); // text area with specified number of rows and columns
TextArea ta = new TextArea("default text"); // default text is displayed when the text area is displayed
TextArea ta = new TextArea("default text",rows,columns); // default text is displayed when the text area is displayed

To retrieve the text from a TextArea :
String s = ta.getString();

To set the text to a TextArea :
ta.setText("text");

To hide the text being typed into the TextArea by a character :
ta.setEchoChar('char');

To append the given text to the text area :
ta.append("text");

To insert the given text at the specified position :
ta.insert("text",position);

To replace the text from the specified start position to the specified end position :
ta.replaceRange("text",start,end);

*/