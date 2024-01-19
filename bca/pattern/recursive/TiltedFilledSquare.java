import java.io.*;

class TiltedFilledSquare{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a number: ");
    int n = Integer.parseInt(br.readLine());

    upperFrame(0, n);
    lowerFrame(0, n);   
  }
//------------------------------------->
  static void upperFrame(int i, int n){
    //base case
    if(i==n) return;

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

    //call recursively
    upperFrame(i+1, n);
  }
//------------------------------------->

  static void lowerFrame(int i, int n){
    //base case
    if(i==n) return;

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

    //call recursively
    lowerFrame(i+1, n);
  }  
}