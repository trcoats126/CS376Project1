package trcoats.bsu.edu;

import java.util.ArrayList;

public class MatrixMultiplier implements Runnable{
    Matrix matrix1;
    Matrix matrix2;
    private Thread t;

    MatrixMultiplier(Matrix matrix1, Matrix matrix2){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    @Override
    public void run() {
        ArrayList<ArrayList<Integer>> matrix1List = matrix1.matrixAsList;
        ArrayList<ArrayList<Integer>> matrix2List = matrix2.matrixAsList;
        int result = 0;

        if(matrix2List.size() > matrix1List.get(0).size()){
            ArrayList<ArrayList<Integer>> temp = matrix1List;
            matrix1List = matrix2List;
            matrix2List = temp;
        }

        int matrix1ColLength = matrix1List.get(0).size();
        int matrix2ColLength = matrix2List.get(0).size();
        int matrix1RowLength = matrix1List.size();

        for(int i = 0; i < matrix1RowLength; i++){
            for(int j = 0; j < matrix2ColLength; j++){
                for(int k = 0; k < matrix1ColLength; k++){
                    result += (matrix1List.get(i).get(k) * matrix2List.get(k).get(j));
                }
                System.out.print(result + "  ");
                result = 0;
            }
            System.out.print("\n");
        }
    }

    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }

}
