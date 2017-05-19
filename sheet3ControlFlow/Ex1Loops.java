package sheet3ControlFlow;
public class Ex1Loops{
	public static void main(String[] args){
	
			int i = 0;
			while(i <= 22){
				
				if(i != 22){
					System.out.print(i + ",");
				}else{
					System.out.print(i+".");
					
				}
				i++;
			}
			
		
			
			System.out.println("\nDo while loop");
				i=0;
			do{
				System.out.print(i +",");
				i++;
			
			}while(i<22);
			System.out.println(i);
			
			
			System.out.println("For loop");
			for(i=0;i<=22;++i){
				if(i == 22){
					System.out.print(i);
					
				}else{
					System.out.print(i +",");
					
				}
			}
			
	}
}