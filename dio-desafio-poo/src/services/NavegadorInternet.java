package services;

public class NavegadorInternet implements Interface.NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("página exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba foi adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("página carregada");
    }
}
