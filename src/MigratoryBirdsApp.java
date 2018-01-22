// My solution to the HackerRank problem "Migratory Birds."
//https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirdsApp {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
    	int mostCommonBirdCount = 0;
    	int[] tempArray = new int[5];
    	
    	for(int i = 0; i < ar.length; i++) {
    		switch(ar[i]) {
    		case 1:
    			ar[i] = 1;
    			tempArray[0]++;
    			break;
    		case 2:
    			ar[i] = 2;
    			tempArray[1]++;
    			break;
    		case 3:
    			ar[i] = 3;
    			tempArray[2]++;
    			break;
    		case 4:
    			ar[i] = 4;
    			tempArray[3]++;
    			break;
    		case 5:
    			ar[i] = 5;
    			tempArray[4]++;
    			break;
    		}
    	}
    	int mostCommonBird = 1;
    	mostCommonBirdCount = tempArray[0];
    	for(int j = 0; j < tempArray.length; j++) {
    		
    		if(mostCommonBirdCount< tempArray[j]) {
    			mostCommonBirdCount = tempArray[j];
    			mostCommonBird = j+1;
    		}    	
    	}
    	System.out.println(Arrays.toString(tempArray));
    	return mostCommonBird;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for n (integer 5 - 200000): "); 
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            System.out.print("Enter a 'bird type'(integer 1 - 5): "); 
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
        in.close();
    }
}
