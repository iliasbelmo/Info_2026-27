import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci le coordinate del punto A (x1 y1):");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.println("Inserisci le coordinate del punto B (x2 y2):");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        Rettangolo rettangolo = new Rettangolo(p1, p2);

        System.out.println(rettangolo.toString());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("Area: " + rettangolo.calcolaArea());
    }
}