package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.IOException;

public class Field extends JFrame implements ActionListener {
    
    public JButton f1,f2,f3,back2;
    Graphics g;
     String name;
       
  
    
    @SuppressWarnings("LeakingThisInConstructor")
    Field(String name) throws IOException
    {   this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/vvv.jpg"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(0, -100, 750, 750);
        add(image2);
        