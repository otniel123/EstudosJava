package Generics.TiposCuringa.entities;

import java.util.List;

public class Impressora {
    public static void imprimirLista(List<?> lista){
        for (int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public static int contaNulos(List<?> lista){
        int sum = 0;
        for(int i =0; i<lista.size(); i++){
            if (lista.get(i) == null){
                sum++;
            }
        }
        return sum;
    }
}
