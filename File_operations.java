package File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class File_operations 
{
	static String FILE_NAME="file.txt";
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("1.Write");
			System.out.println("2.Read");
			System.out.println("3.Exit");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: writefile(sc);
					break;
			case 2: readfile();
					break;
			case 3: System.exit(0);
			default: System.out.println("Invalid Choice!!1");
			}
		}
	}

	private static void readfile()
	{
		String line;
		int no=1;
		System.out.println("File contents are:");
		try 
		{
			BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
			while((line=br.readLine())!=null)
			{
				System.out.println(no++ + ". "+line);
				//no++;
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writefile(Scanner sc) 
	{
		String note;
		System.out.println("Enter the sentence: ");
		sc.nextLine();
		note=sc.nextLine();
		try 
		{
			FileWriter fw=new FileWriter(FILE_NAME, true);
			fw.write(note+System.lineSeparator());
			System.out.println("Note saved successfully!");
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("Error writing to file: " + e.getMessage());
		}
		
	}
}
