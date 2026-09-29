public class Lampadina {
    private float potenza;
    private int intensita;
    private String colore;
    private String nome;
    private boolean accesa;

public Lampadina(float potenza){
     this.potenza = potenza;
     this.intensita = 50;
     this.colore = "bianco";
     this.nome = "";
     this.accesa = false;
}
public Lampadina(Lampadina altra){
    this.potenza = altra.potenza;
    this.intensita = altra.intensita;
    this.colore = altra.colore;
    this.nome = altra.nome;
    this.accesa = altra.accesa;
}
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public float getPotenza() {
        return this.potenza;
    }

    public int getQuantitaintensita() {
        return this.intensita;
    }

    public boolean isAccesa() {
        return this.accesa;
    }

    public void accendi() {
        this.accesa = true;
    }

    public void spegni() {
        this.accesa = false;
    }

    public void aumentaintensita() {
        this.intensita += 10;
        if (this.intensita > 100) {
            this.intensita = 100;
        }
    }

    public void diminuisciintensita() {
        this.intensita -= 10;
        if (this.intensita < 0) {
            this.intensita = 0;
        }
 }
    @Override
    public String toString() {
        String statoStr = this.accesa ? "accesa" : "spenta";
        String nomeStr = this.nome.isEmpty() ? "non assegnato" : this.nome;

        return "Nome: " + nomeStr +
                ", Potenza: " + (int)this.potenza + " watt" +
                ", Stato: " + statoStr +
                ", Qta: " + this.intensita + "%" +
                ", Colore: " + this.colore;
    }
}

