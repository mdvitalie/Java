package sheet4A_2DArrays;

public class Ex1FootballTeams {
	public static void main(String[] args) {

		String[][] footballTeams = { 																						// i

				{"Manchester United","Zlatan Ibrahimovic","Paul Pogba","Wayne Rooney","Henrikh Mkhitaryan"},				// 0
				{"Arsenal F.C.","Mesut Özil","Alexis Sánchez","Olivier Giroud","Granit Xhaka"},								// 1
				{"Chelsea F.C.","Eden Hazard","Diego Costa","N'Golo Kante","David Luiz","Cesc Fàbregas","Victor Moses"},	// 2
				{"Manchester City F.C.","Sergio Agüero","Gabriel Jesus","Yaya Touré","Kevin De Bruyne"}						// 3

		};

		for(int i=0;i<footballTeams.length;++i){

			for(int j=0; j<footballTeams[i].length;++j){

				if(j==0){
					System.out.println("\n\t"+footballTeams[i][j]+"\n");

				}else{
					System.out.println( "\tPlayers: " + footballTeams[i][j]);

				}
				//System.out.println( " Football team: " + footballTeams[i]);
				//System.out.printf("Footblall team:%s\nPlayers%s\n", footballTeams[i],footballTeams[j]);
			}
			System.out.println();
		}

	}
}
