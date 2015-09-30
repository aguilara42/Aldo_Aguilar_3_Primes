
public class primes {
	public static void main(String[] args) {
		int a = 0;
		
//		while( a <= 100){
//			
//			System.out.println(a);
//			a += 2;
//			
//						
//			if (a <= 100){
//				System.out.println();
//			}
//		}
		
		
/*		int b = 0;
		for (int i =0; i < 100; i ++ ){
			if (i %2 == 0){
				b++;
			}
		}
		System.out.println(b);
*/		
	
		/* what is a method
		 	a method is a function
		 	it's like a program
		*/
		
		
//	for(int i = 0; i < 100; i++ ){
//			
//			if (i % 2 != 0){
//				if(i % 3 != 0){
//					if (i % 2 == 0)
//					System.out.println(i + " not even");
//				}
//			}				
			
		 /*boolean isEven(int someNumber){
			// A return value is the type of value you give back to the program 
			return 
		 }*/
		for (int i = 0; i< 100; i++){
			//System.out.println(isOdd(i)) ;
			//System.out.println(isOdd(i)) ;
			
			if (isPrime(i)){
				System.out.println(i);
				
			}
		}
		
		}
		/*A little program that talks all around the program by returning values
		static boolean isEven(int number){
			return ( number % 2 == 0);
		}
		
		static boolean isOdd(int number){
			return (number % 2 !=0);
		}*/
		
		static boolean isPrime (int number){
			int divisors = 0;
			for (int i = 2; i < number; i ++){
				if (number % i == 0){
					divisors += 1;
				}
			}
			return (divisors ==0);
			
			
		}
		
		
		/*static boolean divsorThree (int number){
			return( number % 3 ==0 );
		}
		
		static boolean divsorFour (int number){
			return( number % 4 ==0 );
		}
		
		static boolean divsorFive (int number){
			return( number % 5 ==0 );
		}
		
		static boolean divsorSix (int number){
			return( number % 6 ==0 );
		}*/
	
	
	}
