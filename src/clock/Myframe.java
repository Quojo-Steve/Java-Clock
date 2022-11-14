/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author AHMED
 */
public class Myframe extends JFrame{
    
    Calendar calendar;
    SimpleDateFormat timeformat, dayformat, dateformat;
    JLabel label, dlabel, datelabel;
    String time, day, date;
    
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,200);
        this.setTitle("Java Clock");
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        
        timeformat = new SimpleDateFormat("HH:mm:ss a");
        dayformat = new SimpleDateFormat("EEEE");
        dateformat = new SimpleDateFormat("MMMM dd, yyyy");

        label = new JLabel();
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Poppins",Font.PLAIN,50));
        label.setBackground(Color.black);
        label.setOpaque(true);
        
        dlabel=new JLabel();
        dlabel.setFont(new Font("Poppins",Font.PLAIN,35));
        
        datelabel=new JLabel();
        datelabel.setFont(new Font("Ink Free",Font.PLAIN,35));
        datelabel.setLocation(50, 200);
        
        
        this.add(label);
        this.add(dlabel);
        this.add(datelabel);
        this.setVisible(true);
        
        settime();
    }
    public void settime(){
        while(true){
        time = timeformat.format(Calendar.getInstance().getTime());
        label.setText(time);
        
        day = dayformat.format(Calendar.getInstance().getTime());
        dlabel.setText(day);
        
        date = dateformat.format(Calendar.getInstance().getTime());
        datelabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Myframe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
