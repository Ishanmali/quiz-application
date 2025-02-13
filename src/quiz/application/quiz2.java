package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz2 extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    public String name;

     
    Quiz2(String name) {
        this.name = name;
        setBounds(50, 0, 1500,700 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1500, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
         
        questions[0][0] = " When is National  Day celebrated in sri lanka??";
        questions[0][1] = "Feb 28";
        questions[0][2] = "AUG 29";
        questions[0][3] = "FEB 04";
        questions[0][4] = "feb 02";

        questions[1][0] = "When was National Sports Day first celebrated in stl lanka??";
        questions[1][1] = "2012";
        questions[1][2] = "2013";
        questions[1][3] = "2011";
        questions[1][4] = "2022";

        
        questions[5][0] = "Who becomes the first cricketer who has hit the six sixes in an over in One Day Internation (50-50) cricket?";
        questions[5][1] = "Kieron Pollard";
        questions[5][2] = "Herschelle Gibs";
        questions[5][3] = "Viv Richard";
        questions[5][4] = "Yuvraj Singh";

        
        questions[6][0] = "Which of the following football club wins FIFA Club World Cup 2020?";
        questions[6][1] = "Bayern Munich";
        questions[6][2] = "Manchester United";
        questions[6][3] = "FC Barcelona";
        questions[6][4] = "Juventus F. C";