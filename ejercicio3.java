import java.util.Scanner;
public class ejercicio3 {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Es numero:");
        int num = scanner.nextInt();

        System.out.println(esPrimo(num));
    }
}
