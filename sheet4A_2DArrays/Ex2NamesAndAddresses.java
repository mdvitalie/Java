package sheet4A_2DArrays;

import java.util.Scanner;

public class Ex2NamesAndAddresses {

	public static void main(String[] args) {
		
		Ex2NamesAndAddresses ex2 = new Ex2NamesAndAddresses();
	
	//Declaring Scanner
	Scanner scanner = new Scanner(System.in);

		String[][] namesAndAddresses = {
										{"Joe Murphy","12 Main Street","Finglas","Dublin 11"},
										{"Mary Jones","36 Amiens Street","Dublin 1"},
										{"Pat O’Connor","26 South Main Street","Wexford","Co. Wexford"},
										{"Vova Duma","600 Moskow street","Lucan","Co.Dublin"}
									   };
		
		
		System.out.print("Type a name:");
		//Asking user for the input
		String userInput = scanner.nextLine();
		ex2.peoplesAddresses(namesAndAddresses, userInput);
		
	scanner.close();
		
	}//main
	
	private void peoplesAddresses(String[][] namesAndAddresses,String userInput){
		
		boolean isFound = false;
		
	 for (int i = 0; i < namesAndAddresses.length; i++) {
			
			for (int j = 0; j < namesAndAddresses[i].length; j++) {
				
				if(namesAndAddresses[i][0].equalsIgnoreCase(userInput)){
					
					System.out.println(" "+namesAndAddresses[i][j]+ " ");
					isFound = true;
				}
			}
			if(isFound)
			break ;
			//System.out.println();
		}
		
		if(!isFound){
			System.out.println("Sorry this address doesn't exist");
		}
	}

}
