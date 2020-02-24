import javax.swing.JOptionPane;
import java.io.*;

public class program_6_1 
{
	public static void main (String[] args)
			throws IOException
	{
		boolean done = false;
		int close = 0;
		String userInput;
		
		while (!done)
		{
			userInput = JOptionPane.showInputDialog("Enter a positive integer < 1000; or 0 to quit:"); //gets input from user
			int userInteger = Integer.parseInt(userInput);
			
			//closes the loop if the user enters done 
			if (userInteger == close)
			{
				done = true;
				JOptionPane.showMessageDialog(null, "Program Terminated");
			}
			
			else 
			{
				while ((userInteger <1) || (userInteger > 999))
				{
					userInput = JOptionPane.showInputDialog("...DATA ENTRY ERROR... " +  '\n' + "Enter a positive integer < 1000; or 0 to quit:");
					userInteger = Integer.parseInt(userInput);
				}
				
				
				
			}
			
		}

	}
}
