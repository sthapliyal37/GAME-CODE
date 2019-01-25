package GamePackage;

import java.util.Scanner;

public class Player {
	
	public static void main(String []arge)
	{
		Main user =  new Main();
		Main user2 =  new Main();
		
		user.getData(); 
		user2.getData();
		
		while (user.remain !=0 && user2.remain!=0)
		{
			int turn =(int) (Math.random() *10) % 2;
			if(turn==0)
			{
				System.out.println(user.playerName + "'s Turn ");
				int dice =(int) (Math.random()*10)%3;
				System.out.println(dice+1 + " Card Will Hit..!!");
				System.out.println("Enter Enemy Card No...!!(1 To 3)");
				Scanner scan = new Scanner(System.in);
				int enemy = scan.nextInt()-1;
				if(user2.C.life[enemy]==0 || enemy<0)
				{
					System.out.println("Card Life Already 0../Invalid Card ");
					System.out.println("Enter Another Enemy Card No...!!");
					enemy = scan.nextInt()-1;
				}
				if(user2.C.life[enemy]<=user.C.life[dice])
				{
					user2.C.life[enemy]=0;
					user.remain--;
				}
				else
				{
					user2.C.life[enemy] -= user.C.life[dice]; 
				}
				
				if(user.C.life[dice]==0)
				{
					user.remain++;
				}
				user.C.life[dice]+=10;
				
			}
			
			
			else
			{
				System.out.println(user2.playerName + "'s Turn ");
				int dice =(int) (Math.random()*10) % 3;
				System.out.println(dice+1 + " Card Will Hit..!!");
				System.out.println("Enter Enemy Card No...!!( 1 to 3)");
				Scanner scan = new Scanner(System.in);
				int enemy = scan.nextInt()-1;
				if(user.C.life[enemy]==0 || enemy<0)
				{
					System.out.println("Card Life Already 0../Invalid Card ");
					System.out.println("Enter Another Enemy Card No...!!");
					enemy = scan.nextInt()-1;
				}
				if(user.C.life[enemy]<=user2.C.life[dice])
				{
					user.C.life[enemy]=0;
					user2.remain--;
				}
				else
				{
					user.C.life[enemy] -= user2.C.life[dice]; 
				}
				if(user2.C.life[dice]==0)
				{
					user2.remain++;
				}
				user2.C.life[dice]+=10;
				
			}
			System.out.println(user.playerName + "->>>");
			for(int j=0;j<3;j++)
			{
				System.out.println("Card " + (j+1) + " " + user.C.life[j]);
			}
			System.out.println(user2.playerName +"->>>" );
			for(int j=0;j<3;j++)
			{
				System.out.println("Card " + (j+1) + " " + user2.C.life[j]);
			}
			System.out.println("------------------------------");
			
		}
	
	if(user.remain !=0)
	{
		System.out.println(user2.playerName + " WIN..!!!!!!!!!!");
	}
	else
	{
		System.out.println(user.playerName + " WIN......!!!!!!!!!!!!!");
	}
	}

}
