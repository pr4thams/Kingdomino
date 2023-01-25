public class GameTheme {

	static char theme = 'n';
	
	public GameTheme()
	{
		
	}
	
	
	void changeTheme(int num)
	{
		if (num == 2)
		{
			switch (GameTheme.theme)
			{
			case 'n':
				new GameboardTwoPlayerGUI();
				break;
			
			case 'p':
				new GTPGPro();
				break;
				
			case 'd':
				new GTPGDeu();
				break;
			
			case 't':
				new GTPGTri();
				break;
			}
		}
		else
		{
			switch (GameTheme.theme)
			{
			case 'n':
				new GameboardFourPlayerGUI();
				break;
			
			case 'p':
				new GFPGPro();
				break;
				
			case 'd':
				new GFPGDeu();
				break;
			
			case 't':
				new GFPGTri();
				break;
			}
		}
	}	
}
