package sheet3ControlFlow;



public class Ex13TotalTwoDice {

	public static void main(String[] args) {
		
		Ex13TotalTwoDice ex13 = new Ex13TotalTwoDice();
		
		int dice1= (int)(Math.random()*6) + 1;
		int dice2 = (int)(Math.random()*6) + 1 ;
		
		//System.out.println("dice1 = "+dice1);
		//System.out.println("dice2 = "+dice2);
		
		int total = ex13.calculatPoints(dice1, dice2);
		System.out.printf("Dice 1: %d \nDice 2: %d\nTotal: %d",dice1,dice2, total);
		//System.out.println("Total of two dice is: "+ total);
		
	}//main
	
	public int calculatPoints(int dice1, int dice2){
		int total = dice1 + dice2;
		return total;
	}

}//class
