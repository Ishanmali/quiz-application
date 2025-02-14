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

        
        questions[8][0] = "What is the full form of IPL?";
        questions[8][1] = "Indian Premier League";
        questions[8][2] = "Indo-Pakistan League";
        questions[8][3] = "International Premier League";
        questions[8][4] = "Indian Players League";

        questions[3][0] = "ICC and BCCI are the controlling authorities for which sports in India and the World??";
        questions[3][1] = "Volleyball";
        questions[3][2] = "Football";
        questions[3][3] = "Cricket";
        questions[3][4] = "Hockey";

        answers[0][1] = "AUG 29";
        answers[1][1] = "2012";
        answers[2][1] = "Ashok Chakra";
        answers[3][1] = "Cricket";
        answers[4][1] = "2019";
        answers[5][1] = "Herschelle Gibs";
        answers[6][1] = "Bayern Munich";
        answers[7][1] = "Karnam Malleswari";
        answers[8][1] = "Indian Premier League";
        answers[9][1] = "The International Tennis Federation The (ITF)";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

         opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);