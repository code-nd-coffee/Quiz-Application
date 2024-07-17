package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Score extends JFrame implements ActionListener{
    String urName;
    int score;
    JButton playAgain, exit;
    
    Score(String urName, int score){
        this.urName = urName;
        this.score = score;
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        JLabel heading = new JLabel("Thank You " + urName + " for playing Simple Minds");
        heading.setFont(new Font("Viner Hand ITC", Font.PLAIN, 26));
        heading.setBounds(45, 30, 700, 30);
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel lScore = new JLabel("Your Score is " + score);
        lScore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lScore.setBounds(350, 200, 300, 30);
        add(lScore);
        
        playAgain = new JButton("Play Again");
        playAgain.setFont(new Font("Tahoma", Font.PLAIN, 16));
        playAgain.setBounds(350, 270, 120, 30);
        playAgain.setBackground(new Color(30, 144, 255));
        playAgain.setForeground(Color.WHITE);
        playAgain.addActionListener(this);
        add(playAgain);
        
        exit = new JButton("Exit");
        exit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        exit.setBounds(490,270, 120, 30);
        exit.setBackground(new Color(30, 144, 255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setBounds(400, 150, 750, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == playAgain){
            setVisible(false);
            new Login();
        } else if(ae.getSource() == exit){
            System.exit(0);
        }
        
    }
    public static void main(String [] args){
        new Score("User", 0);
    }
}
