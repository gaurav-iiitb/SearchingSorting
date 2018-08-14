import java.util.*;
class Insertion {
        public static void main(String args[]){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int ar[] = new int[n];
                int temp, j, flag = 0;

                for(int i=0; i<n; i++){
                        ar[i] = scan.nextInt();
                }

		//Applying Insertion Sort
		for(int i=0; i<n-1; i++){
			j=i+1;
			temp = ar[j];
			while(j>0 && ar[j-1] > temp) {
				ar[j] = ar[j-1];
				j--;
			}
			ar[j] = temp;
		}

	        //Printing the sorted array
                System.out.println();
                for(int i=0; i<n; i++){
                        System.out.print(ar[i] + " ");
                }
	
	}
}
