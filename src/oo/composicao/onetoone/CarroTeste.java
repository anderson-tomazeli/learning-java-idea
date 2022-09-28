package oo.composicao.onetoone;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println("Carro Ligado? " + c1.estaLigado());

        c1.ligar();
        System.out.println("Carro Ligado? " + c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Faltou encapsulamento para evitar o que ocorre na linha abaixo a fim de evitar a exposição de informar um valor negativo
        //c1.motor.fatorInjecao = -30

        System.out.println(c1.motor.giros());
    }
}
