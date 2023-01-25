import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.util.Random;

public class GFPGTri
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
    
    private GridSquare [][] gridSquares;
    /**
     * Constructor for objects of class Gameboard
     */
    public GFPGTri()
    {
        // initialise instance variables
        frame = new JFrame();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout(12,12));
        //Pamel Player 1
        panelPlayer1=new JPanel();
        contentPane.add(panelPlayer1,BorderLayout.WEST);
        panelPlayer1.setLayout(new BorderLayout());
        
        p1 = new JLabel("Player 1");
        KMeeple1 = new JButton("King Meeple 1");
        KMeeple1.setPreferredSize(new Dimension(100,40));
        KMeeple1.setBackground(new Color(255, 202, 216));
        KMeeple2 = new JButton("King Meeple 2");
        KMeeple2.setPreferredSize(new Dimension(100,40));
        KMeeple2.setBackground(new Color(255, 202, 216));
        
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
        KMeeple3.setBackground(new Color(255, 228, 242));
        KMeeple4 = new JButton("King Meeple 2");
        KMeeple4.setPreferredSize(new Dimension(100,40));
        KMeeple4.setBackground(new Color(255, 228, 242));
        
        panelPlayer2.add(p2,BorderLayout.EAST);
        panelPlayer2.add(KMeeple3,BorderLayout.NORTH);
        panelPlayer2.add(KMeeple4,BorderLayout.SOUTH);
        
        //Pamel Player 3
        panelPlayer3=new JPanel();
        contentPane.add(panelPlayer3,BorderLayout.NORTH);
        panelPlayer3.setLayout(new BorderLayout());
        
        p3 = new JLabel("Player 3");
        KMeeple5 = new JButton("King Meeple 1");
        KMeeple5.setPreferredSize(new Dimension(100,40));
        KMeeple5.setBackground(new Color(115, 237, 255));
        KMeeple6 = new JButton("King Meeple 2");
        KMeeple6.setPreferredSize(new Dimension(100,40));
        KMeeple6.setBackground(new Color(115, 237, 255));
        
        panelPlayer3.add(p3,BorderLayout.CENTER);
        panelPlayer3.add(KMeeple5,BorderLayout.NORTH);
        panelPlayer3.add(KMeeple6,BorderLayout.SOUTH);
        
        //Pamel Player 4
        panelPlayer4=new JPanel();
        contentPane.add(panelPlayer4,BorderLayout.SOUTH);
        panelPlayer4.setLayout(new BorderLayout());
        
        p4 = new JLabel("Player 4");
        KMeeple7 = new JButton("King Meeple 1");
        KMeeple7.setPreferredSize(new Dimension(100,40));
        KMeeple7.setBackground(new Color(254, 28, 0));
        //KMeeple7.setBounds(300,30,50,20);
        KMeeple8 = new JButton("King Meeple 2");
        KMeeple8.setPreferredSize(new Dimension(100,40));
        KMeeple8.setBackground(new Color(254, 28, 0));
        
        panelPlayer4.add(p4,BorderLayout.CENTER);
        panelPlayer4.add(KMeeple7,BorderLayout.NORTH);
        panelPlayer4.add(KMeeple8,BorderLayout.SOUTH);
        
        
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
        wheatfield.setBackground(new Color(255, 191,202));
        grasslands=new JButton("grasslands");
        grasslands.setPreferredSize(new Dimension(100,20));
        grasslands.setBackground(new Color(221, 238, 255));
        forests1=new JButton("forests");
        forests1.setPreferredSize(new Dimension(100,20));
        forests1.setBackground(new Color(65, 95, 102));
        forests2=new JButton("forests");
        forests2.setPreferredSize(new Dimension(100,20));
        forests2.setBackground(new Color(65, 95, 102));
        forests3=new JButton("forests");
        forests3.setPreferredSize(new Dimension(100,20));
        forests3.setBackground(new Color(65, 95, 102));
        lakes=new JButton("lakes");
        lakes.setPreferredSize(new Dimension(100,20));
        lakes.setBackground(new Color(0, 171, 183));
        mines=new JButton("mines");
        mines.setPreferredSize(new Dimension(100,20));
        mines.setBackground(new Color(154, 151, 163));
        swamps=new JButton("swamps");
        swamps.setPreferredSize(new Dimension(100,20));
        swamps.setBackground(new Color(211, 196, 211));
        
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
        
        panelBoard.add(panel1);
        panelBoard.add(panel2);
        panelBoard.add(panel3);
        panelBoard.add(panel4);
        panelBoard.add(panel5);
        panelBoard.add(panel6);
        panelBoard.add(panel7);
        panelBoard.add(panel8);
        panelBoard.add(panel9);

        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(1000,1000);
    }
    
}