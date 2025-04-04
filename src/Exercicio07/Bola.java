package Exercicio07;

public class Bola {
    private String cor;
    private double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Bola maiorBola(Bola bola2, Bola bola3) {
       Bola aux = null;
        if(this.raio > bola2.raio && this.raio > bola3.raio)
            aux = this;
        else if(bola2.raio > bola3.raio)
            aux = bola2;
        else {
            aux = bola3;
        }
        return aux;
    }

    public String retornarDados() {
       return cor + " " + raio;
    }

}
