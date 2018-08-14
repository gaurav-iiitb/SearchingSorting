//Smallest element at the front after every iteration
import java.util.*;
class Selection {
        public static void main(String args[]){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int ar[] = new int[n];
		int min, min_index, temp;                

                for(int i=0; i<n; i++){
                        ar[i] = scan.nextInt();
                }

		//Applying selection sort
		for(int i=0; i<n ;i++) {
			min = ar[i];
			min_index = i;
			for(int j=i+1; j<n; j++) {
				if(min > ar[j]) {
					min = ar[j];
					min_index = j;
				}
			}
			if(min_index != i){
				temp = ar[min_index];
				ar[min_index] = ar[i];
				ar[i] = temp;
			}
		}

		//Printing the sorted values
		System.out.println();
		for(int i=0; i<n; i++){
			System.out.print(ar[i] + " ");
		}
	}
}
