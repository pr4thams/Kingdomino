import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.Random;
public class ChangePlayerSettingsGUI
{
    private JFrame frame;
    
    private JPanel panel1;
    private JPanel panel2;
    
    private JLabel label1;
    
    private JButton button1;
    private JButton button2;
    
    int num;
    //public String numplayers;
    public ChangePlayerSettingsGUI(int num)
    {
    	this.num = num;
        frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2,0));
        
        panel1 = new JPanel();
        label1 = new JLabel ("Confirm Player Settings?");
        panel1.add(label1);
        contentPane.add(panel1);
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(0,2));
        button1 = new JButton("Change Settings");
        button1.addActionListener(event -> Back(frame));
        button2 = new JButton("Confirm");
        button2.addActionListener(event -> Gameboard(frame));
        panel2.add(button1);
        panel2.add(button2);
        contentPane.add(panel2);
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(800,600);//frame.pack();
    }
    
    public void Back(JFrame frame){
        frame.setVisible(false);
        new GameSetupGUI();
    }
    
    public void Gameboard(JFrame frame){
    	frame.setVisible(false);
    	new GameTheme().changeTheme(num);
    }
}