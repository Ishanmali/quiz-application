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
        
        
                var heading = new JLabel("QuizGenius");
heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 47));
        heading.setForeground(Color.black);
        heading.setBackground(Color.blue);
        add(heading);
        
        JLabel name2 = new JLabel("CHOOSE ANY TYPE OF QUESTIONS");
        name2.setBounds(730, 150, 300, 20);
        name2.setFont(new Font("ALGERIAN", Font.BOLD, 22));
        name2.setForeground(Color. green);
        add(name2);
        
        f1 = new JButton("GENERAL");
        f1.setBounds(735, 250, 250, 50);
        f1.setBackground(Color.gray);
        f1.setForeground(Color.WHITE);
        f1.addActionListener(this);
        add(f1);