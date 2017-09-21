
public class Main 
{
	public static void main(String args)
	{
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		Game game = new Game();
		
		game.play(player1, player2);
	}
}
