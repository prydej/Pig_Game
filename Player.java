/**
 * Controls logic for operations done by each player and attributes of each player
 * @author prydej
 *
 */
public class Player 
{

	int coins;
	String name;
	
	public Player()
	{
		System.out.println("Enter Name: ");
		name = IO.take_input();
	}
	
	public void bet()
	{
		
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
