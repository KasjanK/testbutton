package swingUppgift;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestJButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ImageIcon img = new ImageIcon("icons8-puzzle-48.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 400);
		frame.setTitle("Test Button");
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(255, 100, 100));
		frame.setIconImage(img.getImage());
		
		JButton btn = new JButton();
		btn.setBounds(100, 150, 200, 50);
		btn.setText("Calculate");
		
		JLabel label = new JLabel();
		label.setText("27 + 3");
		frame.add(btn);
		frame.add(label);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("30");
			}
		});
		
	}
}
