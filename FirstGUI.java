import java.text.DecimalFormat;

import javax.swing.JFrame;
public class FirstGUI   {
	public static void main(String[] args) {
		Form1 gui = new Form1();
		
		gui.setTitle("Circle Application");
		gui.setSize(300, 175);
		gui.setResizable(false);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}// end class FirstGUI
