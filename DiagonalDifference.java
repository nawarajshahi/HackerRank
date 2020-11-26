package com.hakerRank;
/*
create surare of values using array
find leftDiagonal, rightDiagonal
and printout the absolute value of leftDiagonal and rightDiagonal
 */

public class DiagonalDifference {
    public static void main(String[] args) {
        int n = 3;
        int[][]square = new int[n][n];

        //set values of square
        setArrayValues(square);

        //print values of the square
        System.out.println("__Values of the Square__");
        printArray(square);

        //find absolute diagonal difference
        System.out.println("__Absolute difference between left and right diagonal__");
        printDiagonal(square);

    }
    //diagonal difference method implementation
    public static void printDiagonal(int [][] square){
        int leftDiagonal = 0, rightDiagonal=0;
        for (int i = 0, j = square.length-1;
             (i < square.length) && j >=0;
             i++, j--){
            leftDiagonal += square[i][i];
            rightDiagonal +=square[i][j];

        }
        System.out.println(Math.abs(leftDiagonal-rightDiagonal));
    }

    //print Array method implementation
    public static void printArray(int[][] square){
        for (int[] row : square) {
            for (int column = 0; column < square.length; column++) {
                System.out.print("\t" + row[column]);
            }
            System.out.println();
        }
    }


    //Set values of array method implementation
    public static void setArrayValues(int[][] square){
        for (int row = 0; row < square.length ; row++) {
            for (int column = 0; column < square.length ; column++) {
                int randNum = (int)(Math.random()*100+1);
                square[row][column] = randNum;

            }
        }
    }
}
