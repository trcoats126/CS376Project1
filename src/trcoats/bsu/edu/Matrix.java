package trcoats.bsu.edu;

import java.util.ArrayList;
import java.util.Scanner;

class Matrix{
    ArrayList<ArrayList<Integer>> matrixAsList;

    Matrix(){
        ArrayList<ArrayList<Integer>>matrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> matrixRows = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String[] rowInput;

        while(true) {
            String input = scanner.nextLine();

            if (input.equals("done")) {
                break;
            }

            if(input.contains(" ")){
                rowInput = input.split(", ");
            }
            else {
                rowInput = input.split(",");
            }

            for (String s : rowInput) {
                int i = Integer.parseInt(s);
                matrixRows.add(i);
            }

            matrix.add(matrixRows);
            matrixRows = new ArrayList<Integer>();
        }
        matrixAsList = matrix;
    }

}
