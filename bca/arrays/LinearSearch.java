import java.io.*;

class LinearSearch{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the quantitiy of data: ");
    int n = Integer.parseInt(br.readLine());

    int[] max = new int[n];
    int[] min = new int[n];
    String[] city = new String[n];
    boolean flag = false;
  
    for(int i = 0; i<n; i++){
      System.out.print("Enter city name: ");
      city[i] = br.readLine();

      System.out.print("Enter min temperature: ");
      min[i] = Integer.parseInt(br.readLine());

      System.out.print("Enter max temperature: ");
      max[i] = Integer.parseInt(br.readLine());

     System.out.println("");
    }

    System.out.print("Enter city to search: ");
    String name = br.readLine();
  
    for(int i = 0; i<n; i++){
      if(city[i].equals(name)){
        System.out.println("City: "+city[i]);
        System.out.println("Min temp: "+min[i]);
        System.out.println("Max temp: "+max[i]);
        flag = true;
        break;
      }
    }

    if(!flag) System.out.print("City not found");
  }
}