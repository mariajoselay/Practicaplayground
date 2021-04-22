import java.util.Scanner;
public class Ejercicio5 {

    public static boolean checkNumber( int num, int d, int m){
        String[] parts = String.valueOf(num).split("");

        int cont = 0;
        for(int i = 0; i<parts.length;i++){
            if(parts[i].equals(String.valueOf(m))){
                cont++;
            }

        }
        if(cont>=d){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        int num = scanner.nextInt();
        int cont = 0;
        int aux = 1;
        while(true){
            if(cont == num){
                break;
            }
            if(checkNumber(aux,1,4)){
                System.out.println(aux);
                cont++;
            }

            aux++;
        }
    }
}
