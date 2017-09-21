import java.util.Random;
/**
 * Controls all game logic
 * @author prydej
 *
 */
public class Game 
{
	private Player[] chooseRandomPlayer(Player player1, Player player2)
	{
		Random random = new Random();
		int randint = random.nextInt(1);
		Player[] playerOrder = new Player[2];
		
		if (randint == 0){
			playerOrder[0] = player1;
			playerOrder[1] = player2;
			return playerOrder;
		}
		else {
			playerOrder[0] = player2;
			playerOrder[1] = player1;
			return playerOrder;
		}
	}
	
	public void play(Player player1, Player player2)
	{
		
		Player[] playerOrder;
		
		playerOrder = chooseRandomPlayer(player1, player2);
		
		while (player1.getCoins() > 0 && player2.getCoins() > 0)
		{
			
		}
	}
}
