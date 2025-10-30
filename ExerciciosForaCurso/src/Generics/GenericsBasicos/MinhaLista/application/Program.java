package Generics.GenericsBasicos.MinhaLista.application;


import Generics.GenericsBasicos.MinhaLista.services.MinhaListaService;

public class Program {
    public static void main(String[] args) {
        MinhaListaService<Integer> listaService = new MinhaListaService();



        System.out.println(listaService.tamanho());
        System.out.println(listaService.getListaElementos());
        listaService.adicionaItem(12);
        listaService.adicionaItem(14);
        listaService.adicionaItem(16);
        System.out.println(listaService.tamanho());
    }
}
