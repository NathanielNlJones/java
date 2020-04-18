import java.io.*;
import java.util.Scanner;

public class Reverse_13_1

{
	private Scanner file_obj;
	private PrintWriter writer_obj;
	
	public Reverse_13_1(Scanner file_in, PrintWriter output)
	{
		file_obj = file_in;
		writer_obj = output;
	}
	
	public void reverse_Ints()
	{
		int[] hold_ints = new int[25];
		
		while(file_obj.hasNextInt())
		{
			for (int i = 0; i < hold_ints.length; i ++)
			{
				hold_ints[i] = file_obj.nextInt();
			}
		
		}
		
		for (int i = hold_ints.length-1; i >= 0; i --)
		{
			report(writer_obj, hold_ints[i]);
		}
	}
	
	public void report(PrintWriter outPutFile, int hold_ints)
	{
		outPutFile.print(hold_ints + " ");
	}
}
