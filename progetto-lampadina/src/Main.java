import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Test della classe lampadina");
        Lampadina l1 = new Lampadina(40);
        System.out.println("stato iniziale l1: " + l1);
        l1.setNome("camera");
        l1.setColore("giallo");
        System.out.println("Dopo setNome e setColore: " + l1);

        l1.accendi();
        System.out.println("Dopo accendi(): " + l1);

        l1.aumentaintensita();
        System.out.println("Dopo aumentaintensita (+10%): " + l1);

        Lampadina l2 = new Lampadina(l1);
        System.out.println("Copia creata l2: " + l2);

        System.out.println("avvio del menu");
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci una potenza in watt per una lampadina");
        float potenza = in.nextFloat();
        in.next();
        Lampadina lampada = new Lampadina(potenza);
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("1. Mostra stato lampadina");
            System.out.println("2. Assegna/Modifica nome");
            System.out.println("3. Imposta colore");
            System.out.println("4. Accendi");
            System.out.println("5. Spegni");
            System.out.println("6. Aumenta illuminazione (+10%)");
            System.out.println("7. Diminuisci illuminazione (-10%)");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = in.nextInt();
            in.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println("Stato attuale " + lampada);
                    break;
                case 2:
                    System.out.print("Inserisci il nuovo nome: ");
                    String nuovoNome = in.nextLine();
                    lampada.setNome(nuovoNome);
                    System.out.println("Nome aggiornato");
                    break;
                case 3:
                    System.out.print("Inserisci il nuovo colore: ");
                    String nuovoColore = in.nextLine();
                    lampada.setColore(nuovoColore);
                    System.out.println("Colore aggiornato");
                    break;
                case 4:
                    lampada.accendi();
                    System.out.println("Lampadina accesa.");
                    break;
                case 5:
                    lampada.spegni();
                    System.out.println("Lampadina spenta.");
                    break;


            }
        }
    }
}
