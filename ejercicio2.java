import java.util.Scanner;
public class ejercicio2 {
    public static boolean esMultiplo(int num, int multiplo){
        if(num % multiplo == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 8;
        int cont = 0;
        int aux = 1;
        while(cont<n){
            if(esMultiplo(aux,m)){
                System.out.println(aux);
                cont++;
            }
            aux++;

        }
    }
}
