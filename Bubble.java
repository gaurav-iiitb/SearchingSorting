//Remember the max array size for your system config is 5.6 * 10^6
//int in java is 32 bits hence 2^32 = 2147......(10 digit number)
//Largest element at the end after every iteration
import java.util.*;
class Bubble {
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[] = new int[n];
		int temp, flag = 0;

		for(int i=0; i<n; i++){
			ar[i] = scan.nextInt();
		}

		//Applying bubble sort
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				if(ar[j] > ar[j+1]){
					flag = 1;
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			if(flag == 0){
				break;
			}
			flag = 0;
		}

		//Printing the sorted values
		System.out.println();
		for(int i=0; i<n; i++){
			System.out.print(ar[i] + " ");
		}
	}
}
