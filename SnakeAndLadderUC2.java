public class SnakeAndLadderUC2 {
	public static void main(String[] args) {
		System.out.println( "Snake and Ladder game is played with single player at start postion 0 " );
		int numOnDice= (int)(Math.floor(Math.random() * 10) % 6 +1);
		System.out.println( "Player rolled dice and got number: " +numOnDice);
	}
}
