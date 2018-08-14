import java.util.*;
class BinarySearch {
        public static void main(String args[]){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int ar[] = new int[n];
                int flag = 0, key;
		int low = 0;
		int high = n-1, mid;

                for(int i=0; i<n; i++){
                        ar[i] = scan.nextInt();
                }

                System.out.println();
                System.out.println("Enter key to be searched");
                key = scan.nextInt();
		
		while(low <= high){
			
			mid = low + (high-low)/2;
			if(ar[mid] == key){
				flag = 1;
				System.out.print("key found at index "+ mid);
				break;
			} else if(ar[mid]>key){
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
                
                if(flag == 0){
                        System.out.println("Element not found");
                }
        }
}

