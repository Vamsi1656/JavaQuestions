package MatrixPrograms;

public class TransposeMatrix {

    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        int transpose[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                transpose[i][j]=a[j][i];
            }
        }


        System.out.println("Printing matrix before transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Printing matrix after transpose");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
