package lab3;


import javax.swing.JFrame;
import javax.swing.JLabel;


public class ventana {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		label.setText("hola soy una ventana");
		frame.add(label);
		frame.setTitle("mi Primera ventana");
		frame.setSize(800, 600);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
