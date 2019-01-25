package GamePackage;

public class Cards {
	
	int card[] = new int[3];
	int life[] = new int[3];
	public Cards()
	{
		for(int i=0;i<3;i++) {
		card[i]=100*(i+1);
		life[i]=100;
		}
	}
}
