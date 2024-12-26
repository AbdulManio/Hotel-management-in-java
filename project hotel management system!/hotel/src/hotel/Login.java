package hotel;
import javax.swing.*;
 import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
	private JPasswordField txtpassword;
JTextField username,password;
JButton login,cancel;;

	Login()
	{
		getContentPane().setBackground(new Color(47, 79, 79));
		
		getContentPane().setLayout(null);
		
		
		  JLabel user = new JLabel("Username");
	      user.setBounds(40,70,100,30);
	      user.setForeground(Color.WHITE);
	      getContentPane().add(user);
	      
	       username= new JTextField();
	      username.setBackground(new Color(128, 128, 128));
	      username.setBounds(130,70,160,30);
	      getContentPane().add(username);
	      
	      
	      JLabel pass = new JLabel("Password");
	      pass.setBounds(40,120,100,30);
	      pass.setForeground(Color.WHITE);
	      getContentPane().add(pass);
	      
	       password= new JTextField();
	      password.setForeground(new Color(255, 255, 255));
	      password.setBackground(new Color(128, 128, 128));
	      password.setBounds(130,120,160,30);
	      getContentPane().add(password);
	      
	      	 login= new JButton("Login");
	        login.setBounds(40,190,120,30);
	        login.setFont(new Font("serif",Font.BOLD,15));
	        login.setBackground(new Color(0, 191, 255));
	        login.setForeground(Color.WHITE);
	        login.addActionListener(this);
	        getContentPane().add(login);
	        
	      	cancel= new JButton("Cancel");
	      	cancel.addActionListener(new ActionListener() {
	      		public void actionPerformed(ActionEvent e) {
	      		}
	      	});
	        cancel.setBounds(180,190,120,30);
	        cancel.setFont(new Font("serif",Font.BOLD,15));
	        cancel.setBackground(new Color(255, 0, 0));
	        cancel.setForeground(Color.WHITE);
	        cancel.addActionListener(this);
	        getContentPane().add(cancel);
	        	
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("second2.png"));
	        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_AREA_AVERAGING);
	        ImageIcon i3 =  new ImageIcon(i2);
	        JLabel l3 = new JLabel(i3);
	        l3.setBounds(370,70,150,150);
	        getContentPane().add(l3);
	        
	        JPanel panel = new JPanel();
	        panel.setBackground(new Color(255, 165, 0));
	        panel.setBounds(0, 0, 584, 44);
	        getContentPane().add(panel);
	        panel.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("LOGIN");
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
	        lblNewLabel.setForeground(new Color(255, 255, 255));
	        lblNewLabel.setBounds(10, 0, 113, 44);
	        panel.add(lblNewLabel);
	        
	       
	     
		
		setBounds(500,200,600,300);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==login) {
			String use=username.getText();
			String pass=password.getText();
			try{
				conn obj=new conn();
				String query="select * from login where username ='"+ use +"'and password = '"+pass+"'";
				ResultSet rs= obj.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Dashboard();
				}else {
					JOptionPane.showMessageDialog(null,"invalid username or password");
					setVisible(false);
				}				
				
			}catch(Exception c)
			{
				c.printStackTrace();
			}
			
			
		}else if(ae.getSource()==cancel) {
			setVisible(false);
		}
	}
	public static void main(String args[])
	{
		new Login();
	}
}