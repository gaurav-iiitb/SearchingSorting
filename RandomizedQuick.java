import java.util.*;
class RandomizedQuick {

        public static void main(String args[]){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int ar[] = new int[n];
		int low = 0, high = n-1;
                for(int i=0; i<n; i++){
                        ar[i] = scan.nextInt();
                }

                //Applying quick sort
		ar = quick(ar, low, high);
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(ar[i]+" ");
		}
        }

	public static int[] quick(int ar[], int low, int high) {
		
		int temp;	
		if(low<high){
			//Math.Random generates number in range from 0 to 1 both inclusive
			int p = (int)(Math.random()*(high-low) + low);
			temp = ar[p];
			ar[p] = ar[high];
			ar[high] = temp;
			int k = partition(ar, low, high);
			quick(ar, low, k-1);
			quick(ar, k+1, high);
		}
		return ar;
	}

	public static int partition(int ar[], int low, int high) {

		int pivot = high;
		int i = low;
		int j = high-1;
		int temp;
		
		while(i<=j){

			while(i<=j && ar[i]<ar[pivot])
				i++;
				
			while(i<=j && ar[j]>ar[pivot])
				j--;
	
			if(j<=i){
				temp = ar[pivot];
				ar[pivot] = ar[i];
				ar[i] = temp;
				break;
			} else {
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				i++; j--;
			}
		}
	
		return i;
	}
}
  
