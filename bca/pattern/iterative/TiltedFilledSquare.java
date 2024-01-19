import java.io.*;

class TiltedFilledSquare{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a number: ");
    int n = Integer.parseInt(br.readLine());

    //upper triangle
    for(int i = 0; i<n; i++){

      //space
      for(int j = 0; j<n-i-1; j++){
        System.out.print(" ");
      }

      //incr nums
      for(int j = 1; j<=i+1; j++){
        System.out.print(j);        
      }

      //decr nums
      for(int j = i; j>0; j--){
        System.out.print(j);        
      }
      System.out.println("");
    }
//--------------------------------------

    //lower triangle
    for(int i = 1; i<n; i++){

      //space
      for(int j = 1; j<=i; j++){
        System.out.print(" ");
      }

      //incr nums
      for(int j = 1; j<=n-i; j++){
        System.out.print(j);        
      }

      //decr nums
      for(int j = n-i-1; j>0; j--){
        System.out.print(j);        
      }
      System.out.println("");
    }  

    
  }
}