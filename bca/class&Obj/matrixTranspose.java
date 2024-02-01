import java.util.*;

class matrixTranspose{
    public static void main(String args[]){
        Transpose mat1 = new Transpose(4, 4);

        mat1.input();
        mat1.display();
        // mat1.forRow();
        // mat1.display();
        mat1.forCol();
        mat1.display();
    }
}

class Transpose{
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[100][100];
    int m, n;

    Transpose(){
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                a[i][j] = 0;
            }
        }
    }

    Transpose(int x, int y){
        m = x;
        n = y;
        a = new int[m][n];
    }

    void input(){
        System.out.println("Enter");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    void rotate(){
        for(int i = 0; i<m; i++){
            for(int j = i; j<n; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    void display(){
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------");
    }

    void forRow(){
        for(int i = 0; i<m ; i++){
            int temp = a[i][n-1];
            for(int j = n-2; j>=0; j--){
                a[i][j+1] = a[i][j];
            }
            a[i][0] = temp;
        }
    }

    void forCol(){
        for(int i = 0; i<n; i++){
            int temp = a[0][i];
            for(int j = 1; j<m; j++){
                a[j-1][i] = a[j][i];
            }
            a[m-1][i] = temp;
        }
    }
}