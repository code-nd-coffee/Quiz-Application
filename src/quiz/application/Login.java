package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField urName;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 500);
        add(l1);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        heading.setBounds(750, 60, 300, 45);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        name.setBounds(810, 150, 300, 20);
        add(name);
        
        urName = new JTextField();
        urName.setBounds(735, 200, 300, 25);
        urName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(urName);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 265, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 265, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rules){
            String name = urName.getText();
            setVisible(false);
            new Rules(name);
            
        } else if(e.getSource() == back){
            System.exit(0);
        }
        
    }
    public static void main(String []args){
        new Login();
    }
}
