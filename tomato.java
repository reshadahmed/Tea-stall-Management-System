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

    public class tomato extends JFrame implements ActionListener
    {

        Container c;
        ImageIcon icon,logo;
        JLabel label1,imgLabel,lbl;
        Font f1, f2;
        JButton btn1, nBtn;
        Cursor cursor;
		JScrollPane scroll;
		JTextArea txtarea;
    

        tomato() 
        {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("crops\\carrot");
            this.setSize(700, 600);
            this.setLocationRelativeTo(null);
            this.setResizable(false);

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.decode("#F2F2F2"));
			
            f2 = new Font("Segoe UI Black", Font.PLAIN, 35);
			f1 = new Font("Segoe UI Black", Font.PLAIN, 17);

            
            icon = new ImageIcon(getClass().getResource("/images/3.png"));
            this.setIconImage(icon.getImage());

            lbl = new JLabel("Know - N - Grow");
			lbl.setBounds(210,70,350,50);
			lbl.setFont(f2);
			c.add(lbl);
			
			
			txtarea = new JTextArea("Name: tomato"+"\nScientific name:Solanum melongena"+"\nSoil:Loamy soil that are rich inhumus"+"\nFertilizer : 5-10-5 fertilizer (when planting)"+"\nHervest :120-150 days after planting"+"\nSeason: Khafi ");
			
			txtarea.setBounds(70,200,550,250);
			txtarea.setLineWrap(true);
			txtarea.setEditable(false);
			txtarea.setFont(f1);
			c.add(txtarea);
			
			
	
			
            cursor = new Cursor(Cursor.HAND_CURSOR);
			
			btn1 = new JButton("close");
            btn1.setBounds(250, 500, 200, 35);
            btn1.setFont(f1);
            btn1.setCursor(cursor);
            btn1.setForeground(Color.WHITE);
            btn1.setBackground(Color.decode("#2E75B6"));
		    btn1.addActionListener(this);
            c.add(btn1);
			
			nBtn = new JButton("");
            nBtn.setBounds(0, 0, 0, 0);
            c.add(nBtn);
			
		}
		public void actionPerformed(ActionEvent ae)
		{
			String command = ae.getActionCommand();
			if(btn1.getActionCommand().equals(command))
			{
				this.setVisible(false);
				crop c = new crop();
			    c.setVisible(true);
				
			}
		}
		public static void main(String []args)
		{
			tomato t = new tomato();
			t.setVisible(true);
		}
	}	