public class SnakeAndLadderUC3 {
		public static final int IS_NO_PLAY=0;
		public static final int IS_LADDER=1;
		public static final int IS_SNAKE=2;
	public static void main(String[] args) {
		System.out.println( "Snake and Ladder game is played with single player at start postion 0 " );
		int numOnDice= (int)(Math.floor(Math.random() * 10) % 6 +1);
		System.out.println( "Player rolled dice and got number: " +numOnDice);

		int gamePlay=0;
		int gamePostion=0;

		int playerPostion= (int)(Math.floor(Math.random() *10) % 3 );


		switch (playerPostion) {

			case IS_NO_PLAY:
					gamePlay=0;
					gamePostion=0;
					System.out.println( "Oh no,Player got No play,so Player stays in the same Postion" );
					break;
			case IS_LADDER:
					gamePlay= +numOnDice;
					gamePostion= gamePostion + numOnDice;
					System.out.println( "Wow!,Player got Ladder,so Player moves ahead in the postion :" +gamePlay );
					break;
			case IS_SNAKE:
					gamePlay= -numOnDice;
					gamePostion= gamePostion - numOnDice;
					System.out.println( "OOps,Player got snake,Player moves behind in the postion : " +gamePlay );
					break;
			default:
					System.out.println( "Please roll a dice to start the game" );
				}

			System.out.println( "Player current Postion: " +gamePostion );
		}
}
