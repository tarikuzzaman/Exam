package math;

public class PrimeNumber {
	public static boolean isPrime(int num){
		for(int j=2; j<num; j++){
			if(num % j == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int limit = 1000000, counter =0;
		for(int i=2; i<limit; i++){
			if(isPrime(i)){
				System.out.println(i);
				counter++;
			}
		}
		System.out.println("Number of prime numbers: " + counter);


	}

}
