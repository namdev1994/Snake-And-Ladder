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
		int position=0;

		while(position <100)
		{
		
		int check =(int)(Math.floor(Math.random()*10)%3+1);
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
			if(position > 100)
			{
				position=position - dice;
			}
			System.out.println("The position is  "+position);
			break;
		case 3:
			position = position - dice;
			System.out.println("The position is "+position);
			if(position < 0)
			{
				position=0;
			}
			break;
		}
		}
		
		}
}
	
		