import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("podaj pierwszy znak: ");
        char char1 = scanner.next().charAt(0);
        System.out.println("podaj drugi znak: ");
        char char2 = scanner.next().charAt(0);
       
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(char1 + " ");
                } else {
                    System.out.print(char2 + " ");
                }
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}