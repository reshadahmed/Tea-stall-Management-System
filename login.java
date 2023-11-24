import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

    public class login extends JFrame implements ActionListener
	{
		Container c;
        ImageIcon icon, logo;
        JLabel label1, imgLabel;
        Font f1, f2, f3, f4, f5, f6;
        JTextField tf1;
        JButton btn1, btn2, btn3, nBtn;
        JPasswordField tf2;
        Cursor cursor;

        public login() 
	    {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Log in");
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
            imgLabel.setBounds(20, 40, logo.getIconWidth(), logo.getIconHeight());
            c.add(imgLabel);

            
            f1 = new Font("Segoe UI Black", Font.BOLD, 60);
            f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
            f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
            f4 = new Font("Segoe UI", Font.PLAIN, 30);
            f5 = new Font("Segoe UI", Font.PLAIN, 22);
            f6 = new Font("Segoe UI", Font.PLAIN, 25);
 
            
            label1 = new JLabel();
            label1.setText("Login");
            label1.setBounds(700, 20, 300, 90);
            label1.setFont(f1);
            c.add(label1);

            
            label1 = new JLabel();
            label1.setText("User Name");
            label1.setBounds(590, 145, 215, 50);
            label1.setFont(f4);
            c.add(label1);

            tf1 = new JTextField();
            tf1.setBounds(750, 145, 200, 35);
            tf1.setFont(f5);
            c.add(tf1);


	
            label1 = new JLabel();
            label1.setText("Password");
            label1.setBounds(590, 215, 300, 50);
            label1.setFont(f4);
            c.add(label1);

            tf2 = new JPasswordField();
            tf2.setBounds(750, 215, 200, 35);
            tf2.setFont(f2);
            tf2.setEchoChar('*');
            c.add(tf2);

            
            cursor = new Cursor(Cursor.HAND_CURSOR);

            
            btn1 = new JButton("Login");
            btn1.setBounds(550, 325, 215, 50);
            btn1.setFont(f2);
            btn1.setCursor(cursor);
            btn1.setForeground(Color.WHITE);
            btn1.setBackground(Color.decode("#2E75B6"));
			btn1.addActionListener(this);
            c.add(btn1);

            btn2 = new JButton("Sign up");
            btn2.setBounds(800, 325, 215, 50);
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
            public void actionPerformed( ActionEvent ae)
		    {
	    
		        String command = ae.getActionCommand();
                if (btn1.getText().equals(command))
		        {		 
		            if(ae.getSource()==btn1)
		            {
			            boolean matched = false; 
			            String u = tf1.getText();
		                String p = tf2.getText(); 
			 
			            try
			            {
				            FileReader fr = new FileReader(".\\Data\\userinfo.txt");
				            BufferedReader br = new BufferedReader(fr);
				            String line;

				            while((line=br.readLine())!=null)
				            {
					            String[] words = line.split("\t");
					            String check_user_txt= words[0];
					            String check_password_txt = words[2];
				
				                if (u.equals(check_user_txt) && p.equals(check_password_txt))
				                {
					                matched = true;
					                break;
				                }
				            }
                            fr.close();	
			            }    
			            catch(Exception e){}

			            if (matched)
			            {
				            JOptionPane.showMessageDialog(null,"login successfully");
				
				
			                Home h = new Home();
			                h.setVisible(true);
			                this.setVisible(false);
			            }
						else if (u.equals("admin")&& p.equals("adminpass"))
						{
							JOptionPane.showMessageDialog(null,"admin login successfully");
				
				
			                admin a = new admin();
			                a.setVisible(true);
		    	            this.setVisible(false);
						}
                        else
			            {
					        JOptionPane.showMessageDialog(null,"invalid id or password");
					    }
			        } 
				}	
		            else if (btn2.getActionCommand().equals(command))
		            {
			            signin s = new signin();
			            s.setVisible(true);
		    	        this.setVisible(false);	
		            }		
	    	        else if (btn3.getActionCommand().equals(command))
		            {
		    	        admin a = new admin();
			            a.setVisible(true);
		    	        this.setVisible(false);
		            }				
            }
            public static void main(String[] args) 
	        {

                login l = new login();
                l.setVisible(true);
            }
        
	}
   
