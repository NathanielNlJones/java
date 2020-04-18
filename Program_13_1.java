import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Program_13_1
{
	public static void main(String[] args)
		   throws IOException
	{
		String file_name;
		String outputFile;
		String done_string = "done";
		boolean done = false;

		while (!done) 	
		{
			file_name = JOptionPane.showInputDialog("Enter a file name or done to exit: ");
			if (file_name.equals(done_string))	//page 146
			{
				done = true;
			}
			else		
			{
				try
				{
					File file_in = new File(file_name); 
					if(!file_in.exists())	// page 246
					{
						JOptionPane.showMessageDialog(null, "FILE DOES NOT EXIST");
					}
					else
					{
						Scanner input = new Scanner(file_in);
						outputFile = JOptionPane.showInputDialog("Enter an output file name: ");
						PrintWriter file_out = new PrintWriter(outputFile);
						Reverse_13_1 reverse_obj = new Reverse_13_1(input, file_out);
						reverse_obj.reverse_Ints();
						input.close();
						file_out.close();
					}
				} 
				catch(FileNotFoundException e)
				{
					JOptionPane.showMessageDialog(null, "The system cannot find the path sepcified");
				}
			}
		}
	}
}
