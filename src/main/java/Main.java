import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj znak, który ma być użyty do budowy ramki:");
        char ramkaZnak = scanner.next().charAt(0);

        System.out.println("Podaj wysokość ramki:");
        int wysokosc = scanner.nextInt();

        
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j <= i * 2; j++) {
                if (i == wysokosc - 1 || j == 0 || j == i * 2) {
                    System.out.print(ramkaZnak) ;
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}

