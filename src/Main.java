import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci i 2 lati del rettangolo: ");
        double lato1 = myScanner.nextDouble();
        double lato2 = myScanner.nextDouble();
        Rectangle pitagoraChi = new Rectangle(lato1,lato2);
        pitagoraChi.stampaRettangolo();

        myScanner.close();

    }
}
