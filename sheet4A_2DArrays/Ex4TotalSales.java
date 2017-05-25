package sheet4A_2DArrays;

public class Ex4TotalSales {

	public static void main(String[] args) {
		
		Ex4TotalSales ex4  = new Ex4TotalSales();
		
		int[][] slips = {
						{1,1,100},{1,2,200},{1,3,400},{1,1,300},
						{2,4,400},{2,5,500},{2,3,600},{2,3,600},
						{3,2,1000},{3,3,800},{3,4,300},{3,4,500},
						{4,1,200},{4,3,300},{4,5,500}
		};
		
		int[][] sales= new int[4][5];
		
		/*for(int i ;i<sales.length;i++){
			int j=0;
				
				if(sales[i][j]==1&&sales[i][j+1]==1)
					sales[0][0] = sales[i][j+2];
		}*/
		
		ex4.getSales(slips);
		ex4.getTotalSales(sales);
		
	}//main
	
	public void getSales(int[][] slips){
		
		System.out.println("\n The sales slips:");
		System.out.println(" Salesperson #\tProduct #\tTotal €");
				
		for(int i=0; i<slips.length; i++){
			
			
			for(int j =0;j<slips[i].length;j++){
				System.out.printf("   %-12d",slips[i][j]);
				//System.out.printf("%d %d %d\n ",sales[i][0],sales[i][1],sales[i][2]);
				
			}
			System.out.println();
		}
		
	}//getSales
	
	public void getTotalSales(int[][] totalSales){
		
		
		
		System.out.println("\n########################################################################\n");
		
		String total ="Total";
		int i=0;
		
		
		int sum =0;
		int totalSum =0;
		int numOfSalesPeople = 0;
		int numOfSalesProduct = 0;
		
		System.out.printf("  %s\t|","Salesperson");
		for( i=0; i<totalSales.length; i++){
			
			if (totalSales[i][0] > numOfSalesPeople ) {
				numOfSalesPeople = totalSales[i][0];
				System.out.printf("\t%5d",numOfSalesPeople);
			}			
			/*if (totalSales[i][1] > numOfSalesProduct ) {
				numOfSalesProduct = totalSales[i][1];
				System.out.printf("%d",numOfSalesProduct);
			}*/	
			
			
			
		}
		System.out.printf("\t\t| %-15s\n",total);
		System.out.printf(" %s","_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
		
		//System.out.println("\nNum of sales people " + numOfSalesPeople);
		//System.out.println("\nNum of sales product " + numOfSalesProduct);
		
			for( i=0; i<totalSales.length; i++){
			
						
			if (totalSales[i][1] > numOfSalesProduct  ) {
				numOfSalesProduct = totalSales[i][1];
				System.out.println();
				System.out.printf("\n%s%4d  | ","  Product:",numOfSalesProduct);
				//System.out.printf("\n%s%7d | %d%d","Product:",numOfSalesProduct,sum,totalSum);
			}	
			 
			/*for(int j =0;j<totalSales[i].length;j++){
				if(totalSales[i][0] == totalSales[j][1] ){
					sum = sum + totalSales[j][2];
				}
				System.out.print(sum +" ");
			}*/
			
			//System.out.printf("%8d%8d",sum,totalSum);
			
			
			
		}
			
	
			
			
		
		System.out.printf("\n %s","_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("\n \n     Totals");
	}

}//class
