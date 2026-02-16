import java.util.Scanner;

public class Main{
public static void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.printf("Hány fok van? ");
    int homerseklet = scanner.nextInt();

    if(homerseklet>30){
        System.out.printf("Túl meleg.\n");
    } else if (0>homerseklet) {
        System.out.printf("Fagypont alatti.\n");
    }
    else{
        System.out.printf("Átlagos.\n");
    }

    System.out.printf("Hány másodperce hallottad a villámot? ");
    int masodperc = scanner.nextInt();
    while (masodperc<0){
        System.out.printf("Hány másodperce hallottad a villámot? ");
        masodperc = scanner.nextInt();
    }
    System.out.printf(masodperc*300 +" méterre van a villám.\n");

    System.out.printf("Hány éves vagy? (1-20 között): ");
    String csillag = "*";
    String szar = "|";
    String vonal="-";
    int kor = scanner.nextInt();
    while (kor>20 || 1>kor){
        System.out.printf("Hány éves vagy? (1-20 között): ");
        kor = scanner.nextInt();
    }
        for (int i = 1; i < kor; i++) {
            csillag+= " *";
            szar+= " |";
            vonal+="--";
    }
    System.out.printf(csillag+ "\n"+ szar+ "\n"+ vonal);

}
}