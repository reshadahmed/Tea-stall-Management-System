import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

    public class crop extends JFrame implements ActionListener
    {

        Container c;
        ImageIcon icon, logo,logoo,logooo;
        JLabel label1, imgLabel,imagelbl;
        Font f1, f2, f3, f4, f5, f6;
		JButton btn1;
        JMenuBar mb;
		JMenu crops,season;
		JMenuItem itm1,itm2,itm3,itm4,itm5,itm6;
		
        Cursor cursor;
		
    

        crop() 
        {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Crop info");
            this.setSize(400, 400);
            this.setLocationRelativeTo(null);
            this.setResizable(false);

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.decode("#F2F2F2"));
			
            f2 = new Font("Segoe UI Black", Font.PLAIN, 20);

            
            icon = new ImageIcon(getClass().getResource("/images/3.png"));
            this.setIconImage(icon.getImage());
             
			 
			logo = new ImageIcon(getClass().getResource("/images/21.png"));
            imgLabel = new JLabel(logo);
            imgLabel.setBounds(77, 20, logo.getIconWidth(), logo.getIconHeight());
            c.add(imgLabel); 
            
			mb = new JMenuBar();
			mb.setBounds(180,10,150,30);
			
			crops = new JMenu("Crops");
			crops.setFont(f2);
			
			
			season = new JMenu("Season");
			season.setFont(f2);
			itm1 = new JMenuItem("Carrot");
			itm1.setFont(f2);
			itm1.addActionListener(this);
			
			
			itm2 = new JMenuItem("Potato");
			itm2.setFont(f2);
			itm2.addActionListener(this);
			
			
			itm3 = new JMenuItem("Tomato");
			itm3.setFont(f2);
			itm3.addActionListener(this);
			
			
			itm4 =new JMenuItem("Rabi");
			itm4.setFont(f2);
			itm4.addActionListener(this);
			
			
			itm5 = new JMenuItem("Kharif");
			itm5.setFont(f2);
			itm5.addActionListener(this);
			
			
			crops.add(itm1);
			crops.add(itm2);
			crops.add(itm3);
			season.add(itm4);
			season.add(itm5);
			crops.add(season);
			mb.add(crops);
			this.setJMenuBar(mb);




            
            cursor = new Cursor(Cursor.HAND_CURSOR);
			
			btn1 = new JButton("Back");
            btn1.setBounds(140, 250, 100, 30);
            btn1.setFont(f2);
            btn1.setCursor(cursor);
            btn1.setForeground(Color.WHITE);
            btn1.setBackground(Color.decode("#2E75B6"));
		    btn1.addActionListener(this);
            c.add(btn1);
			
		}
		public void actionPerformed(ActionEvent ae)
		{
			String command = ae.getActionCommand();
			if(btn1.getActionCommand().equals(command))
			{
				Home h = new Home();
				h.setVisible(true);
				this.setVisible(false);
			}
			if (ae.getSource()==itm1)
			{
				carrot c = new carrot();
			    c.setVisible(true);
				this.setVisible(false);
			}
			if (ae.getSource()==itm2)
			{
				potato p = new potato();
			    p.setVisible(true);
				this.setVisible(false);
			}
			if (ae.getSource()==itm3)
			{
				tomato t = new tomato();
			    t.setVisible(true);
				this.setVisible(false);
			}
			if (ae.getSource()==itm4)
			{
				rabi r = new rabi();
			    r.setVisible(true);
				this.setVisible(false);
			}
			if (ae.getSource()==itm5)
			{
				khafi k = new khafi();
			    k.setVisible(true);
				this.setVisible(false);
			}
			
		}
		public static void main(String []args)
		{
			crop c = new crop();
			c.setVisible(true);
		}
	}	