import java.io.*;

class TiltedHollowSquare{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a number: ");
    int n = Integer.parseInt(br.readLine());

    upperFrame(0, n);
    lowerFrame(0, n);
  }
//------------------------------------------------->

  static void upperFrame(int i, int n){
    //base case
    if(i == n) return;

    //spaces
    for(int j = 0; j < n-(i+1); j++){
      System.out.print(" ");
    }

    //print '|'
    if(i>0) System.out.print("|");
      

    //spaces
    for(int j = 0; j < 2*i-1; j++){
      System.out.print(" ");
    }

    //print '|'
    System.out.print("|");
    System.out.println("");
    
    //recursive call
    upperFrame(i+1, n);
  }

//------------------------------------------------->
  static void lowerFrame(int i, int n){
    if(i == n) return;
    //spaces
    for(int j = 1; j <= i; j++){
      System.out.print(" ");
    }

    //print '|'
    System.out.print("|");

    //spaces
    for(int j = 0; j < 2*(n-i)-3; j++){
      System.out.print(" ");
    }

    //print '|'
    if(i != n-1)  System.out.print("|");
    System.out.println("");
    lowerFrame(i+1, n);
  }
}