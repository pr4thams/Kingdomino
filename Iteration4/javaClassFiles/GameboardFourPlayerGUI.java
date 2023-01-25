import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import java.util.ArrayList;
import java.util.Random;

public class GameboardFourPlayerGUI implements ActionListener
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JPanel panelPlayer1;
    private JPanel panelPlayer2;
    private JPanel panelPlayer3;
    private JPanel panelPlayer4;
    private JPanel panelBoard;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    
    private JButton button1;
    private JButton button2;
    private JButton button3;
    
    private JButton wheatfield;
    private JButton grasslands;
    private JButton forests1;
    private JButton forests2;
    private JButton forests3;
    private JButton lakes;
    private JButton mines;
    private JButton swamps;
    static JButton start;
    
    private JPanel Domino1;
    private JPanel Domino2;
    private JPanel Domino3;
    private JPanel Domino4;
    
    private JButton KMeeple1;
    private JButton KMeeple2;
    private JButton KMeeple3;
    private JButton KMeeple4;
    private JButton KMeeple5;
    private JButton KMeeple6;
    private JButton KMeeple7;
    private JButton KMeeple8;
    
    private JLabel p1;
    private JLabel p2;
    private JLabel p3;
    private JLabel p4;
    
    ArrayList<Domino> set =  Set.set;
    
    private GridSquare [][] gridSquares;
    /**
     * Constructor for objects of class Gameboard
     */
    public GameboardFourPlayerGUI()
    {
        // initialise instance variables
        frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout(12,12));
        //Panel Player 1
        panelPlayer1=new JPanel();
        contentPane.add(panelPlayer1,BorderLayout.WEST);
        panelPlayer1.setLayout(new BorderLayout());
        
        p1 = new JLabel("Player 1");
        KMeeple1 = new JButton("King Meeple 1");
        KMeeple1.setPreferredSize(new Dimension(100,40));
        KMeeple1.setBackground(Color.PINK);
        KMeeple2 = new JButton("King Meeple 2");
        KMeeple2.setPreferredSize(new Dimension(100,40));
        KMeeple2.setBackground(Color.PINK);
        
        panelPlayer1.add(p1,BorderLayout.CENTER);
        panelPlayer1.add(KMeeple1,BorderLayout.NORTH);
        panelPlayer1.add(KMeeple2,BorderLayout.SOUTH);
        
        //Pamel Player 2
        panelPlayer2=new JPanel();
        contentPane.add(panelPlayer2,BorderLayout.EAST);
        panelPlayer2.setLayout(new BorderLayout());
        
        p2 = new JLabel("Player 2");
        KMeeple3 = new JButton("King Meeple 1");
        KMeeple3.setPreferredSize(new Dimension(100,40));
        KMeeple3.setBackground(Color.YELLOW);
        KMeeple4 = new JButton("King Meeple 2");
        KMeeple4.setPreferredSize(new Dimension(100,40));
        KMeeple4.setBackground(Color.YELLOW);
        
        panelPlayer2.add(p2,BorderLayout.EAST);
        panelPlayer2.add(KMeeple3,BorderLayout.NORTH);
        panelPlayer2.add(KMeeple4,BorderLayout.SOUTH);
        
        //Pamel Player 3
        panelPlayer3=new JPanel();
        contentPane.add(panelPlayer3,BorderLayout.NORTH);
        panelPlayer3.setLayout(new GridLayout(0,3));
        
        p3 = new JLabel("Player 3");
        JPanel pleft=new JPanel();
        JPanel pright=new JPanel();
        JPanel pmiddle=new JPanel();
        pmiddle.setLayout(new GridLayout(3,0));
        KMeeple5 = new JButton("King Meeple 1");
        KMeeple5.setPreferredSize(new Dimension(100,40));
        KMeeple5.setBackground(Color.GREEN);
        //KMeeple5.addActionListener(this);
        KMeeple6 = new JButton("King Meeple 2");
        KMeeple6.setPreferredSize(new Dimension(100,40));
        KMeeple6.setBackground(Color.GREEN);
        //KMeeple6.addActionListener(this);
        
        panelPlayer3.add(pleft);
        panelPlayer3.add(pmiddle);
        panelPlayer3.add(pright);
        pmiddle.add(KMeeple5);
        pmiddle.add(p3);
        pmiddle.add(KMeeple6);
        
        //Pamel Player 4
        panelPlayer4=new JPanel();
        contentPane.add(panelPlayer4,BorderLayout.SOUTH);
        panelPlayer4.setLayout(new GridLayout(0,3));
        
        p4 = new JLabel("Player 4");
        JPanel pleft1=new JPanel();
        JPanel pright1=new JPanel();
        JPanel pmiddle1=new JPanel();
        pmiddle1.setLayout(new GridLayout(3,0));
        KMeeple7 = new JButton("King Meeple 1");
        KMeeple7.setPreferredSize(new Dimension(100,40));
        KMeeple7.setBackground(Color.RED);
        //KMeeple7.addActionListener(this);
        KMeeple8 = new JButton("King Meeple 2");
        KMeeple8.setPreferredSize(new Dimension(100,40));
        KMeeple8.setBackground(Color.RED);
        
        panelPlayer4.add(pleft1);
        panelPlayer4.add(pmiddle1);
        panelPlayer4.add(pright1);
        pmiddle1.add(KMeeple7);
        pmiddle1.add(p4);
        pmiddle1.add(KMeeple8);
        
        
        panelBoard = new JPanel();
        panelBoard.setLayout(new GridLayout(3,3));
        contentPane.add(panelBoard, BorderLayout.CENTER);
        
        panel1 = new JPanel();
        
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5,5));
        // create the buttons and add them to the grid
        gridSquares = new GridSquare [5][5];
    
    
        for ( int column = 0; column < 5; column ++)
        {
            for ( int row = 0; row < 5; row ++)
            {
                gridSquares [column][row] = new GridSquare(5,5);
                gridSquares [column][row].setColor();
                gridSquares [column][row].setOpaque(true);  
                panel2.add(gridSquares [column][row]);
            }
        }
        
        panel3 = new JPanel();
        button1=new JButton("Scores");
        panel3.add(button1);
        
        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(5,5));
        // create the buttons and add them to the grid
        gridSquares = new GridSquare [5][5];
    
    
        for ( int column = 0; column < 5; column ++)
        {
            for ( int row = 0; row < 5; row ++)
            {
                gridSquares [column][row] = new GridSquare(5,5);
                gridSquares [column][row].setColor();
                gridSquares [column][row].setOpaque(true);  
                panel4.add(gridSquares [column][row]);
            }
        }
        panel5 = new JPanel();
        
        
        panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
        
        wheatfield=new JButton("wheatfield");
        wheatfield.setPreferredSize(new Dimension(100,20));
        wheatfield.setBackground(new Color(255, 204, 51));
        grasslands=new JButton("grasslands");
        grasslands.setPreferredSize(new Dimension(100,20));
        grasslands.setBackground(new Color(204, 255, 102));
        forests1=new JButton("forests");
        forests1.setPreferredSize(new Dimension(100,20));
        forests1.setBackground(new Color(51, 102, 0));
        forests2=new JButton("forests");
        forests2.setPreferredSize(new Dimension(100,20));
        forests2.setBackground(new Color(51, 102, 0));
        forests3=new JButton("forests");
        forests3.setPreferredSize(new Dimension(100,20));
        forests3.setBackground(new Color(51, 102, 0));
        lakes=new JButton("lakes");
        lakes.setPreferredSize(new Dimension(100,20));
        lakes.setBackground(new Color(51, 153, 255));
        mines=new JButton("mines");
        mines.setPreferredSize(new Dimension(100,20));
        mines.setBackground(new Color(153, 153, 153));
        swamps=new JButton("swamps");
        swamps.setPreferredSize(new Dimension(100,20));
        swamps.setBackground(new Color(204, 204, 153));
        
        Domino1=new JPanel();
        Domino1.add(wheatfield,BorderLayout.LINE_START);
        Domino1.add(grasslands,BorderLayout.LINE_END);
        Domino1.add(new JLabel("Domino 1"),BorderLayout.NORTH);
        panel5.add(Domino1);
        
        Domino2=new JPanel();
        Domino2.add(lakes,BorderLayout.LINE_START);
        Domino2.add(mines,BorderLayout.LINE_END);
        panel5.add(Domino2);
        Domino2.add(new JLabel("Domino 2"),BorderLayout.NORTH);
        
        Domino3=new JPanel();
        Domino3.add(forests1,BorderLayout.LINE_START);
        Domino3.add(swamps,BorderLayout.LINE_END);
        panel5.add(Domino3);
        Domino3.add(new JLabel("Domino 3"),BorderLayout.NORTH);
        
        Domino4=new JPanel();
        Domino4.add(forests2,BorderLayout.LINE_START);
        Domino4.add(forests3,BorderLayout.LINE_END);
        panel5.add(Domino4);
        Domino4.add(new JLabel("Domino 4"),BorderLayout.NORTH);
        
        
        
        
        panel6 = new JPanel();
        panel6.setLayout(new GridLayout(5,5));
        // create the buttons and add them to the grid
        gridSquares = new GridSquare [5][5];
    
    
        for ( int column = 0; column < 5; column ++)
        {
            for ( int row = 0; row < 5; row ++)
            {
                gridSquares [column][row] = new GridSquare(5,5);
                gridSquares [column][row].setColor();
                gridSquares [column][row].setOpaque(true);  
                panel6.add(gridSquares [column][row]);
            }
        }
        panel7 = new JPanel();
        button2=new JButton("Save & Quit");
        panel7.add(button2);
        panel8 = new JPanel();
        panel8.setLayout(new GridLayout(5,5));
        // create the buttons and add them to the grid
        gridSquares = new GridSquare [5][5];
    
    
        for ( int column = 0; column < 5; column ++)
        {
            for ( int row = 0; row < 5; row ++)
            {
                gridSquares [column][row] = new GridSquare(5,5);
                gridSquares [column][row].setColor();
                gridSquares [column][row].setOpaque(true);  
                panel8.add(gridSquares [column][row]);
            }
        }
        panel9 = new JPanel();
        button3=new JButton("Quit");
        panel9.add(button3);
        start = new JButton("Start Round");
        start.addActionListener(this);
        panel9.add(start); // MMCU
        
        panelBoard.add(panel1);
        panelBoard.add(panel2);
        panelBoard.add(panel3);
        panelBoard.add(panel4);
        panelBoard.add(panel5);
        panelBoard.add(panel6);
        panelBoard.add(panel7);
        panelBoard.add(panel8);
        panelBoard.add(panel9);

        frame.setResizable(true);
        frame.setVisible(true);
        frame.setSize(1000,1000); //frame.pack();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == start)
		{
			if (start.getText().equals("Next Round")) 
			{
				new NextRoundGUI();
				set.clear();
				System.out.println();
				
				System.out.println("Drawing Pile size: " + DrawingPile.drawingPile.size());
				
				System.out.print("Drawing Pile: [ ");     /// CODE FOR DISPLAYING ORIGINAL DRAWING PILE ON CONSOLE///
		    	for(int i = 0; i <= DrawingPile.drawingPile.size()-2; i++)
		    	{
		    		System.out.print(DrawingPile.drawingPile.get(i).getNumber() + ", ");
		    	}
		    	System.out.println(DrawingPile.drawingPile.get(DrawingPile.drawingPile.size()-1).getNumber() + " ]");
		    	
		    	// drawing from the pile and adding next four dominos to the set
		    	for(int i = 0; i <= 3; i++)
		    	{
		    		set.add(DrawingPile.drawingPile.get(0));
		    		DrawingPile.drawingPile.remove(0);
		    	}
		    	
		    	if (DrawingPile.drawingPile.size() == 0)
		    		start.setEnabled(false);
		    	
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
		    	
		    	System.out.println("Drawing Pile size: " + DrawingPile.drawingPile.size());
				
		    	if (DrawingPile.drawingPile.size() != 0)
		    	{
		    		System.out.print("Drawing Pile: [ ");     /// CODE FOR DISPLAYING ORIGINAL DRAWING PILE ON CONSOLE///
		    		for(int i = 0; i <= DrawingPile.drawingPile.size()-2; i++)
		    		{
		    			System.out.print(DrawingPile.drawingPile.get(i).getNumber() + ", ");
		    		}
		    		System.out.println(DrawingPile.drawingPile.get(DrawingPile.drawingPile.size()-1).getNumber() + " ]");
		    	}
		    	else
		    		System.out.print("Drawing Pile: [ ]");
		    	System.out.println();
			}
			
			else
				new SetGUI();
		}
	}
}