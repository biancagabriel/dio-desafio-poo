package services;

public class AparelhoTelefonico implements Interface.AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("LIGANDO...");
    }

    @Override
    public void atender() {
        System.out.println("ALÔ?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamada não atendida, deixe recado!");
    }
}
