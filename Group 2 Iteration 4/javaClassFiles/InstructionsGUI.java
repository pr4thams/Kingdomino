 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.Random;

public class InstructionsGUI
{
    private JFrame frame;
    
    private JPanel centerPanel;
    private JPanel rightPanel;
    private JPanel emptyPanel;
    
    private JButton button1;
    private JButton button2;
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    public InstructionsGUI()
    {
        frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0,3));
        
        emptyPanel = new JPanel();
        contentPane.add(emptyPanel);//,BorderLayout.WEST);
        
        centerPanel = new JPanel();
        contentPane.add(centerPanel);// ,BorderLayout.CENTER);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS ));
        
        label1=new JLabel("How to play Kingdomino?");
        label2=new JLabel("- Rules of the game to be provided");
        label3=new JLabel("- Instructions of the gameplay buttons and ");
        label4=new JLabel("their actions provided");
        
        button1=new JButton("OK");
        button2=new JButton("Quit");
        button1.addActionListener(event -> OK());
        rightPanel = new JPanel();
        //contentPane.add(rightPanel);//,BorderLayout.EAST);
        rightPanel.setLayout(new BorderLayout(12,12));
        
        button2 = new JButton("Quit");
        rightPanel = new JPanel();
        contentPane.add(rightPanel);
        rightPanel.setLayout(new BorderLayout());
        JPanel psouth2=new JPanel();
        JPanel psouth2_left=new JPanel();
        JPanel psouth2_middle=new JPanel();
        JPanel psouth2_right=new JPanel();
        psouth2.setLayout(new GridLayout(0,3));
        psouth2_middle.add(button2);
        psouth2.add(psouth2_left);
        psouth2.add(psouth2_middle);
        psouth2.add(psouth2_right);
        //backButton =new JButton("Back");
        rightPanel.add(psouth2, BorderLayout.SOUTH);
        button2.setPreferredSize(new Dimension(100,40));
        button2.addActionListener(event -> Quit());
        
        centerPanel.add(label1);
        centerPanel.add(label2);
        centerPanel.add(label3);
        centerPanel.add(label4);
        centerPanel.add(button1);
        
        
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(800,600); //frame.pack();
    }
    
    public void Quit()
    {
        System.exit(0);
    }
    
    public void OK()
    {
        frame.setVisible(false);
        new MainMenuGUI();
    }
}