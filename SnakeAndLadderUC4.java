package JavaPractice;

public class SnakeAndLadderUC4 {
		public static final int IS_NO_PLAY=0;
		public static final int IS_LADDER=1;
		public static final int IS_SNAKE=2;
		public static final int IS_WINNING_POSITION=100;
		static int diceRollCount = 0;
	public static void main(String[] args) {
		System.out.println( "Snake and Ladder game is played with single player" );
		
		int gamePosition = 0;
        while (gamePosition < IS_WINNING_POSITION) 
		{
            
			++diceRollCount;
			
            gamePosition = getplayerPosition(gamePosition);
        }
    }
	
	public static int getplayerPosition(int position)
		{
		int numOnDice= (int) (Math.floor(Math.random() * 10) % 6 +1);
		System.out.println( "Player rolled dice and got number: " +numOnDice);

		int playerOption= (int) (Math.floor(Math.random() *10) % 3 );

if (playerOption == IS_SNAKE) {
            System.out.println( "OOps,Player got snake,Player moves behind in the postion : " );

            if (position - numOnDice > 0) {
                position -= numOnDice;
            }
        } else if (playerOption == IS_LADDER) {
            System.out.println("Wow!,Player got Ladder,so Player moves ahead in the postion :");
            if (position + numOnDice <= 100) {
                position += numOnDice;
            }
        } else {
            System.out.println( "Oh no,Player got No play,so Player stays in the same Postion" );
        }

        return position;
    }
}
		
