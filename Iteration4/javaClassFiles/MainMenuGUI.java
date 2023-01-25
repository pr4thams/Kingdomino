import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenuGUI
{
    private JFrame frame;
    
    private JPanel centerPanel;
    private JPanel rightPanel;
    private JPanel emptyPanel;
    
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    
    public MainMenuGUI()
    {
        frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0,3));
        
        emptyPanel = new JPanel();
        contentPane.add(emptyPanel);//,BorderLayout.WEST);
        
        centerPanel = new JPanel();
        contentPane.add(centerPanel);// ,BorderLayout.CENTER);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS ));
        
        button1 = new JButton("New Game");
        button1.setPreferredSize(new Dimension(100,20));
        button2 = new JButton("Load Game");
        button2.setPreferredSize(new Dimension(100,20));
        button3 = new JButton("Change Theme");
        button3.setPreferredSize(new Dimension(100,20));
        button4 = new JButton("Instructions");
        button4.setPreferredSize(new Dimension(100,20));
        button1.addActionListener(event -> NewGame(frame));
        button2.addActionListener(event -> LoadGame());
        button3.addActionListener(event -> changeTheme(frame));
        button4.addActionListener(event -> Instructions(frame));
        
        centerPanel.add(button1);
        centerPanel.add(button2);
        centerPanel.add(button3);
        centerPanel.add(button4);
        
        rightPanel = new JPanel();
        contentPane.add(rightPanel );//,BorderLayout.EAST);
        rightPanel.setLayout(new BorderLayout(12,12));
        
        button5 = new JButton("Quit");
        rightPanel.add(button5 ,BorderLayout.SOUTH);
        button5.addActionListener(event -> Quit());
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(800,600); //frame.pack();
    }
    
    public void NewGame(JFrame frame){
        frame.setVisible(false);
        new GameSetupGUI();
    }
    
    public void Instructions(JFrame frame){
        frame.setVisible(false);
        new InstructionsGUI();
    }
    
    public void LoadGame()
    {
        button2.setText("Feature not yet available");
    }
    
    public void changeTheme(JFrame frame){
        frame.setVisible(false);
        new ChangeThemeGUI();
    }
    
    public void Quit()
    {
        System.exit(0);
    }
    
}