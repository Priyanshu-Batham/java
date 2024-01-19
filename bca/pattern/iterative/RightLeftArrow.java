import java.io.*;

class RightLeftArrow{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a number: ");
    int n = Integer.parseInt(br.readLine());

    //upper frame
    for(int i = 0; i<n; i++){
      
      //incr nums
      for(int j = 1; j <= i+1; j++){
        System.out.print(j);
      }

      //spaces
      for(int j = 0; j < 2*(n-i-1); j++){
        System.out.print(" ");
      }
      
      //decr nums
      for(int j = i+1; j > 0; j--){
        System.out.print(j);
      }
      System.out.println("");
    }

    //lower frame
    for(int i = 0; i<n; i++){
      
      //incr nums
      for(int j = 1; j <= n-i; j++){
        System.out.print(j);
      }

      //spaces
      for(int j = 0; j < 2*i; j++){
        System.out.print(" ");
      }
      
      //decr nums
      for(int j = n-i; j > 0; j--){
        System.out.print(j);
      }
      System.out.println("");
    }  
  }
}