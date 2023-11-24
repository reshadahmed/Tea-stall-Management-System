import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Home extends JFrame implements ActionListener
{

    Container c;
    ImageIcon icon, logo,logoo;
    JLabel label1, imgLabel,imagelbl;
    Font f1, f2;
    JButton btn1, btn2, btn3, btn4, nBtn;
    Cursor cursor;

    public Home() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Know-N-Grow");
        this.setSize(1100, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/3.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/2.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		
		logoo = new ImageIcon(getClass().getResource("/images/kg1.png"));
        imagelbl = new JLabel(logoo);
        imagelbl.setBounds(660, 60, logoo.getIconWidth(), logoo.getIconHeight());
        c.add(imagelbl);

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 48);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Soil report");
        btn1.setBounds(570, 390, 195, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
		btn1.addActionListener(this);
        c.add(btn1);

        btn2 = new JButton("Crops");
        btn2.setBounds(800, 390, 195, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
		btn2.addActionListener(this);
        c.add(btn2);

        btn3 = new JButton("Log out");
        btn3.setBounds(685, 470, 195, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
		btn3.addActionListener(this);
        c.add(btn3);

       
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        
    }    
        public void actionPerformed(ActionEvent ae)
	    {
		    String command = ae.getActionCommand();
		    if(btn1.getActionCommand().equals(command))
				{
					setVisible(false);
                    soil s = new soil();
                    s.setVisible(true);
				}
				else if(btn2.getActionCommand().equals(command))
				{
					this.setVisible(false);
					crop c = new crop();
					c.setVisible(true);
				}
				else if(btn3.getActionCommand().equals(command))
				{
					login l = new login();
			        this.setVisible(false);
			        l.setVisible(true);
				}

        }
       
        public static void main(String[] args) 
	    {

           Home frame = new Home();
           frame.setVisible(true);
        }
}
