package services;

public class ReprodutorMusical implements Interface.ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("música sendo reproduzida");
    }

    @Override
    public void pausar() {
        System.out.println("música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("musica selecionada!");
    }
}
