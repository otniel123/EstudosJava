package Generics.GenericsBasicos.MinhaLista.services;

import Generics.GenericsBasicos.MinhaLista.entities.MinhaLista;

public class MinhaListaService<Generic> extends MinhaLista<Generic> {
    public void adicionaItem(Generic item){
        this.listaElementos.add(item);
    }

    public Generic obter(int indice){
        return this.listaElementos.get(indice);
    }

    public int tamanho(){
        return this.listaElementos.size();
    }

    public boolean contem(Generic e){
        for (Generic item : this.listaElementos){
            if (item == e){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
