public class Studenti {
    private String nome;
    private String cognome;
    private int eta;
    private double peso;
    private double altezza;

    public Studenti () {
        this.nome = "";
        this.cognome = "";
        this.eta = 0;
        this.altezza = 0.0;
        this.peso = 0.0;
    }
    public Studenti (Studenti  altro) {
        this.nome = altro.nome;
        this.cognome = altro.cognome;

        if (altro.eta > 0) {
            this.eta = altro.eta;
        } else {
            this.eta = 0;
        }
        if (altro.altezza > 0) {
            this.altezza = altro.altezza;
        } else {
            this.altezza = 0.0;
        }

        if (altro.peso > 0) {
            this.peso = altro.peso;
        } else {
            this.peso = 0.0;
        }
    }



}
