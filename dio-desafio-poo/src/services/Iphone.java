package services;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
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

    @Override
    public void exibirPagina() {
        System.out.println("página sendo exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("página atualizada");
    }

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
        System.out.println("música selecionada.");
    }
}
