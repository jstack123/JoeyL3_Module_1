package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Assingments {
public static void main(String[] args) {

	String encryptedForm = JOptionPane.showInputDialog("Type a message in the space below.");
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
		fw.write(encryptedForm);
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public Assingments() {
	
}
}
