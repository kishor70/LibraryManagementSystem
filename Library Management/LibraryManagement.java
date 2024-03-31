
package library.management;

/**
 *
 * @author kishorkumar
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagement extends JFrame implements ActionListener {

	JLabel l1;

	public LibraryManagement() {
		setTitle("Library Management System");

		setSize(1000, 500);
		setLocation(150, 150);
		getContentPane().setLayout(null);
		
		JButton b1 = new JButton("Next");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Login login = new Login();
				login.setVisible(true);
			}
		});
		b1.setForeground(Color.gray);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		b1.setBounds(850, 400, 100, 50);
		getContentPane().add(b1);
		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon("\\icons\first.jpg"));
//		lblNewLabel.setBounds(0, 0, 1350, 351);
                ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
                Image i5 = background.getImage().getScaledInstance(1000,500,Image.SCALE_SMOOTH);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel profile = new JLabel(i6);
                profile.setBounds(0,0, 1000, 500);
		getContentPane().add(profile);
		
	}

	public void actionPerformed(ActionEvent ae) {
		new Login().setVisible(true);
		this.setVisible(false);

	}

	public static void main(String[] args) {
		LibraryManagement window = new LibraryManagement();
		window.setVisible(true);
	}
}