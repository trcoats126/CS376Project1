package trcoats.bsu.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter the matrix with commas separating values in the columns" +
                " and press enter for a new row. Type 'done' when finished");
        Matrix matrix1 = new Matrix();

        System.out.println("\nPlease enter the second matrix with commas separating values in the columns" +
                " and press enter for a new row. Type 'done' when finished");
        Matrix matrix2 = new Matrix();

        if(checkIfMatricesCanBeMultiplied(matrix1, matrix2).equals("Matrices can be multiplied")){
            System.out.print("\n");
            MatrixMultiplier MM1 = new MatrixMultiplier(matrix1, matrix2);
            MM1.start();
        }
        else{
            System.out.println(checkIfMatricesCanBeMultiplied(matrix1, matrix2));
        }

        inputScanner.close();
    }

    private static String checkIfMatricesCanBeMultiplied(ArrayList<ArrayList<Integer>>matrix1, ArrayList<ArrayList<Integer>>matrix2){
        if (!matrix1.isEmpty() && !matrix2.isEmpty()) {
            if(matrix1.get(0).size() == matrix2.size()){
                return "Matrices can be multiplied";
            }
            else if(matrix1.size() == matrix2.get(0).size()){
                return "Matrices can be multiplied";
            }
            else{
                return "Matrices CANNOT be multiplied!";
            }
        }
        return "One or more matrices is empty";
    }

    private static String checkIfMatricesCanBeMultiplied(Matrix matrix1, Matrix matrix2){
        return checkIfMatricesCanBeMultiplied(matrix1.matrixAsList, matrix2.matrixAsList);
    }
}

