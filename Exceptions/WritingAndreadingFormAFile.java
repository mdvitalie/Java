package Exceptions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingAndreadingFormAFile {

	public static void main(String[] args) {

		String fileName = "src/Exceptions/Thursday.txt";



		try{
			PrintWriter pw = new PrintWriter(fileName);

			pw.println("Hello");
			pw.println("It's Thursday");
			pw.println("It's Thursday the 4 day in the week");
			pw.println("one");
			pw.println("two");
			pw.println("three");
			pw.println("The end");
			pw.println("of the world");
			pw.flush();
			pw.close();

		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File could not be created");
			e.printStackTrace();
		}
		

		try{
			System.out.println("Contents of the file.....");
			FileReader fr =new FileReader(fileName);
			BufferedReader br =new BufferedReader(fr);

			String line ="";
			while((line = br.readLine()) !=null){

				System.out.println(line);
			}
			br.close();

		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File could not be created");
			e.printStackTrace();
		} catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error reading from file");
			e.printStackTrace();

		}finally{
			System.out.println("A finally block wil Always execute");
		}

		System.out.println("End of main");

	}

}
