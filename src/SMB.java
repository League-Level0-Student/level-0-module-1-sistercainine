import javax.swing.JOptionPane;

public class SMB {
	public static void main(String[] args) {
		
	
String pass="shrek";
String message=JOptionPane.showInputDialog("wHaTs tHe sEcrEt mEsSaGe");

String guess=JOptionPane.showInputDialog("gimme the pass and you get to see some dAnK mEmEs");
if (guess.equals(pass)) {
	JOptionPane.showMessageDialog(null, message);
	
}else JOptionPane.showMessageDialog(null, "FBI OPEN UP");{
	
}

}
}