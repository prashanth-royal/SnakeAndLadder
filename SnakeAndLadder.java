public class SnakeAndLadder {

		public static void main(String[] args) {

		int randomDieNum = (int)(Math.random()*6) + 1;
		System.out.println("Random Die is: " + randomDieNum);

		//constants
		int NoPlay=0;
      int Ladder=1;
      int Snake=2;

		//check for options like NoPlay Ladder and Snake
		int Option = (int)(Math.random()*3);
		System.out.println("Random number is: " + Option);

		//to check for the player position by if elseif statement

		if (Option == Ladder)
			System.out.println("Player Position is: " + randomDieNum);
		else if (Option == Snake)
			System.out.println("Player position is: " + -randomDieNum);
		else
			System.out.println("Player position is: " + 0);
	}
}

