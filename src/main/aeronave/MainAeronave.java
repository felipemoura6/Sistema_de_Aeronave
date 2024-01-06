package main.aeronave;

import java.util.ArrayList;

public class MainAeronave {   //Felipe Moura Ribeiro

    static ArrayList Aeronaves = new ArrayList(10);

    public static void main(String[] args) {

        int nAeronaveEscolhida; //Variável que auxilia na hora de escolher uma aeronave para manutenção

        Aviao a1 = new Aviao("Hort", 10000, "Renault", true, 100);
        Aviao a2 = new Aviao("Venzel", 20000, "Renault", true, 90);
        Aviao a3 = new Aviao("Airlines", 30000, "Renault", true, 80);
        Aviao a4 = new Aviao("Airways", 40000, "Renault", true, 70);
        Aviao a5 = new Aviao("Boeing", 50000, "Renault", true, 60);
        Aeronaves.add(a1);
        Aeronaves.add(a2);
        Aeronaves.add(a3);
        Aeronaves.add(a4);
        Aeronaves.add(a5);

        Helicoptero h1 = new Helicoptero("Hort", 10000, "Renault", true, 1000);
        Helicoptero h2 = new Helicoptero("Venzel", 20000, "Renault", true, 900);
        Helicoptero h3 = new Helicoptero("Airlines", 30000, "Renault", true, 800);
        Helicoptero h4 = new Helicoptero("Airways", 40000, "Renault", true, 700);
        Helicoptero h5 = new Helicoptero("Boeing", 50000, "Renault", true, 600);
        Aeronaves.add(h1);
        Aeronaves.add(h2);
        Aeronaves.add(h3);
        Aeronaves.add(h4);
        Aeronaves.add(h5);

        int nJaEscolhido = -1; //Variavel que controla se o numero ja saiu para n mandar a mesma aeronave para a manutencao
        nJaEscolhido = AeronaveManutencao(nJaEscolhido);
        nJaEscolhido = AeronaveManutencao(nJaEscolhido);
    }

    public static int AeronaveManutencao(int n) {
        int nAeronaveEscolhida = (int) (Math.random() * 10);

        for (int i = 0; i < Aeronaves.size(); i++) {
            if (n != nAeronaveEscolhida) {  //Só enviará para manutenção se a aeronave não foi escolhida ainda
                if (nAeronaveEscolhida == i) {
                    if (Aeronaves.get(i) instanceof Aviao) {

                        System.out.println("Avião");
                        Aeronave a = new Aviao();
                        a.manutenção();
                        a.toString();

                    } else {
                        System.out.println("Helicoptero");
                        Aeronave a = new Helicoptero();
                        a.manutenção();
                        a.toString();
                    }
                }
            }

        }

        System.out.println("Numero escolhido: " + nAeronaveEscolhida);
        
        if (n == nAeronaveEscolhida) {
            System.out.println("Esta aeronave já foi para a manutenção");
        }
        
        System.out.println("");
        return nAeronaveEscolhida;
    }
}
