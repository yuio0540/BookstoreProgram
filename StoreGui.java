package project01;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class StoreGui extends JFrame{
	public StoreGui() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel la = new JLabel(" 아이디");
		la.setLocation(10,20);
		la.setSize(200,20);
		c.add(la);
		JLabel la2 = new JLabel(" 비밀번호");
		la2.setLocation(10,70);
		la2.setSize(200,20);
		c.add(la2);
		
		for (int i=0; i<=1; i++) {
		JTextField tf = new JTextField("");
		tf.setLocation(100,15+(50*i));
		tf.setSize(170,30);
		c.add(tf);
		}
		
		JButton btn = new JButton("로그인");
		btn.setLocation(30,110);
		btn.setSize(100,50);
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		JButton btn2 = new JButton("회원가입");
		btn2.setLocation(150,110);
		btn2.setSize(100,50);
		btn2.addActionListener(new MyActionListener());
		c.add(btn2);
		
		setSize(300,220);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
 	public static void main(String[] args) {
		StoreGui frame = new StoreGui();
	}
}