package week_6_1;

import javax.swing.JOptionPane;
import java.io.*;

public class program_6_1 
{
	
	
	public static void main (String[] args)
			throws IOException
	{
		boolean done = false;    //keeps the loop open
		int close = 0;			 //control variable for the main loop
		String userInput;		 //for taking in user input as a string 
		String numWord = "one";  //for converting integer to word
		String showWord = "";    //for returning word to user
		char flag = 'y';         //flag variable for hiding if statement for certain passes
		int numVal;				 //for holding calculations
		int userInteger;         //for converted string to integer
		
		//main loop
		while (!done)
		{
			//takes input from user as a string and converts to integer
			userInput = JOptionPane.showInputDialog("Enter a positive integer < 1000; or 0 to quit:"); //gets input from user
			userInteger = Integer.parseInt(userInput);
			
			
			//closes the loop if the user enters done 
			if (userInteger == close)
			{
				done = true;
				JOptionPane.showMessageDialog(null, "Program Terminated");
			}
			//main loop
			else 
			{
				showWord = "";  //reinitializes the word returned to user for each pass
				//loop traps user until they enter a value between 0 and 1000
				while ((userInteger <0) || (userInteger > 999))
				{
					userInput = JOptionPane.showInputDialog("...DATA ENTRY ERROR... " +  '\n' + "Enter a positive integer < 1000; or 0 to quit:");
					userInteger = Integer.parseInt(userInput);
				}
				
				flag = 'y'; //resets the flag for each pass
				
				//process any hundred's from the integer
				if (userInteger >= 100)
				{
					numVal = (userInteger/100);  //returns digit in the 100's column
					//converts digit to a string
						if (numVal == 1)
								{
							numWord = "one";
								}
						else if(numVal == 2)
						{
							numWord = "two";
						}
						else if(numVal == 3)
						{
							numWord = "thee";
						}
						else if(numVal == 4)
						{
							numWord = "four";
						}
						else if(numVal == 5)
						{
							numWord = "five";
						}
						else if(numVal == 6)
						{
							numWord = "six";
						}
						else if(numVal == 7)
						{
							numWord = "seven";
						}
						else if(numVal == 8)
						{
							numWord = "eight";
						}
						else if(numVal == 9)
						{
							numWord = "nine";
						}
						showWord = (numWord + " hundred"); //concatates and sends to user
						//removes the left most integer from userInteger
						userInteger = userInteger % (int) Math.pow(10,  (int)Math.log10(userInteger));
				}
				//special case if value is 20
				if (userInteger == 20)
				{
					showWord = "twenty";
				}
				//processes from tens column with the exception of teens
				if (userInteger > 20)
				{
					numVal = (userInteger/10);
					
						if (numVal == 1)
								{
							numWord = "one";
								}
						else if(numVal == 2)
						{
							numWord = "twen";
						}
						else if(numVal == 3)
						{
							numWord = "thir";
						}
						else if(numVal == 4)
						{
							numWord = "four";
						}
						else if(numVal == 5)
						{
							numWord = "fif";
						}
						else if(numVal == 6)
						{
							numWord = "six";
						}
						else if(numVal == 7)
						{
							numWord = "seven";
						}
						else if(numVal == 8)
						{
							numWord = "eigh";
						}
						else if(numVal == 9)
						{
							numWord = "nine";
						}
						showWord = (" " + showWord + " " + numWord + "ty");
						//removes tens column from userInteger
						userInteger = userInteger % (int) Math.pow(10,  (int)Math.log10(userInteger));
					}
				//processes any teen integers
				if ((userInteger > 12)&&(userInteger <20))
				{
					//numWord = (userInteger/100 + " hundred");
					//numVal = (userInteger);
					userInteger = userInteger % (int) Math.pow(10,  (int)Math.log10(userInteger));
					numVal = (userInteger);
					
						if (numVal == 3)
						{
							numWord = "thir";
						}
						else if(numVal == 4)
						{
							numWord = "four";
						}
						else if(numVal == 5)
						{
							numWord = "fif";
						}
						else if(numVal == 6)
						{
							numWord = "six";
						}
						else if(numVal == 7)
						{
							numWord = "seven";
						}
						else if(numVal == 8)
						{
							numWord = "eight";
						}
						else if(numVal == 9)
						{
							numWord = "nine";
						}
						showWord = (numWord + "teen");
						flag = 'n'; //if the user has a teen value, turn flag off so that it doesn't proccess one's column
				}
				//processes special cases
				if ((userInteger >9)&&(userInteger <13))
				{
					
					if (userInteger == 10)
					{
						numWord = "ten";
					}
					else if (userInteger == 11)
					{
						numWord = "eleven";
					}
					else if (userInteger == 12)
					{
						numWord = "twelve";
						
					}
					showWord = (numWord);
				}
				//processes single digits
				if ((userInteger > 0)&&(userInteger <10))
				{
					
					if (flag == 'y') //shows as long as userInteger does not have a 'teen' value
					{
					//numWord = (userInteger/100 + " hundred");
					numVal = (userInteger);
					
						if (numVal == 1)
								{
							numWord = "one";
								}
						else if(numVal == 2)
						{
							numWord = "two";
						}
						else if(numVal == 3)
						{
							numWord = "three";
						}
						else if(numVal == 4)
						{
							numWord = "four";
						}
						else if(numVal == 5)
						{
							numWord = "five";
						}
						else if(numVal == 6)
						{
							numWord = "six";
						}
						else if(numVal == 7)
						{
							numWord = "seven";
						}
						else if(numVal == 8)
						{
							numWord = "eight";
						}
						else if(numVal == 9)
						{
							numWord = "nine";
						}
						showWord = (" " + showWord + " " + numWord); //concatates to any existing string
						//userInteger = userInteger % (int) Math.pow(10,  (int)Math.log10(userInteger));
					}
				}
					//displays completed string to user
					JOptionPane.showMessageDialog(null, showWord);
					
			}
				
		}
	}

}