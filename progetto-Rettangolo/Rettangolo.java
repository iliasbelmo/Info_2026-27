public class Rettangolo {
    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public double getLarghezza() {
        return Math.abs(this.a.getX() - this.b.getX());
    }

    public double getAltezza() {
        return Math.abs(this.a.getY() - this.b.getY());
    }

    public double calcolaPerimetro() {
        return 2 * (getLarghezza() + getAltezza());
    }

    public double calcolaArea() {
        return (getAltezza()*getLarghezza())/2
    }

}