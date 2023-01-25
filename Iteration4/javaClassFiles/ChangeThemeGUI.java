import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.Random;

public class ChangeThemeGUI
{
    private JFrame frame;
    
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel rightPanel;
    
    private JPanel centerPanelTop;
    private JPanel centerPanelMiddle;
    private JPanel centerPanelBottom;
    
    private JLabel label;
    
    private ButtonGroup group;
    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;
    
    private JButton buttonConfirm;
    
    public ChangeThemeGUI()
    {
        frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0,3));
        
        leftPanel = new JPanel();
        contentPane.add(leftPanel);
        
        centerPanel = new JPanel();
        contentPane.add(centerPanel);
        centerPanel.setLayout(new GridLayout(3,0));
        
        centerPanelTop = new JPanel();
        label = new JLabel ("Choose Theme");
        centerPanelTop.add(label);
        centerPanel.add(centerPanelTop);
        
        centerPanelMiddle = new JPanel();
        centerPanelMiddle.setLayout(new GridLayout(4,0));
        centerPanel.add(centerPanelMiddle);
        
        group = new ButtonGroup();
        button1 = new JRadioButton ("Normal");
        button2 = new JRadioButton ("Protan");
        button3 = new JRadioButton ("Deutran");
        button4 = new JRadioButton ("Tritan");
        button1.setActionCommand("Normal");
        button2.setActionCommand("Protan");
        button3.setActionCommand("Deutran");
        button4.setActionCommand("Tritan");
        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        centerPanelMiddle.add(button1);
        centerPanelMiddle.add(button2);
        centerPanelMiddle.add(button3);
        centerPanelMiddle.add(button4);
        button1.setSelected(true);
        
        centerPanelBottom = new JPanel();
        centerPanel.add(centerPanelBottom);
        buttonConfirm = new JButton("Confirm");
        centerPanelBottom.add(buttonConfirm);
        buttonConfirm.addActionListener(event -> Confirm(frame));
        rightPanel = new JPanel();
        contentPane.add(rightPanel);
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }
    
    public void Confirm(JFrame frame){
        if (group.getSelection().getActionCommand() == "Normal"){
            frame.setVisible(false);
            GameTheme.theme = 'n';
            new MainMenuGUI();  
        }
        else if (group.getSelection().getActionCommand() == "Protan"){
            frame.setVisible(false);
            GameTheme.theme = 'p';
            new MainMenuGUI();
        }
        
        else if (group.getSelection().getActionCommand() == "Deutran"){
            frame.setVisible(false);
            GameTheme.theme = 'd';
            new MainMenuGUI();
        }
        else if (group.getSelection().getActionCommand() == "Tritan"){
            frame.setVisible(false);
            GameTheme.theme = 't';
            new MainMenuGUI();
        }
    }
}
