package fr.dauphine.ja.huestelle.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
    
	public PrimeCollection(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
	
	public void initRandom(int n, int m) {
		Random random = new Random();
		for(int i=0; i<n;i++) {
			numbers.add((random.nextInt(m)));
		}
	}
	
	private static boolean isPrime(int p) {
		if(p==0 || p== 1) {
			return false;
		}
		for (int i=2;i<=Math.sqrt(p);i++) {
			if(p%i==0) {
				return false;
			}
		}
		return true;
	}
	public void printPrimes() {
		for(Integer i : this.numbers) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main( String[] args )
    {
		PrimeCollection p = new PrimeCollection(new ArrayList<>());
        p.initRandom(100, 2000);
        p.printPrimes();
        
    }
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}
}
