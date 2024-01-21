import java.io.*;

class SelectionSort{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the amount of data: ");
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];

    for(int i = 0; i<n; i++){
      System.out.print("Enter the number: ");
      arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j<n; j++){
        if(arr[i] > arr[j]){
	  int temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
        }
      }
    }

    for(int i = 0; i<n; i++){
      System.out.println(arr[i]);
    }
  }
}