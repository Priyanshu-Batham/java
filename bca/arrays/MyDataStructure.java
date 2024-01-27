import java.io.*;

class MyDataStructure{
  static int n;
  static int arr[];
  static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String args[]) throws IOException {
    System.out.print("How many Numbers to enter: ");
    n = Integer.parseInt(br.readLine());
    arr = new int[n];

    for(int i = 0; i<n; i++){
      System.out.print("Enter "+(i+1)+" th number: ");
      arr[i] = Integer.parseInt(br.readLine());
    }

    int choice;
    do{
      System.out.println("");
      System.out.println("1: Insert");
      System.out.println("2: Delete");
      System.out.println("3: Find Subsets");
      System.out.println("4: Exit");
      System.out.print("Choice: ");
      choice = Integer.parseInt(br.readLine());

      switch(choice){
      case 1 -> insert();
      case 2 -> delete();
      case 3 -> findSubSets();
      }

    }while(choice != 4);

    
  }

  static void display(){
    for(int i = 0; i<n; i++) System.out.print(arr[i]+" ");
  }

  static void insert() throws IOException {
    System.out.print("Enter the number to insert: ");
    int num = Integer.parseInt(br.readLine());
    System.out.print("Enter the position(index): ");    
    int pos = Integer.parseInt(br.readLine());
    if(pos > n) return;

    n++;
    int newArr[] = new int[n];

    newArr[pos] = num;

    for(int i = 0; i<n-1; i++){
      if(i<pos) newArr[i] = arr[i];
      else newArr[i+1] = arr[i];
    }

    arr = newArr;
    display();
  }

  static void delete() throws IOException {
    System.out.print("Enter the position(index): ");    
    int pos = Integer.parseInt(br.readLine());
    if(pos >= n) return;

    n--;
    int newArr[] = new int[n];

    for(int i = 0; i<n; i++){
      if(i < pos) newArr[i] = arr[i];
      else newArr[i] = arr[i+1];
    }

    arr = newArr;
    display();
  }

  static void findSubSets(){
    for(int i = 0; i<n; i++){
      for(int j = i; j<n; j++){
        System.out.print("[");
        for(int k = i; k <= j; k++){
          System.out.print(arr[k]+" ");
        }
        System.out.println("]");
      }
    }
  }
}