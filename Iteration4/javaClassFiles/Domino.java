public class Domino {
	int number;
	int crowns;
	
	public Domino(int num)
	{
		this.number = num;
		this.crowns = (num >= 1) && (num <= 18) ? 0 : ((num >= 19) && (num <= 40) ? 1 : (num == 48) ? 3 : 2);
	}
	
	public int getNumber()
	{
		return number;
	}
}

