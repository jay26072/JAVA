// Write a program in Java to multiply two matrix.Declare a class Matrix where 2D array is declared as instance variable and array should be initialized, within class.
class Matrix{
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};
    int c[][]={{0,0,0},{0,0,0},{0,0,0}};
    
    void multiply(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}   
public class matrix_multiplication{
    public static void main(String args[]){
        Matrix m=new Matrix();
        m.multiply();    
    }
}