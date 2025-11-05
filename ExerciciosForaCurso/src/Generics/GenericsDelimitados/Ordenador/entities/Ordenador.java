package Generics.GenericsDelimitados.Ordenador.entities;

import java.util.List;

public class Ordenador<Generic extends Comparable<Generic>> {
    public void ordenarCrescente(List<Generic> list){
        for (Generic item : list){
            for (int i = 0; i < list.size() - 1; i++){
                if (list.get(i).compareTo(list.get(i + 1)) > 0){
                    Generic aux = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, aux);
                }
            }
        }
        System.out.println(list);
    }

    public void ordernarDecrescente(List<Generic> list){
        for(Generic item : list){
            for(int i = 0; i < list.size() -1; i++){
                if (list.get(i).compareTo(list.get(i + 1)) < 0){
                    Generic aux = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, aux);
                }
            }
        }
        System.out.println(list);
    }

    public Generic encontrarMaior(List<Generic> list){
        Generic maior = list.get(0);
        for (Generic item : list){
            if (item.compareTo(maior) > 0){
                maior = item;
            }
        }
        return maior;
    }

    public Generic encontrarSegundoMaior(List<Generic> list){
        Generic maior = encontrarMaior(list);
        Generic segundoMaior = null;
        for (Generic item : list){
            if (item.compareTo(maior) < 0){
                if (segundoMaior == null || item.compareTo(segundoMaior) > 0){
                    segundoMaior = item;
                }
            }
        }
        return segundoMaior;
    }

    public boolean estaOrdenada(List<Generic> list){
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i).compareTo(list.get(i + 1)) > 0){
                return false;
            }
        }
        return true;
    }
}
