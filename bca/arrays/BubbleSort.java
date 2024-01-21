import java.io.*;

class BubbleSort{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the amount of data: ");
    int n = Integer.parseInt(br.readLine());
    
    int arr[] = new int[n];
    
    for(int i = 0; i<n; i++){
      System.out.print("Enter number: ");
      arr[i] = Integer.parseInt(br.readLine());
    }
 
    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-1-i; j++){
        if(arr[j] > arr[j+1]){
	  int temp = arr[j];
	  arr[j] = arr[j+1];
	  arr[j+1] = temp;
        }
      }
    }

    for(int i = 0; i<n; i++){
      System.out.println(arr[i]);
    }
  }
}

//n 5
//i 1
//4 3 2 1 5