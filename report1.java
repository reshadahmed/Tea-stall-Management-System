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

    public class report1 extends JFrame implements ActionListener
    {

        Container c;
        ImageIcon icon,logo;
        JLabel label1,imgLabel,lbl;
        Font f1, f2;
        JButton btn1, nBtn;
        Cursor cursor;
		JScrollPane scroll;
		JTextArea txtarea;
    

        report1() 
        {
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Report");
            this.setSize(700, 600);
            this.setLocationRelativeTo(null);
            this.setResizable(false);

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.decode("#F2F2F2"));
			
            f2 = new Font("Segoe UI Black", Font.PLAIN, 30);
			f1 = new Font("Segoe UI Black", Font.PLAIN, 17);

            
            icon = new ImageIcon(getClass().getResource("/images/3.png"));
            this.setIconImage(icon.getImage());

            logo = new ImageIcon(getClass().getResource("/images/r.png"));
            imgLabel = new JLabel(logo);
            imgLabel.setBounds(290, 10, logo.getIconWidth(), logo.getIconHeight());
            c.add(imgLabel);
			
			lbl = new JLabel("Generated Report");
			lbl.setBounds(210,125,350,50);
			lbl.setFont(f2);
			c.add(lbl);
			
			
			txtarea = new JTextArea("Your N-P-K ratio is  4-2-1. To fertilize "+"your field soil is standard for planting."+" In case of preferred N-P-K ratio for a perticuler plant , "+"use N-P-K as you have been told to for getting a great result."+"\\n\n" );
			//txtarea. setPreferredSize(new Dimension(TEXT_AREA_WIDTH,DEFAULT_HEIGHT));
			txtarea.setBounds(70,200,550,250);
			txtarea.setLineWrap(true);
			txtarea.setEditable(false);
			txtarea.setFont(f1);
			c.add(txtarea);
			
			
	
			
            cursor = new Cursor(Cursor.HAND_CURSOR);
			
			btn1 = new JButton("Back");
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
				soil s = new soil();
                s.setVisible(true);	
				
			}
		}
		public static void main(String []args)
		{
			report1 r = new report1();
			r.setVisible(true);
		}
	}	