import java.awt.Color;
import javax.swing.*;

/*
 *  A simple extension of JButton which allows the background colour to be set and switched back and forth with ease.
 *  
 *  There are other ways of doing this, but it's a neat way to demonstrate how to create your own gui components,
 *  (as well as how to use ternary operators).
 *
 *  @author mhatcher
 */
public class GridSquare extends JButton
{
    private int xcoord, ycoord;     // location of this square
    
    // constructor takes the x and y coordinates of this square
    public GridSquare( int xcoord, int ycoord)
    {
     super();
     this.xcoord = xcoord;
     this.ycoord = ycoord;
     //this.setSize(100,100);
    }
    
    // if the decider is even, it chooses black, otherwise white (for 'column+row' will allow a chequerboard effect)
    public void setColor()
    {
      Color colour =  Color.white;
      this.setBackground( colour);
    }
    public void setBlue( )
    {
      Color colour =  Color.blue;
      this.setBackground( colour);
    }
    public void setRed( )
    {
      Color colour =  Color.red;
      this.setBackground( colour);
    }
    
    
    // simple setters and getters
    public void setXcoord(int value)    
    { xcoord = value; 
    }
    public void setYcoord(int value)    
    { ycoord = value; 
    }
    public int getXcoord()             
    { return xcoord; 
    }
    public int getYcoord()              
    { return ycoord; 
    }
}
