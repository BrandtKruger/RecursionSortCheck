package com.Kruger.bdg;

public class Main {

    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        isArrayInSortedOrder( A, A.length - 1 );


    }

    static public int isArrayInSortedOrder( int[] A, int index){

        if( A.length == 1 ){
            return 1;
        }
        //System.out.println( A[ index ]);

        return (A[index - 1 ] < A[index - 2 ] ) ? 0: isArrayInSortedOrder(A, index -1 );
    }
}


