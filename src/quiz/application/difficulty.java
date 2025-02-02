package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class difficulty extends JFrame implements ActionListener{
    public JButton easy,hard,medium;
        difficulty(){
             getContentPane().setBackground(Color.white);
        setLayout(null);
        
       ImageIcon i1a = new ImageIcon(ClassLoader.getSystemResource("icons/555.jpg"));
        JLabel image = new JLabel(i1a);
        image.setBounds(-50, 0, 800, 800);
        add(image);
        
        setSize(1200, 900);
        setLocation(0, 0);
        setVisible(true);
        JLabel name2 = new JLabel("CHOOSE DIFFICULTY");
        name2.setBounds(735, 150, 300, 50);
        name2.setFont(new Font("ALGERIAN", Font.BOLD, 30));
        name2.setForeground(Color.black);
        add(name2);
        
        
        easy=new JButton("EASY");
       
        easy.setBounds(735, 250, 250, 50);
        easy.setBackground(Color.GRAY);
        easy.setForeground(Color.WHITE);
        easy.addActionListener((ActionListener) this);
        add(easy);
        
        medium = new JButton("MEDIUM");
        medium.setBounds(735, 350, 250, 50);
        medium.setBackground(Color.GRAY);
        medium.setForeground(Color.WHITE);
        medium.addActionListener((ActionListener) this);
        add(medium);
        
           hard= new JButton("HARD");
        hard.setBounds(735, 450, 250, 50);
        hard.setBackground(Color.GRAY);
        hard.setForeground(Color.WHITE);
        hard.addActionListener((ActionListener) this);
        add(hard);
}
public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == easy) {
            try {
                setVisible(false);
                new Field("user");
            } catch (IOException ex) {
                Logger.getLogger(difficulty.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else if (ae.getSource() == medium) {
            setVisible(false);
            try {
                new Field("user");
            } catch (IOException ex) {
                Logger.getLogger(difficulty.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ae.getSource() == hard) {
            setVisible(false);
            try {
                new Field("user");
            } catch (IOException ex) {
                Logger.getLogger(difficulty.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        else  {
            setVisible(false);
           
        }}
public static void main(String[] args) {
        new difficulty();
    
}

    }
    