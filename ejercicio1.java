import java.util.Scanner;
public class numero1 {
    public static boolean esPar(int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cont = 0;
        int i = 1;
        while(cont<num){
            if(esPar(i)){
                System.out.println(i);
                cont++;
            }

            i++;
        }
    }
}
