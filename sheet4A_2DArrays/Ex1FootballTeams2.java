package sheet4A_2DArrays;

import java.util.Scanner;

public class Ex1FootballTeams2 {

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
					System.out.print( " "+j + ")"+teams[i][j] + "\n ");
			}
			System.out.println();
		}

		

	}

}
