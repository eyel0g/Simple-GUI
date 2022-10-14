import javax.swing.*; // Buttons, text fields, ...


import java.awt.*; // Container, Color, 
import java.awt.event.*;//ActionListener
import java.text.DecimalFormat;

public class Form1 extends JFrame{
	private JTextField raTf, reTf;
	private JLabel raL, reL;
	private JButton aB, cB, eB;
	public Form1() {
		raTf = new JTextField(25);
		reTf = new JTextField(20);
		
		raL = new JLabel("Radius");
		reL = new JLabel("Result");
		
		aB = new JButton("Area");
		cB = new JButton("Circum");
		eB = new JButton("Exit");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Color col = new Color(255, 0, 0);
		//c.setBackground(col);
		
		c.add(raL);
		c.add(raTf);
		c.add(reL);
		c.add(reTf);
		c.add(aB);
		c.add(cB);
		c.add(eB);
		MyEventHandler meh = new MyEventHandler();
		aB.addActionListener(meh);
		cB.addActionListener(meh);
		eB.addActionListener(meh);
		
		this.addWindowListener(// anonymous inner class starts here
				new WindowAdapter() {
					public void windowClosing(WindowEvent we) {
						System.exit(0);
					}
				}				
		);
	}
	public class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			Circle c = new Circle();
			DecimalFormat df = new DecimalFormat("#.##");
			c.setR(Double.parseDouble(raTf.getText()));
			if (ae.getSource()==aB) {
				reTf.setText(df.format(c.area()));
			}
			else if (ae.getSource()==cB) {
				reTf.setText(df.format(c.circum()));
			}
			else { // meaning exit button in our case
				 System.exit(0);
			}
		}
	}
}
