package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-50, 0, 800, 500);
        add(image);
        
        JLabel heading = new JLabel("QuizGenius");
        heading.setBounds(750, 100, 300, 45);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 50));
        heading.setForeground(Color.black);
        add(heading);