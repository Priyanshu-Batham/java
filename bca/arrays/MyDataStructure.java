import java.io.*;

class MyDataStructure{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int arr[];

    System.out.print("How many Numbers to enter: ");
    n = Integer.parseInt(br.readLine());
    arr = new int[n];

    for(int i = 0; i<n; i++){
      System.out.print("Enter "+(i+1)+" th number: ");
      arr[i] = Integer.parseInt(br.readLine());
    }

    int choice;
    do{
      n = arr.length;
      System.out.println("");
      System.out.println("1: Insert");
      System.out.println("2: Delete");
      System.out.println("3: Find Subsets");
      System.out.println("4: Exit");
      System.out.print("Choice: ");
      choice = Integer.parseInt(br.readLine());

      switch(choice){
      case 1 -> arr = insert(arr, n);
      case 2 -> arr = delete(arr, n);
      case 3 -> findSubSets(arr, n);
      }

    }while(choice != 4);

    
  }

  static void display(int arr[], int n){
    for(int i = 0; i<n; i++) System.out.print(arr[i]+" ");
  }

  static int[] insert(int arr[], int n) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number to insert: ");
    int num = Integer.parseInt(br.readLine());
    System.out.print("Enter the position(index): ");    
    int pos = Integer.parseInt(br.readLine());
    if(pos > n) return arr;

    n++;
    int newArr[] = new int[n];

    newArr[pos] = num;

    for(int i = 0; i<n-1; i++){
      if(i<pos) newArr[i] = arr[i];
      else newArr[i+1] = arr[i];
    }

    arr = newArr;
    display(arr, n);
    return arr;
  }

  static int[] delete(int arr[], int n) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the position(index): ");    
    int pos = Integer.parseInt(br.readLine());
    if(pos >= n) return arr;

    n--;
    int newArr[] = new int[n];

    for(int i = 0; i<n; i++){
      if(i < pos) newArr[i] = arr[i];
      else newArr[i] = arr[i+1];
    }

    arr = newArr;
    display(arr, n);
    return arr;
  }

  static void findSubSets(int []arr, int n){
     for(int i = 0; i<(1<<n); i++){
       int num = i;
       int index = 0;
     
       System.out.print("{");
       while(num != 0){
         if((num & 1) == 1) System.out.print(arr[index]+" ");
         index++;
	 num = num>>1;
       }
       System.out.println("}");
     }
  }









}