/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management;

/**
 *
 * @author kishorkumar
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		new AboutUs().setVisible(true);
	}

	public AboutUs() {

		super("About Me");
		setBackground(new Color(173, 216, 230));
                setForeground(Color.black);
		setBounds(500, 250, 700, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l3 = new JLabel("Library Management System");
		l3.setFont(new Font("Bookman Old Style", Font.BOLD , 34));
		l3.setBounds(39, 40, 531, 55);
		contentPane.add(l3);

		JLabel l6 = new JLabel("Developed By : Kishor Kumar");
		l6.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		l6.setBounds(70, 122, 600, 35);
		contentPane.add(l6);

		JLabel l7 = new JLabel("Connect with me on :- ");
		l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l7.setBounds(57, 208, 600, 34);
		contentPane.add(l7);

		JLabel l8 = new JLabel("Linkedin : https://www.linkedin.com/in/kishor7050/");
		l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l8.setBounds(99, 241, 600, 34);
		contentPane.add(l8);
		
		JLabel l10 = new JLabel("Github : https://github.com/kishor70");
		l10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l10.setBounds(99, 286, 600, 34);
		contentPane.add(l10);

		JLabel l9 = new JLabel("Facebook : https://www.facebook.com/profile.php?id=100039778237078");
		l9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		l9.setBounds(99, 331, 600, 34);
		contentPane.add(l9);

		contentPane.setBackground(Color.WHITE);
	}

}
