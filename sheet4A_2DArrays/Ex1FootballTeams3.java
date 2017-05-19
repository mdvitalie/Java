package sheet4A_2DArrays;

import java.util.Scanner;

public class Ex1FootballTeams3 {

	public static void main(String[] args) {


		String[][] teams = { 																						// i

				{"Manchester United","Zlatan Ibrahimovic","Paul Pogba","Wayne Rooney","Henrikh Mkhitaryan"},				// 0
				{"Arsenal F.C.","Mesut Özil","Alexis Sánchez","Olivier Giroud","Granit Xhaka"},								// 1
				{"Chelsea F.C.","Eden Hazard","Diego Costa","N'Golo Kante","David Luiz","Cesc Fàbregas","Victor Moses"},	// 2
				{"Manchester City F.C.","Sergio Agüero","Gabriel Jesus","Yaya Touré","Kevin De Bruyne"}						// 3

		};

		/* Print the contents of the two D array. */
		for (int i = 0; i < teams.length; i++) {
			
			for (int j = 0; j < teams[i].length; j++) {
				
				System.out.print(teams[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("******************************");

		/* Get the user to enter a team name, seach in the first
		 * element of each array, if the name match, then print 
		 * the rest */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a team to print its players: ");
		String team = scanner.nextLine();

		for (int i = 0; i < teams.length; i++) {
			/* When j starts at one, the first element in the array
			 * will be skipped, i.e. the team name won't be printed.*/
			for (int j = 1; j < teams[i].length; j++) {

				/* You cannot use == to compare String.
				 * == is used to compare primitives (int, float,...)
				 * To compare String, you use:
				 * 	if (aString.equals(anotherString)) {
				 * 		// equals() returns true when there's a match
				 * 	}
				 *
				 * If the first element in the array matches what
				 * the user entered, then print the players
				 **/
				if (teams[i][0].equals(team))
					System.out.print( "\n "+j + ")"+teams[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println("\n\nThe enhanced/ foreach loop for a 2D array: ");
		/* The enhanced for loop for a 2D array:
		 * The RHS is the name of the 2D array.
		 * The LHS is a declaration to access each single array
		 * in that 2D array, i.e. declare a 1D array. */
		for (String [] team1 : teams) {
			
			/* The inner loop will loop through each 1D array, 
			 * therefore:
			 * The RHS, is the name of the 1D array declared on 
			 * the previous line.
			 * The LHS is a declaration of a single String which 
			 * will get a copy of each element in the team as it
			 * loops. And that 'name' is what you print inside 
			 * the loop. */
			for (String name : team1) {
				System.out.print(" "+name + "\n ");
			}
			System.out.println(); // A newline after each team
		}
	}
}
/** OUTPUT
team 1 player 1 player 2 
team 2 player 1 player 2 player 3 
team 3 player 1 player 2 
 ******************************
Enter a team to print its players: team 2
player 1 player 2 player 3 a

The enhanced/ foreach loop for a 2D array: 
team 1 player 1 player 2 
team 2 player 1 player 2 player 3 
team 3 player 1 player 2 
 */