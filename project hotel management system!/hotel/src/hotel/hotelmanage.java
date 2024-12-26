package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class hotelmanage extends JFrame implements ActionListener{

	hotelmanage(){
		
		setSize(1366,565);
		setLocation(100,200);
		setVisible(true);
		getContentPane().setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("first.jpg")); 
		JLabel image=new JLabel(i1);
		getContentPane().add(image); 
		
		
		
		image.setBounds(0,0,1366,565);
		JLabel text=new JLabel("HOTEL MANAGEMENT SYSTEM");
		text.setBounds(20,430 , 1000, 90);
		text.setForeground(Color.white);
		text.setFont(new Font("serit",Font.PLAIN,50));
		image.add(text);
		
		
		
		JButton button=new JButton("NEXT");
		button.setBounds(1150,450,150,50);
		
		button.setForeground(Color.BLACK);
		button.addActionListener(this);
		button.setFont(new Font("Serif", Font.BOLD, 25));
		image.add(button);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Login();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new hotelmanage();
	}

}