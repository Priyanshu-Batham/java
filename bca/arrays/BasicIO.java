import java.io.*;

class BasicIO{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a number: ");
    int n = Integer.parseInt(br.readLine());

    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      System.out.print("Enter the nums: ");
      arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0; i<n; i++){
      System.out.println("number: "+arr[i]);
    }
  }
}