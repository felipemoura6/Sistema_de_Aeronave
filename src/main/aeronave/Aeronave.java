package main.aeronave;

public abstract class Aeronave implements Aeromotor {

    protected String Fabricante;
    protected double Preço;
    protected String Modelo;
    protected String Tipo;
    protected boolean Automatico;

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public double getPreço() {
        return Preço;
    }
    
    public String getTipo() {
        return Tipo;
    }
    
    public void setPreço(double Preço) {
        this.Preço = Preço;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public boolean isAutomatico() {
        return Automatico;
    }

    public void setAutomatico(boolean Automatico) {
        this.Automatico = Automatico;
    }

    public Aeronave(String f, double p, String m) {
        this.Fabricante = f;
        this.Preço = p;
        this.Modelo = m;
    }
    
    public Aeronave() {

    }

    @Override
    public void acelerar() {

    }

    public void acelerar(int marcha) {

    }

    @Override
    public void manutenção() {
        System.out.println("Aeronave enviada para manutenção");
    }

    @Override
    public String toString() {
        return "Aeronave{" + "Fabricante=" + Fabricante + ", Preço=" + Preço + ", Modelo=" + Modelo + '}';
    }

    
}
