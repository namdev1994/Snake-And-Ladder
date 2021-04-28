package snakeAndLadder;
import java.util.*;

public class SnakeAndLadder {

	public static void main(String[] args) {

		options();

}
	public static int RollDice()
	{
		int dice=(int)(Math.floor(Math.random()*10)%6+1);
		return dice;

	}
	public static void options() {
		
		int player1_position=0,player2_position=0;
		int count=0;
		boolean check1=true;
		while(player1_position <100 && player2_position < 100)
		{
		count++;
		int check =(int)(Math.floor(Math.random()*10)%3+1);
		System.out.println("check "+check);
		int dice=RollDice();
		System.out.println("Dice number "+dice);
		switch(check)
		{
		case 1:
			if(check1)
			{
				System.out.println("Player1 is not Playing ");
				check1=false;
			}
			else
			{
				System.out.println("player2 is not Playing ");
				check1=true;
			}
		
			break;
		case 2:
			if(check1) {
				
			
			if((player1_position+dice) <= 100)
			{
				player1_position=player1_position +dice;
			}
			System.out.println("The position of player1  is  "+player1_position);
			}
			else
			{
				if ((player2_position+dice)<=100) {
					player2_position=player2_position+dice;
					}
					System.out.println("Position of the player2 is "+ player2_position);
					
					}
			
			break;
		case 3:
			if(check1) {
				check1=false;
				player1_position=player1_position - dice;
				if((player1_position-dice)<0) {
				player1_position=0;
				}

				System.out.println("Position of the player1: "+ player1_position);
				
				}else
				{
				check1=true;
				player2_position=player2_position - dice;
				if((player2_position-dice)<0) {
				player2_position=0;
				}

				System.out.println("Position of the player2: "+ player2_position);
				
				}
			break;
		}
		}
		if(player1_position == 100)
		{
			System.out.println("Player1 is winner ");
		}
		else
		{
			System.out.println("Player2 is Winner");
		
		}
		System.out.println("Count = "+count);

		}
}
	
		