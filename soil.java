import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;


public class soil extends JFrame implements ActionListener
{
	Container c;
	JLabel soil_result_lbl,n_lbl,p_lbl,k_lbl,ph_lbl;
	JTextField n_txt,p_txt,k_txt,ph_txt;
	JButton report_btn,back_btn,nBtn;
	ImageIcon icon;
	Font f1, f2, f3, f4, f5, f6;
	Cursor cursor;
	public soil()
	{
	    this.setSize(700,600);
        this.setTitle("Soil test report"); 
	    this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
	 
	 
	    c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));
		
		icon = new ImageIcon(getClass().getResource("/images/3.png"));
        this.setIconImage(icon.getImage());
		
		f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f4 = new Font("Segoe UI", Font.PLAIN, 24);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);
		
	 
	    soil_result_lbl = new JLabel("SOIL TEST RESULT");
	    soil_result_lbl.setBounds(230,50,250,30);
	    soil_result_lbl.setFont(f2);
	    c.add(soil_result_lbl);
	 
	 
	    n_lbl = new JLabel("Nitrogen");
	    n_lbl.setBounds(140,120,290,30);
	    n_lbl.setFont(f4);
	    c.add(n_lbl);
	    n_txt = new JTextField();
	    n_txt.setBounds(290,120,250,30);
	    c.add(n_txt);
	 
	 
	    p_lbl = new JLabel("Phosphorus");
	    p_lbl.setBounds(140,190,290,30);
	    p_lbl.setFont(f4);
	    c.add(p_lbl);
	    p_txt = new JTextField();
	    p_txt.setBounds(290,190,250,30);
	    c.add(p_txt);
	 
	 
	    k_lbl = new JLabel("Potassium");
	    k_lbl.setBounds(140,260,290,30);
	    k_lbl.setFont(f4);
	    c.add(k_lbl);
	    k_txt = new JTextField();
	    k_txt.setBounds(290,260,250,30);
	    c.add(k_txt);
	 
	 
	    ph_lbl = new JLabel("PH");
	    ph_lbl.setBounds(140,330,250,30);
	    ph_lbl.setFont(f4);
	    c.add(ph_lbl);
	    ph_txt = new JTextField();
	    ph_txt.setBounds(290,330,250,30);
	    c.add(ph_txt);
	    
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
	    report_btn = new JButton("Report Generate");
	    report_btn.setBackground(Color.decode("#2E75B6"));
		report_btn.setForeground(Color.WHITE);
	    report_btn.setFont(f4);
	    report_btn.setBounds(290,400,250,40);
	    report_btn.addActionListener(this);
	    c.add(report_btn);
	 
	 
	    back_btn = new JButton("Back");
	    back_btn.setBackground(Color.decode("#2E75B6"));
		back_btn.setForeground(Color.WHITE);
	    back_btn.setFont(f4);
	    back_btn.setBounds(140,400,100,40);
	    back_btn.addActionListener(this);
	    c.add(back_btn);
		
		nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
	 
	
	 
	}
	public void actionPerformed(ActionEvent ae)
	{
	    String command = ae.getActionCommand();
        if (ae.getSource()==report_btn)//report_btn.get().equals(command))
	    {
		   if (ae.getSource()==report_btn)
		   {
		    
			
		    String N = n_txt.getText();
			float n = Float.parseFloat(N);
	        String P = p_txt.getText();
			float p = Float.parseFloat(P);
	        String K = k_txt.getText();
			float k = Float.parseFloat(K);
		    String PH= ph_txt.getText();
			float ph = Float.parseFloat(PH);
		
		   
		    
		      float s,na,pa,ka;
			  float small;
			
		        if (n<p)
			    {
				    if(p<k){s=n; }
				    else 
				    {
					    if(n<k){s=n;}
					    else
						s=n;
						
				    }
		     	}
		    	else
		    	{
		    		if (p<k){s=p;}
		     		else
					s=k;
			    }
				
		    	na= n/s;
				pa=p/s;
				ka=k/s;
		   
        
		 	if (na==4 && pa==2 && ka==1)
			{   if (ph<6.5)
				{
					JOptionPane.showMessageDialog(null,"Your soil ph is lower."+" Which means your soil is Acidic."+" Use LIME or WOOD ASH.Nonetheless, do not use ash in a field with plant."+" Ash should be worked into soil before planting.");
				}
				else if (ph<=6.5 || ph<=7)
				{
					JOptionPane.showMessageDialog(null,"Your soil has the perfect ph value for need for plants.So you do not need to worry about any acidic or basic problem in your soil." );
				}
				else if (ph>7)
				{
					JOptionPane.showMessageDialog(null, "Your soil ph is Higher. Which means your soil is Basic. To reduce basicity in your soil use Aluminium Sulphate or Sulfur. It is best to reduce your soil ph before planting.");
				}
				report1 r = new report1();
				this.setVisible(false);
				r.setVisible(true);
			}
			else if (na<4 && pa<2 && ka<1)
			{
				if (ph<6.5)
				{
					JOptionPane.showMessageDialog(null,"Your soil ph is lower."+" Which means your soil is Acidic."+" Use LIME or WOOD ASH.Nonetheless, do not use ash in a field with plant."+" Ash should be worked into soil before planting.");
				}
				else if (ph>=6.5 || ph<=7)
				{
					JOptionPane.showMessageDialog(null,"Your soil has the perfect ph value for need for plants.So you do not need to worry about any acidic or basic problem in your soil." );
				}
				else if (ph>7)
				{
					JOptionPane.showMessageDialog(null, "Your soil ph is Higher. Which means your soil is Basic. To reduce basicity in your soil use Aluminium Sulphate or Sulfur. It is best to reduce your soil ph before planting.");
				}
				report r = new report();
				this.setVisible(false);
				r.setVisible(true);
			}
			else if (na>4 && pa>2 && ka>1)
			{
				if (ph<6.5)
				{
					JOptionPane.showMessageDialog(null,"Your soil ph is lower."+" Which means your soil is Acidic."+" Use LIME or WOOD ASH.Nonetheless, do not use ash in a field with plant."+" Ash should be worked into soil before planting.");
				}
				else if (ph>=6.5 || ph<=7)
				{
					JOptionPane.showMessageDialog(null,"Your soil has the perfect ph value for need for plants.So you do not need to worry about any acidic or basic problem in your soil." );
				}
				else if (ph>7)
				{
					JOptionPane.showMessageDialog(null, "Your soil ph is Higher. Which means your soil is Basic. To reduce basicity in your soil use Aluminium Sulphate or Sulfur. It is best to reduce your soil ph before planting.");
				}
				report2 r = new report2();
				this.setVisible(false);
			    r.setVisible(true);
		    }
		}
		}
		

	     else if (back_btn.getText().equals(command))
	    {
		    Home h = new Home();
			this.setVisible(false);
			h.setVisible(true);
	    } 
	}	
	
	  
        public static void main(String args[])
	    {
		    soil s = new soil();
            s.setVisible(true);		
	    }	
	
	
	
}