import services.Iphone;

public class IphoneFuncionando {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Fazendo/recebendo ligação");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("********");

        System.out.println("Navegando na Internet");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        System.out.println("********");

        System.out.println("Reproduzindo Música");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }
}