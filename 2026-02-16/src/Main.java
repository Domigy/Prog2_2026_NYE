import java.util.Scanner;

public class Main{
public static void main() {

    Scanner scanner = new Scanner(System.in);
    int homerseklet = scanner.nextInt();
    if(homerseklet>30){
        System.out.printf("Túl meleg.");
    } else if (0>homerseklet) {
        System.out.printf("Túl hideg.");
    }
    else{
        System.out.printf("Átlagos.");
    }

}
}