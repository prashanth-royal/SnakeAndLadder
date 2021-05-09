public class SnakeAndLadder {

		public static void main(String[] args) {

      //constants
      int NoPlay=0;
      int Ladder=1;
      int Snake=2;

		//variables
		int STARTING_POSITION=0;
		int NEW_POSITION=0;
		int WINNING_POSITION=100;

		//using while loop to meet condition
      while (NEW_POSITION <= WINNING_POSITION) {

		//roll a die for random number
      int randomDieNum = (int)(Math.random()*6) + 1;
      System.out.println("Random Die is: " + randomDieNum);

      //check for options like NoPlay Ladder and Snake
      int Option = (int)(Math.random()*3);
      System.out.println("Random number is: " + Option);

      //to check for the player new position and play till winning position by if elseif statement
			if (Option == Ladder)
			{
				NEW_POSITION = (NEW_POSITION + randomDieNum);
				System.out.println("Player Position is: " + NEW_POSITION);
							if (NEW_POSITION == WINNING_POSITION)
							break;
			}
			else if (Option == Snake)
			{
				NEW_POSITION = (NEW_POSITION - randomDieNum);
					if (NEW_POSITION < STARTING_POSITION)
						 NEW_POSITION = STARTING_POSITION;
						 System.out.println("Player position is: " + NEW_POSITION);
               		if (NEW_POSITION == WINNING_POSITION)
               		break;
			}
			else
			{
				NEW_POSITION = NEW_POSITION;
				System.out.println("Player position is: " + NEW_POSITION);
			}
		}
	}
}


