import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

    public class signin extends JFrame implements ActionListener
    {

        Container c;
        ImageIcon icon, logo,logoo;
        JLabel label1, imgLabel,imagelbl;
        Font f1, f2, f3, f4, f5, f6;
        JTextField tf1, tf2;
        JComboBox securityQsn;
        JButton btn1, btn2, nBtn;
        JPasswordField tf3;
        Cursor cursor;
    

        public signin() 
        {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("sign In");
            this.setSize(1100, 700);
            this.setLocationRelativeTo(null);
            this.setResizable(false);

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.decode("#F2F2F2"));

           
            icon = new ImageIcon(getClass().getResource("/images/3.png"));
            this.setIconImage(icon.getImage());

            
            logo = new ImageIcon(getClass().getResource("/images/2.png"));
            imgLabel = new JLabel(logo);
            imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
            c.add(imgLabel);

            
            f1 = new Font("Segoe UI Black", Font.PLAIN, 60);
            f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
            f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
            f4 = new Font("Segoe UI", Font.PLAIN, 25);
            f5 = new Font("Segoe UI", Font.PLAIN, 19);
            f6 = new Font("Segoe UI", Font.PLAIN, 25);

           
			logoo = new ImageIcon(getClass().getResource("/images/lbl1.png"));
            imagelbl = new JLabel(logoo);
            imagelbl.setBounds(660, 20, logoo.getIconWidth(), logoo.getIconHeight());
            c.add(imagelbl);
      

            
            label1 = new JLabel();
            label1.setText("User Name");
            label1.setBounds(590, 300, 215, 50);
            label1.setFont(f4);
            c.add(label1);

            tf1 = new JTextField();
            tf1.setBounds(750, 300, 200, 35);
            tf1.setFont(f5);
            c.add(tf1);

            
            label1 = new JLabel();
            label1.setText("Phone");
            label1.setBounds(590, 370, 300, 50);
            label1.setFont(f4);
            c.add(label1);

            tf2 = new JTextField();
            tf2.setBounds(750, 370, 200, 35);
            tf2.setFont(f5);
            c.add(tf2);
 
           
            label1 = new JLabel();
            label1.setText("Password");
            label1.setBounds(590, 440, 300, 50);
            label1.setFont(f4);
            c.add(label1);

            tf3 = new JPasswordField();
            tf3.setBounds(750, 440, 200, 35);
            tf3.setFont(f2);
            tf3.setEchoChar('*');
            c.add(tf3);

           
            cursor = new Cursor(Cursor.HAND_CURSOR);

           
            btn1 = new JButton("Back");
            btn1.setBounds(550, 545, 215, 50);
            btn1.setFont(f2);
            btn1.setCursor(cursor);
            btn1.setForeground(Color.WHITE);
            btn1.setBackground(Color.decode("#2E75B6"));
		    btn1.addActionListener(this);
            c.add(btn1);

            btn2 = new JButton("Sign up");
            btn2.setBounds(800, 545, 215, 50);
            btn2.setFont(f2);
            btn2.setCursor(cursor);
            btn2.setForeground(Color.WHITE);
            btn2.setBackground(Color.decode("#2E75B6"));
		    btn2.addActionListener(this);
            c.add(btn2);



            nBtn = new JButton("");
            nBtn.setBounds(0, 0, 0, 0);
            c.add(nBtn);
        }
	
	     public void actionPerformed(ActionEvent ae)
	    {
		    String command = ae.getActionCommand();
		    if(btn2.getText().equals(command))
		    {
			    try
			    {   
				    File file = new File (".\\Data\\userinfo.txt");
					if(!file.exists()){
						file.createNewFile();
					}
				    FileWriter fw = new FileWriter(file,true);
			        String name = tf1.getText();
			        String phn = tf2.getText();
			        String pass = tf3.getText();
				    fw.write (tf1.getText()+"\t"+tf2.getText()+"\t"+tf3.getText()+"\n");
				    fw.close();
			    }
			    catch(Exception ex)
			    {
				    JOptionPane.showMessageDialog(null,"your account is created");
			    }
			    
                login l = new login();
                l.setVisible(true);
			    this.setVisible(false);
	        } 
		    else if(btn1.getText().equals(command)) 
		    {
			    login l = new login();
			    this.setVisible(false);
			    l.setVisible(true);
		    }
		}
        public static void main(String[] args) 
		{

            signin s = new signin();
            s.setVisible(true);
        }
    }
