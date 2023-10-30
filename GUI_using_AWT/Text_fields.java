/* A text field represents a long rectangular box where the user can type a single 
 line of text.

To create a text field :
TextField tf = new TextField();  // a blank text field is created
TextField tf = new TextField(25);  // 25 characters width of text field
TextField tf = new TextField("default text",25); // default text is displayed when the text field is displayed

To retrieve the text from a TextField :
String s = tf.getText();

To set the text to a text field :
tf.setText("text");

To hide the text being typed into the TextField by a character :
tf.setEchoChar('char');

*/