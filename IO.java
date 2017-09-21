import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Contains all methods needed for program IO
 * @author prydej
 *
 */
public class IO 
{

	public static String take_input()
	{
		String userInput = "";
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		try
		{
			userInput = input.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		return userInput;
	}
}
