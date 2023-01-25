import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NextRoundGUI implements ActionListener{
	JButton d1, d2, d3, d4;
	JFrame frame;
	JLabel turnDisplayer;
	int clicks = 0;

	public NextRoundGUI()
	{
		frame = new JFrame("Set GUI");
		frame.setSize(200, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		
		
		JPanel panel1 = new JPanel();
		createNorthPanel(panel1);
		
		JPanel panel2 = new JPanel();
		createSouthPanel(panel2);
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		//frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		if (e.getSource() == d1)
		{
			d1.setEnabled(false);
			int curr_turn = PlayingOrder.order.get(clicks);
			//PlayingOrder.temp_order.add(curr_turn, null);
			System.out.println(PlayingOrder.temp_order);
			PlayingOrder.temp_order.remove(0);
			PlayingOrder.temp_order.add(0, curr_turn);
			clicks++;
		}
		
		if (e.getSource() == d2)
		{
			d2.setEnabled(false);
			int curr_turn = PlayingOrder.order.get(clicks);
			//PlayingOrder.temp_order.add(1);
			System.out.println(PlayingOrder.temp_order);
			PlayingOrder.temp_order.remove(1);
			PlayingOrder.temp_order.add(1, curr_turn);
			clicks++;
		}
		
		if (e.getSource() == d3)
		{
			d3.setEnabled(false);
			int curr_turn = PlayingOrder.order.get(clicks);
			//PlayingOrder.temp_order.add(2);
			System.out.println(PlayingOrder.temp_order);
			PlayingOrder.temp_order.remove(2);
			PlayingOrder.temp_order.add(2, curr_turn);
			clicks++;
		}
		
		if (e.getSource() == d4)
		{
			d4.setEnabled(false);
			int curr_turn = PlayingOrder.order.get(clicks);
			//PlayingOrder.temp_order.add(3);
			System.out.println(PlayingOrder.temp_order);
			PlayingOrder.temp_order.remove(3);
			PlayingOrder.temp_order.add(3, curr_turn);
			clicks++;
		}
		
		if (clicks <= 3) // this condition is applied to avoid error
		{
			int next_turn = PlayingOrder.order.get(clicks);
			turnDisplayer.setText("Turn: Player " + next_turn);
			System.out.println(PlayingOrder.temp_order);
			System.out.println("");
		}
		
		if (clicks == 4)
		{
			turnDisplayer.setText("Round Over!");
			System.out.println(PlayingOrder.temp_order);
			GameboardFourPlayerGUI.start.setText("Next Round");
			
			// cloning temp_order to order
			PlayingOrder.order.clear();
			for(int i = 0; i <= 3; i++)
	    	{
	    		PlayingOrder.order.add(i, PlayingOrder.temp_order.get(i));
	    	}
			PlayingOrder.temp_order = new ArrayList<Integer>(List.of(0, 0, 0, 0));
			System.out.println("New Order: " + PlayingOrder.order);
			System.out.println("temp_order " + PlayingOrder.temp_order);
			
			//destroying setGUI
			frame.dispose();
		}
		
	}
	
	// Divides a Button in Two Halves to set icon in each half
	public void setIcons(JButton button, String addr1)
	{
		
		ImageIcon pic1 = new ImageIcon(addr1);
		button.setIcon(pic1);
	}
		
		//creates the North Panel which contains turnDisplayer
		public void createNorthPanel(JPanel panel)
		{
			int turn = PlayingOrder.order.get(0); 
			turnDisplayer = new JLabel("Turn: Player " + turn);
			panel.add(turnDisplayer);
		}
		
		// creates the South Panel which contains all the Dominos
		public void createSouthPanel(JPanel panel)
		{
			panel.setLayout(new GridLayout(4, 2));
			
			d1 = new JButton("d1");
			d1.addActionListener(this);
			d2 = new JButton("d2");
			d2.addActionListener(this);
			d3 = new JButton("d3");
			d3.addActionListener(this);
			d4 = new JButton("d4");
			d4.addActionListener(this);
			
			// adding icons 
			setIcons(d1, "ss3.png"); // size = 250px by 125px
			setIcons(d2, "ss4.png");
			setIcons(d3, "ssg.j");
			setIcons(d4, "ssb.j");
			
			panel.add(d1);
			panel.add(d2);
			panel.add(d3);
			panel.add(d4);
		}
}

