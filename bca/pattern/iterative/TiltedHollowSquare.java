import java.io.*;

class TiltedHollowSquare{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a number: ");
    int n = Integer.parseInt(br.readLine());

    //upper frame
    for(int i = 0; i<n; i++){

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
    }
//------------------------------------------------->
    //lower frame
    for(int i = 1; i<n; i++){

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
    }
  }
}