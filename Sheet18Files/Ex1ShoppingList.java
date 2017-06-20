package Sheet18Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1ShoppingList {

	public static void main(String[] args) {

		String fileName = "src/Sheet18Files/shoppingList.txt";

		boolean isRanning = true;  
		do{
			//Declaring Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("1) Add a product to the list");
			System.out.println("2) View product list");
			System.out.println("3) Exit");
			System.out.println("================\n");
			System.out.print("Pick a number :");


			int userInput = scanner.nextInt();

			switch(userInput){
				case 1:
	
					try{
					// try (PrintWriter pw = new PrintWriter(new FileWriter(new File(fileName)), true)) {
						//PrintWriter pw = new PrintWriter(new FileWriter(new File(fileName)), true);
						FileWriter fw = new FileWriter(new File(fileName), true);
						PrintWriter pw = new PrintWriter(fw);
						System.out.println("----------------------------");
						System.out.print("Type a product and price: ");
						String prodInput = scanner.next()+ " " + scanner.nextLine().trim();
						pw.println(prodInput);
						System.out.println(prodInput+" added to the list");
						//pw.append(prodInput);
						
						//System.out.println("When done type exit");
						if(prodInput.equals("exit")){
							break;
						}
						pw.flush();
						pw.close();
	
					}catch(FileNotFoundException e){
						JOptionPane.showMessageDialog(null, "File could not be created");
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
	
					break;
	
					//break;
	
				case 2://Read the file
					System.out.println("----------------------------");
					System.out.println("Product list:");
					// try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
					try{
						FileReader fr = new FileReader(fileName);
						BufferedReader br = new BufferedReader(fr);
						
						String line = " ";
						while ( (line = br.readLine()) != null) {
							System.out.println(line);
							
						}
						System.out.println("----------------------------");
						
						br.close();
	
					}catch(FileNotFoundException e){
						JOptionPane.showMessageDialog(null, "File could not be created");
						e.printStackTrace();
					}
					catch (IOException e) { 
						JOptionPane.showMessageDialog(null, "Error reading from file");
						e.printStackTrace();
						/* Exception is the parent of all Exceptions, this would catch
						 * any unchecked exceptions, e.g. NullPointerException.  */
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Something else happened");
						e.printStackTrace();
					} 
	
					break;
	
				case 3:
					System.out.println("Thank you and goodbay");
					isRanning=false;
	
					break;
				}

		}while(isRanning);

	}

}
