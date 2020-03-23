import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0) return A;
        int n = A.length;
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            B[i] = 1;
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                B[i] *= A[j];
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                B[i] *= A[j];
            }
        }
        return B;
    }
}


import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0) return A;
        int n = A.length;
        int[] B = new int[n];
        for(int i = 0, product = 1; i < n; i++){
            B[i] = product;
            product *= A[i];
        }
        for(int i = n-1, product = 1; i >= 0; i--){
            B[i] *= product;
            product *= A[i];
        }
        return B;
    }
}

import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0) return A;
        int n = A.length;
        int[] B = new int[n];
        for(int i = 0, product = 1; i < n; product *= A[i],i++){
            B[i] = product;
        }
        for(int i = n-1, product = 1; i >= 0; product *= A[i],i--){
            B[i] *= product;
        }
        return B;
    }
}























