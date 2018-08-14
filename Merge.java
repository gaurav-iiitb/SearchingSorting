import java.util.*;
class Merge {
        public static void main(String args[]){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int ar[] = new int[n];
		int temp[] = new int[n];
                int low = 0;
		int high = n-1;

                for(int i=0; i<n; i++){
                        ar[i] = scan.nextInt();
                }
		System.out.println();

                //Applying M erge Sort
		ar = divide(ar, low, high);
		
		//Printing the sorted array
		System.out.println();
		for(int i=0; i<n; i++){
			System.out.print(ar[i] + " ");
		}			
	}

	public static int[] divide(int ar[], int low, int high){
	
		if(low < high) {
			int mid = (low+high)/2;
			divide(ar, low, mid);
			divide(ar, mid+1, high);
			conquer(ar, low, mid+1, high);
		}	
		return ar;
	}

	public static void conquer(int ar[], int low, int mid, int high){

		int temp[] = new int[high-low+1];
		int i = low;
		int j = mid;
		int ctr = 0;
		while(i<mid && j<=high) {
			
			if(ar[i] <= ar[j]) 
				temp[ctr++] = ar[i++];
			else 
				temp[ctr++] = ar[j++];
		}

		//Filling out the remaining elements
		while(i<mid) temp[ctr++] = ar[i++];
		while(j<=high) temp[ctr++] = ar[j++];

		//Storing the sorted values in the original array
		ctr=0;
		for(int k=low; k<=high; k++) {
			ar[k] = temp[ctr++];
		}

		//Printing the sorted values
		for(int k=low; k<=high; k++) {
                        System.out.print(ar[k]+" ");
                }
		System.out.println();
		
	}
}

