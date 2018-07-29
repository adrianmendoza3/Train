import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class Sample {

	private JFrame frame;
	private JLabel train;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Sample window = new Sample();
	}

	/**
	 * Create the application.
	 */
	public Sample() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		train = new JLabel("New label");
		train.setIcon(new ImageIcon("/Users/adrianmendoza/Downloads/images.jpeg"));
		train.setBounds(31, 54, 196, 205);
		frame.getContentPane().add(train);
		frame.repaint();
		frame.revalidate();
		
		move();
	}

	public void move() {
		int x = 31;
		Timer tm;
		while(true) {
			train.setBounds(x, 54, 196, 205);
			x+=2;
			frame.repaint();
			frame.revalidate();
		}
	}
}
