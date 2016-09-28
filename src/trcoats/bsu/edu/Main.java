package trcoats.bsu.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter the first matrix with commas separating values in the columns" +
                " and press enter for a new row. Type 'done' when finished");
        Matrix matrix1 = new Matrix();

        System.out.println("\nPlease enter the second matrix with commas separating values in the columns" +
                " and press enter for a new row. Type 'done' when finished");
        Matrix matrix2 = new Matrix();

        System.out.println(checkIfMatricesCanBeMultiplied(matrix1.matrixAsList, matrix2.matrixAsList));

        inputScanner.close();
    }

    private static String checkIfMatricesCanBeMultiplied(ArrayList<ArrayList<Integer>>matrix1, ArrayList<ArrayList<Integer>>matrix2){
        System.out.println(matrix1);
        System.out.println(matrix2);

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

            //multiplyMatrices(matrix1, matrix2);
        }
        return "One or more matrices is empty";
    }
}

