package GamePackage;

import java.util.Scanner;

public class Main
{

	protected String playerName;
	public int remain;
	protected Cards C = new Cards();
	public Main()
	{
		playerName = "Player";
		remain = 3;
	}
	
	void getData()
	{
		System.out.println("Player Name :: ");
		Scanner scan = new Scanner(System.in);
		playerName = scan.nextLine();		
	}	
}
