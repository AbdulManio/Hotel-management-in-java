package hotel;

import javax.swing.*;
import java.awt.*;
public class Dashboard extends JFrame {
	Dashboard()
	{
		setBounds(1,3,1370,900);
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,1000,Image.SCALE_AREA_AVERAGING);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(1,3,1370,900);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 46));
        text.setBounds(400, 80, 1000, 50);
    	image.add(text);
    	
    	JMenuBar mb=new JMenuBar();
    	mb.setBounds(20,0,1550,30);
    	image.add(mb);
    	
    	JMenu manage=new JMenu("Management");
    	manage.setForeground(Color.RED);
    	mb.add(manage);
    	
    	JMenuItem recep= new JMenuItem("Reception");
    	manage.add(recep);
    	
    	JMenu admin= new JMenu("Admin");
    	admin.setForeground(Color.RED);
    	mb.add(admin);
    	
    	JMenuItem room= new JMenuItem("Add Room");
    	admin.add(room);
        
		setVisible(true);
		
        
        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dashboard();

	}

}