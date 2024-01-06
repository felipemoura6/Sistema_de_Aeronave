package main.aeronave;

public class Aviao extends Aeronave {

    private int qtdePassageiros;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Aviao(String f, double p, String m, boolean a, int q) {
        this.Fabricante = f;
        this.Preço = p;
        this.Modelo = m;
        this.Tipo = "Aviao";
        this.Automatico = a;
        this.qtdePassageiros = q;
    }

    public Aviao(double p, String m, boolean a, int q) {
        this.Fabricante = "Boeing";
        this.Preço = p;
        this.Modelo = m;
        this.Tipo = "Aviao";
        this.Automatico = a;
        this.qtdePassageiros = q;
    }

    public Aviao() {

    }

    @Override
    public void acelerar() {
        System.out.println("Avião automático acelerando");
    }

    @Override
    public void acelerar(int marcha) {

        System.out.println("Avião manual acelerando usando a marcha " + marcha);
    }

    @Override
    public String toString() {
        if (this.Automatico == true) {
            System.out.println("Avião Automático");
            return "Aviao automático -{" + "quantidade de passageiros=" + qtdePassageiros + '}';
        } else {
            return "Aviao manual -{" + "quantidade de passageiros=" + qtdePassageiros + '}';
        }
    }
    
    

}
