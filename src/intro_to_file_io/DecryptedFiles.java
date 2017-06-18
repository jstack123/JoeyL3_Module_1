package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DecryptedFiles {
	String decryptedForm;

	public static void main(String[] args) {
		JFileChooser chosenFile = new JFileChooser();
		int returnVal = chosenFile.showOpenDialog(null);
		FileReader fr = null;
		String decryptedForm = "";

		{
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String fileName = chosenFile.getSelectedFile().getAbsolutePath();;
				JOptionPane.showMessageDialog(null, fileName);
				for (int i = 0; i < fileName.length(); i++) {
					char c = fileName.charAt(i);
					c-=5;
					decryptedForm+=c;
				}
				JOptionPane.showMessageDialog(null, decryptedForm);
			}
			try {
				fr = new FileReader("src/intro_to_file_io/test2.txt");
				int c = fr.read();
				while (c != -1) {
					System.out.println((char) c);
					c = fr.read();
				}
				fr.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}