import java.util.*;

class matrixTranspose{
    public static void main(String args[]){
        Transpose mat1 = new Transpose();
        Transpose mat2 = new Transpose(3, 3);

        mat2.input();
        mat1.rotate(mat2);
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

    void rotate(Transpose mat){
        for(int i = 0; i<mat.m; i++){
            for(int j = 0; j<mat.n; j++){
                a[i][j] = mat.a[j][i];
            }
            System.out.print("Transposing...");
        }
    }

    void display(){
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.print("Donee");
    }
}