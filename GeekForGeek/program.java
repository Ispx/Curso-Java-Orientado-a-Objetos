import java.util.Scanner;

public class program {
	
    static void forkJava(int N){
        
        // Your code here
        boolean Fork = N % 3 == 0 ? true : false;
        boolean Java = N % 5 == 0 ? true : false;
        
        
        if(Fork == true){
            System.out.println("Fork");
        }
        else{
            
        }
        if(Java == true){
            System.out.println("Java");
        }
        else{
            
        }
        
        if(Fork == true && Java == true){
            System.out.println("Fork Java");
        }else{
            
        }
        
    }

	public static void main(String[] args) {

	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Number of tests: ");
	        int numTests = sc.nextInt();
	        
	        while(numTests >= 1){
	            
	            System.out.println("Value N:");
	            int N = sc.nextInt();
	            forkJava(N);
	            
	            numTests -- ;
	            
	        }
	        
	        
	        
	        
	        
	    }
	    
	}

