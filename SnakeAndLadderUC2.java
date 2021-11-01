public class SnakeAndLadderUC2 {
	public static void main(String[] args) {
		int numOnDice= (int) Math.floor((Math.random() * 10) % 6 + 1);
		System.out.println( "Player rolled dice at starting postion 0 and got number: " +numOnDice);
	}
}
