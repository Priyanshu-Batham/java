import java.io.*;
class ArrayProgram1{
  static int arr[] = new int[10];
  static int n = 10;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("You have to input "+n+" numbers!");
    for(int i = 0; i<n; i++){
      System.out.print("Enter " + (i+1) + "th number: ");
      arr[i] = Integer.parseInt(br.readLine());
    }

    System.out.println("");
    sumOfAllElements();
    sumOfOddEven();
    sumOfPosNeg();
    countEvenOdd();
    countPosNeg();
    countdigits();
    
  }

  static void sumOfAllElements(){
    int sum = 0;
    for(int i = 0; i<n; i++) sum += arr[i];
    System.out.println("Sum of all elements: "+sum);
  }

  static void sumOfOddEven(){
    int oddSum = 0, evenSum = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] % 2 == 0) evenSum += arr[i];
      else oddSum += arr[i];
    }
    System.out.println("Sum of Even Elements: "+evenSum);
    System.out.println("Sum of Odd Elements: "+oddSum);
  }

  static void sumOfPosNeg(){
    int pos = 0, neg = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] > 0) pos += arr[i];
      if(arr[i] < 0) neg += arr[i];
    }
    System.out.println("Sum of Positive Elements: "+pos);
    System.out.println("Sum of Negative Elements: "+neg);
  }

  static void countEvenOdd(){
    int odd = 0, even = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] % 2 == 0) even++;
      else odd	++;
    }
    System.out.println("Count of Even Elements: "+even);
    System.out.println("Count of Odd Elements: "+odd);
  }

  static void countPosNeg(){
    int pos = 0, neg = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] > 0) pos++;
      if(arr[i] < 0) neg++;
    }
    System.out.println("Count of Positive Elements: "+pos);
    System.out.println("Count of Negative Elements: "+neg);
  }

  static void countdigits(){
    int twoDig = 0, threeDig = 0;
    for(int i = 0; i<n; i++){
      if(String.valueOf(arr[i]).length() == 2) twoDig++;
      if(String.valueOf(arr[i]).length() == 3) threeDig++;
    }
    System.out.println("Count of two digit numbers: "+twoDig);
    System.out.println("Count of three digit numbers: "+threeDig);
  }
  
}








