import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingOrder {
	
	static ArrayList<Integer> order = new ArrayList<Integer>(List.of(1, 2, 3, 4));
	static ArrayList<Integer> temp_order = new ArrayList<Integer>(List.of(0, 0, 0, 0));

	
	public PlayingOrder()
	{
		
	}
	
	public void shuffle()
	{
		Collections.shuffle(order);
	}
	
}
