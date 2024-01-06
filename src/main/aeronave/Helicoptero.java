package main.aeronave;

public class Helicoptero extends Aeronave {

    float potencia;
    int qtdeHelicopteroGalpao;
    public int MAXHELICOPTEROGALPAO = 3;
    boolean estaGalpao;

    public float getPotencia() {
        return potencia;
    }

    public int getQtdeHelicopteroGalpao() {
        return qtdeHelicopteroGalpao;
    }

    public int getMAXHELICOPTEROGALPAO() {
        return MAXHELICOPTEROGALPAO;
    }

    public boolean getEstaGalpao() {
        return estaGalpao;
    }

    public Helicoptero(String f, double p, String m, boolean a, float pot) {
        this.Fabricante = f;
        this.Preço = p;
        this.Modelo = m;
        this.Tipo = "Helicoptero";
        this.Automatico = a;
        this.potencia = pot;
    }

    public Helicoptero() {

    }

    @Override
    public void acelerar() {
        System.out.println("Helicoptero automático acelerando");
    }

    @Override
    public void acelerar(int marcha) {
        System.out.println("Helicoptero manual acelerando usando a marcha " + marcha);
    }

    @Override
    public String toString() {  //Verificando se está no galpao e se é automático
        if (this.Automatico == true && this.estaGalpao == true) {
            return "Helicoptero automático - {" + "Cilindrada=" + potencia + "- Está no galpão" + '}';
        } else if (this.Automatico == true && this.estaGalpao == false) {
            return "Helicoptero automático - {" + "Cilindrada=" + potencia + "- Não está no galpão" + estaGalpao + '}';
        } else if (this.Automatico == false && this.estaGalpao == true) {
            return "Helicoptero manual - {" + "Cilindrada=" + potencia + "- Está no galpão" + estaGalpao + '}';
        } else {
            return "Helicoptero manual - {" + "Cilindrada=" + potencia + "- Não está no galpão" + estaGalpao + '}';
        }
    }
}


