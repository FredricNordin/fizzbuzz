package fizzbuzz;

public class Fizzbuzz {
    public static void main(String[] args) {
    	
        for(int i = 1; i <= 100; i++) {
        	if(i % 3 == 0 && i % 5 == 0) {
        		System.out.println("Fizzbuzz");
        	} else if(i % 3 == 0 && i != 42) {
        		System.out.println("Fizz");
        	} else if(i % 5 == 0) {
        		System.out.println("Buzz");
        	} if(i == 42) {
        		System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
        	} else {
        		System.out.println(i);
        	}
        }
    }
}