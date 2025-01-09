import java.util.Scanner;

public class TestSim {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di telefono: ");
        String cellulare = myScanner.nextLine();
        Sim simTelefono = new Sim (cellulare);
        simTelefono.stampaSim();
    }
}
