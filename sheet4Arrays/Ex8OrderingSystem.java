package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex8OrderingSystem {

	public static void main(String[] args) {




		int [] refNums = {1000,1001,1002,1003,1004};
		String[] productNames ={"Keyboard","Monitor","Mouse","Mouse mat","Speakers"};
		double[] prices = {49.99,15.50,124.99,3.99,23.50};



		System.out.printf("%-24s%-18s%s\n","Reference Number","Product Name","Price");
		System.out.println("_ _ _ _ _ _ _ _ _\t_ _ _ _ _ _ _\t_ _ _ _ _");


		for(int i=0; i<refNums.length; i++){

			System.out.printf(" %-23d%-18s€%7.2f\n",refNums[i],productNames[i],prices[i]);
		}



		//########################## JOptionPane  #####################################

		boolean isFound = false;

		String input = JOptionPane.showInputDialog("Please enter a reference number");

		for(int i=0; i<refNums.length; i++){
			if(refNums[i] == Integer.parseInt(input)){

				JOptionPane.showMessageDialog(null,"This is a "+productNames[i]+ " and it cost €"+ prices[i]);

				String numQuantity = JOptionPane.showInputDialog("How many would you like to order?");
				double total = prices[i] * Integer.parseInt(numQuantity);

				JOptionPane.showMessageDialog(null,"You have selected "+productNames[i]+ "\n and total cost:  €"+ total);
				isFound = true;
				break;
			}

		}
		if(!isFound){
			//System.out.println("No match");
			JOptionPane.showMessageDialog(null,"No match ");
		}







	}//main

}//class
