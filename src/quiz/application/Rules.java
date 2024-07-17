package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{
    JButton start, back;
    String name;
    Rules(String name){
        this.name = name;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Welcome " + name + " to simple minds");
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(new Color(30, 144, 254));
        heading.setBounds(50, 20, 700, 30);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setBounds(20, 90, 700, 350);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a storyteller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have a lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, maybe he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint-hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        start = new JButton("Start");
        start.setBounds(250, 500, 120, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(400, 500, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(800, 650);
        setLocation(350, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == start){
            setVisible(false);
            new Quiz(name);
        } else if(e.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String []args){
        new Rules("User");
    }
    
}
