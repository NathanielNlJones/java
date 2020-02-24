import javax.swing.JOptionPane;

public class program_6_2 
{
	public static void main(String[] args)
	{
		//Set the (!done) loop
		//{
		// get the flag value from the user
		//if flag ==1 
		// get card number from user
		//validateCard()
		//else if flag ==2
		//get account number from user
		// calculateCheckDigit()
		//
		//else
		//public static boolean validateCard(int card_num)
		//sum the even digits (reading from left to right
		//sum the odd digits
		//total the two sums
		//using that total calculate the correct check digit
		//compare the calculated check digit to the actual check digit
		//if they are equal return true else return false
		
		boolean done = false;
		String flag_string;
		String card_string;
		long card_num;
		long acct_num;
		String account_string;
		boolean valid = false;
		int check_digit = 0;
		
		while(!done)
		{
			int flag = 0;
			flag_string = JOptionPane.showInputDialog("Enter 0 to quit; \n" 
					+ "Enter 1 to validate a credit card number; \n"
						+ "Enter 2 to calculate the check digit for an account number");
			flag = Integer.parseInt(flag_string);
			if(flag==1)
			{
				//get the card number from user
				//validateCard()
				card_string = JOptionPane.showInputDialog("Enter the 16 digit card number");
				card_num = Long.parseLong(card_string);
				valid = validateCard(card_num);
				
			}
			else if(flag==2)
			{
				//get account number
				//calculatecheckDigit()
				account_string = JOptionPane.showInputDialog("Enter a 15 digit account number");
				acct_num = Long.parseLong(account_string);
				check_digit = calculateCheckDigit(acct_num);
			}
			else 
			{
				done = true;
			}
		}
		
		
	}
	
	public static boolean validateCard(long card_num)
	{
		int even = 0;
		//sum the even digits
		even = sumEven(card_num);
		JOptionPane.showMessageDialog(null, "Method sumEven returned " + even);
		return true;
	}
	
	public static int sumEven(long card_num)
	{
		int sum = 0;
		//sum even digits
		//right in the 15 digit account number
		//2nd digit + 4th digit +... 14th digit
		JOptionPane.showMessageDialog(null, "sumEven returns " + sum);
		return sum;
	}
	
	public static int calculateCheckDigit(long acct_num)
	{
		return 3;
		
	}
}
