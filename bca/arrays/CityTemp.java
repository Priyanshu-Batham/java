import java.io.*;

class CityTemp{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter how much data: ");
    int n = Integer.parseInt(br.readLine());
    boolean flag = false;

    int min[] = new int[n];
    int max[] = new int[n];
    String city[] = new String[n]; 

    for(int i = 0; i<n; i++){
      System.out.println("");
      System.out.print("Enter City: ");
      city[i] = br.readLine();

      System.out.print("Enter Min Temp: ");
      min[i] = Integer.parseInt(br.readLine());

      System.out.print("Enter Max Temp: ");
      max[i] = Integer.parseInt(br.readLine());
    }
    
    System.out.print("Enter the city name to search: ");
    String name = br.readLine();
  
    //search
    for(int i = 0; i<n; i++){
      if(city[i].equals(name)){
        System.out.println("City: "+ city[i]);
        System.out.println("MinTemp: "+ min[i]);
        System.out.println("MaxTemp: "+ max[i]);
        flag = true;
        break;
      }
    }

    if(flag == false){
      System.out.println("City not Found");
    }
  }
}