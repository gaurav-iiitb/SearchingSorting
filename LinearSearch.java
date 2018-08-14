import java.util.*;
class LinearSearch {
        public static void main(String args[]){

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int ar[] = new int[n];
                int flag = 0, key;

                for(int i=0; i<n; i++){
                        ar[i] = scan.nextInt();
                }
		
		System.out.println();
		System.out.println("Enter key to be searched");
		key = scan.nextInt();	
			
		for(int i=0; i<n; i++) {
			if(ar[i] == key){
				System.out.println("Key found at index " + i);
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("Element not found");
		}
	}
}
