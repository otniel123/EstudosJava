package Generics.GenericsBasicos.Caixa.entities;

import java.util.ArrayList;
import java.util.List;

public class Caixa <Generic>{
    List<Generic> listaItems = new ArrayList<>();

    public void guardaItem(Generic item){
        this.listaItems.add(item);
    }

    public void removeItem(Generic item){
        try {
            this.listaItems.remove(item);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean estaVazia(){
        if (this.listaItems.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void trocaCaixa(List<Generic> list){
        this.listaItems = list;
    }

    public List<Generic> getListaItems() {
        return listaItems;
    }
}
