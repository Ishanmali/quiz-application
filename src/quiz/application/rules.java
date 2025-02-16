package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        /* ImageIcon i1L = new ImageIcon(ClassLoader.getSystemResource("icons/ABC.jpg"));
        JLabel image = new JLabel(i1L);
        image.setBounds(-50, 0, 1000, 615);
        add(image);*/
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Show ,read the rules");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 16));
        rules.setForeground(color.RED);
        rules.setText(