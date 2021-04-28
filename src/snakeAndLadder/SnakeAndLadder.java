package snakeAndLadder;
import java.util.*;

public class SnakeAndLadder {

	public static void main(String[] args) {
		RollDice();
		options();

}
	public static int RollDice()
	{
		int dice=(int)(Math.floor(Math.random()*10)%6+1);
		System.out.println("Dice "+dice);
		return dice;

	}
	public static void options() {
		int position=0;
		while(position <=100)
		{
	
		int check =(int)(Math.random()*10)%3+1;
		System.out.println("check "+check);
		int dice=RollDice();
		System.out.println("Dice number "+dice);
		switch(check)
		{
		case 1:
			System.out.println("This is position "+position);
			break;
		case 2:
			position+=dice;
			System.out.println("playing "+position);
			break;
			default:
				System.out.println("Player not playing");
		}
		
	}
	}
}