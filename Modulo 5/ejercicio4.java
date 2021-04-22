package com.company;


public class numerosNaturales {
    public static boolean esPrimo(int num){
        int cont = 0;
        for(int i = 1; i<=num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if(cont == 2){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 5;
        int cont = 0;
        for(int j = 1; j<=num; j++ ){
            if(esPrimo(j)) {
                System.out.println(j);
            }
        }
    }
}
