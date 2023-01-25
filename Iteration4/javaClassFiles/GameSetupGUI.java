import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;  // MMCU //
import java.util.Collections;
import javax.swing.ButtonGroup;

public class GameSetupGUI
{
    private JFrame frame;
    
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel rightPanel;
    
    private JPanel centerPanelTop;
    private JPanel centerPanelMiddle;
    private JPanel centerPanelBottom;
    
    private JPanel panel11;
    private JPanel panel12;
    
    private JPanel panel21;
    private JPanel panel22;
    
    private JPanel panel31;
    private JPanel panel32;
    
    private JPanel panel321;
    private JPanel panel322;
    
    private JButton backButton;
    private JButton quitButton;
    protected int n;
    public JRadioButton player2Button;
    public JRadioButton player4Button;
    public String numplayers;
    public JRadioButton button1;
    public JRadioButton button2;
    public JRadioButton button3;
    public JRadioButton button4;
    public ButtonGroup group1;
    public ButtonGroup group2;
    public ButtonGroup group3;
    public JRadioButton buttonEasy;
    public JRadioButton buttonHard;
    public JButton buttonStart;
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public GameSetupGUI()
    {
        frame = new JFrame("Game Set Up GUI");
        numplayers = "4";
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0,3));
        
        leftPanel = new JPanel();
        contentPane.add(leftPanel);
        leftPanel.setLayout(new BorderLayout());
        JPanel psouth=new JPanel();
        JPanel psouth_left=new JPanel();
        JPanel psouth_middle=new JPanel();
        JPanel psouth_right=new JPanel();
        psouth.setLayout(new GridLayout(0,3));
        backButton =new JButton("Back");
        psouth_middle.add(backButton);
        psouth.add(psouth_left);
        psouth.add(psouth_middle);
        psouth.add(psouth_right);
        //backButton =new JButton("Back");
        leftPanel.add(psouth, BorderLayout.SOUTH);
        backButton.setPreferredSize(new Dimension(100,40));
        backButton.addActionListener(event -> Back(frame));
        //leftPanel.add(backButton, BorderLayout.SOUTH);
        
        centerPanel = new JPanel();
        contentPane.add(centerPanel);
        centerPanel.setLayout(new GridLayout(3,0));
        
        centerPanelTop = new JPanel();
        centerPanelTop.setLayout(new GridLayout(2,0));
        panel11 = new JPanel();
        centerPanelTop.add(panel11);
        label1 = new JLabel ("Choose the number of players");
        panel11.add(label1);
        panel12 = new JPanel();
        centerPanelTop.add(panel12);
        panel12.setLayout(new GridLayout(0,2));
        player2Button = new JRadioButton("2 Players");
        player2Button.setActionCommand("2");
        player4Button = new JRadioButton("4 Players");
        player4Button.setActionCommand("4");
        group3 = new ButtonGroup();
        group3.add(player2Button);
        group3.add(player4Button);
        player2Button.setSelected(true);
        panel12.add(player2Button);
        panel12.add(player4Button);
        centerPanel.add(centerPanelTop);
        
        
        centerPanelMiddle = new JPanel();
        centerPanelMiddle.setLayout(new GridLayout(2,0));
        panel21 = new JPanel();
        panel22 = new JPanel();
        centerPanelMiddle.add(panel21);
        centerPanelMiddle.add(panel22);
        label2 = new JLabel ("How many people are playing?");
        panel21.add(label2);
        panel22.setLayout(new GridLayout(0,4));
        group1 = new ButtonGroup();
        button1 = new JRadioButton ("1");
        button2 = new JRadioButton ("2");
        button3 = new JRadioButton ("3");
        button4 = new JRadioButton ("4");
        group1.add(button1);
        group1.add(button2);
        group1.add(button3);
        group1.add(button4);
        button1.setSelected(true);
        panel22.add(button1);
        panel22.add(button2);
        panel22.add(button3);
        panel22.add(button4);
        centerPanel.add(centerPanelMiddle);
        
        
        centerPanelBottom = new JPanel();
        centerPanelBottom.setLayout(new GridLayout(2,0));
        panel31 = new JPanel();
        panel32 = new JPanel();
        centerPanelBottom.add(panel31);
        centerPanelBottom.add(panel32);
        label3 = new JLabel ("Select game difficulty");
        panel31.add(label3);
        panel32.setLayout(new GridLayout(0,2));
        panel321 = new JPanel();
        panel321.setLayout(new GridLayout(2,0));
        buttonEasy = new JRadioButton ("Easy");
        buttonHard = new JRadioButton ("Hard");
        group2 = new ButtonGroup();
        
        panel321.add(buttonEasy);
        panel321.add(buttonHard);
        group2.add(buttonEasy);
        group2.add(buttonHard);
        buttonEasy.setSelected(true);
        panel322 = new JPanel();
        panel322.setLayout(new BorderLayout());
        buttonStart = new JButton ("Start");
        buttonStart.setPreferredSize(new Dimension(50,20));
        buttonStart.addActionListener(event -> Start(frame));
        panel322.add(buttonStart);
        panel32.add(panel321);
        panel32.add(panel322);
        centerPanel.add(centerPanelBottom);
        
        rightPanel = new JPanel();
        contentPane.add(rightPanel);
        rightPanel.setLayout(new BorderLayout());
        JPanel psouth2=new JPanel();
        JPanel psouth2_left=new JPanel();
        JPanel psouth2_middle=new JPanel();
        JPanel psouth2_right=new JPanel();
        psouth2.setLayout(new GridLayout(0,3));
        quitButton =new JButton("Quit");
        psouth2_middle.add(quitButton);
        psouth2.add(psouth2_left);
        psouth2.add(psouth2_middle);
        psouth2.add(psouth2_right);
        //backButton =new JButton("Back");
        rightPanel.add(psouth2, BorderLayout.SOUTH);
        quitButton.setPreferredSize(new Dimension(100,40));
        quitButton.addActionListener(event -> Quit());
        //rightPanel.add(quitButton, BorderLayout.SOUTH);
        
        createShuffledDrawingPile(DrawingPile.drawingPile); // MMCU //
        create_and_sort_set(Set.set); // MMCU //
        
        /*System.out.print("Shuffled Drawing Pile after creating set: [ ");     /// CODE FOR DISPLAYING SHUFFLED DRAWING PILE ON CONSOLE///
    	for(int i = 0; i <= DrawingPile.drawingPile.size()-2; i++)
    	{
    		System.out.print(DrawingPile.drawingPile.get(i).getNumber() + ", ");
    	}
    	System.out.println(DrawingPile.drawingPile.get(DrawingPile.drawingPile.size()-1).getNumber() + " ]");*/
    	
    	//System.out.println("Order before shuffle: " + PlayingOrder.order);
        new PlayingOrder().shuffle();  // MMCU //
        //System.out.println("Order after shuffle: " + PlayingOrder.order);
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(800,600);// frame.pack();
    }

    public void Quit()
    {
        System.exit(0);
    }
    
    public void Back(JFrame frame){
        frame.setVisible(false);
        new MainMenuGUI();
    }
    
    public int getNumPlayers(){
            return n;
        }
    
    public void Start(JFrame frame){
        n = player4Button.isSelected() ? 4 : 2;
        frame.setVisible(false);
        new ChangePlayerSettingsGUI(n);
}
    
    private void createShuffledDrawingPile(ArrayList<Domino> pile)  // ye sara method MMCU //
    {
    	// create and add 48 dominos
    	for(int i = 1; i <= 48; i++)
    	{
    		DrawingPile.drawingPile.add(new Domino(i));
    	}
    	
    	System.out.print("Original Pile: [ ");     /// CODE FOR DISPLAYING ORIGINAL DRAWING PILE ON CONSOLE///
    	for(int i = 0; i <= DrawingPile.drawingPile.size()-2; i++)
    	{
    		System.out.print(DrawingPile.drawingPile.get(i).getNumber() + ", ");
    	}
    	System.out.println(DrawingPile.drawingPile.get(DrawingPile.drawingPile.size()-1).getNumber() + " ]");
    	
    	// shuffle the drawingPile
    	Collections.shuffle(DrawingPile.drawingPile);
    	
    	System.out.print("Shuffled Pile: [ ");     /// CODE FOR DISPLAYING SHUFFLED DRAWING PILE ON CONSOLE///
    	for(int i = 0; i <= DrawingPile.drawingPile.size()-2; i++)
    	{
    		System.out.print(DrawingPile.drawingPile.get(i).getNumber() + ", ");
    	}
    	System.out.println(DrawingPile.drawingPile.get(DrawingPile.drawingPile.size()-1).getNumber() + " ]");
    }
    
    private void create_and_sort_set(ArrayList<Domino> set)  // ye sara method MMCU //
    {
    	// drawing from the pile and adding 1st four dominos to the set
    	for(int i = 0; i <= 3; i++)
    	{
    		set.add(DrawingPile.drawingPile.get(0));
    		DrawingPile.drawingPile.remove(0);
    	}
    	
    	System.out.print("Original Set: [ ");     /// CODE FOR DISPLAYING ORIGINAL SET ON CONSOLE///
    	for(int i = 0; i <= 2; i++)
    	{
    		System.out.print(set.get(i).getNumber() + ", ");
    	}
    	System.out.println(set.get(3).getNumber() + " ]");
    	
    	// sorting the set
    	ArrayList<Integer> numbers = new ArrayList<Integer>(4);
    	ArrayList<Domino> dup_set = new ArrayList<Domino>(4);
    	
    	for(int i = 0; i <= 3; i++)
    	{
    		numbers.add(set.get(i).getNumber());
    	}
    	
    	numbers.sort(null);
    	
    	for(int i = 0; i <= 3; i++)
    	{
    		for(int j = 0; j <= 3; j++)
    		{
    			if (set.get(j).getNumber() == numbers.get(i))
    				dup_set.add(set.get(j));
    		}
    	}
    	
    	for(int i = 0; i <= 3; i++)
    	{
    		set.add(i, dup_set.get(i));
    	}
    	
    	
    	System.out.print("Sorted Set: [ ");		 /// CODE FOR DISPLAYING SORTED SET ON CONSOLE///
    	for(int i = 0; i <= 2; i++)
    	{
    		System.out.print(set.get(i).getNumber() + ", ");
    	}
    	System.out.println(set.get(3).getNumber() + " ]");
    }
    
    
}
