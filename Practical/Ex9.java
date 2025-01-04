/* 9.Write a java program to create a class “Matrix” that would contain integer values having varied Numbers of columns for each row. 
Print row-wise sum of the integer values for each row.*/

class Ex9{
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=a[i][j];
            }
            System.out.println(sum);
        }
    }
}