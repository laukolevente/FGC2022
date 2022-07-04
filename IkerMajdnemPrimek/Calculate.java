package iker_majdnem_primek;

import java.util.ArrayList;
import java.util.Comparator;

public class Calculate {
	static ArrayList<Integer> almostPrimes = new ArrayList<>();
	static ArrayList<Integer> primes = new ArrayList<>();
	static Pair p;
	static ArrayList<Pair> almostPrimePairs = new ArrayList<>();
	static int n=100;
	
	
	public static void main(String[] args) {
		calcAlmostPrimes(n);
		for (int i = 0; i < almostPrimes.size() - 1; i++) {
			if(almostPrimes.get(i) + 1 == almostPrimes.get(i+1)) {
				p = new Pair(almostPrimes.get(i), almostPrimes.get(i+1));
				almostPrimePairs.add(p);
			}
		}
		for (Pair p : almostPrimePairs)
			System.out.println(p.getFirst() + " " + p.getSecond());			
	}
	
	static void calcPrimes(int n) {
		for(int i = 2; i <= n; i++) {
			if (isPrime(i))
				primes.add(i);
		}
	}
	
	static boolean isPrime(int num) {
		for (int i = 2;i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	static void calcAlmostPrimes(int n) {
		calcPrimes(n);
		
		for (int i = 0; i < primes.size(); i++) {
			for(int j = i; j < primes.size(); j++) {
				
				int tmp = primes.get(i) * primes.get(j);
				
				if(tmp <= n && !almostPrimes.contains(tmp))
					almostPrimes.add(tmp);
			}
		}
		almostPrimes.sort(Comparator.naturalOrder());
	}
}