package Generics.GenericsBasicos.MinhaLista.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class MinhaLista <Generic>{
    protected List<Generic> listaElementos = new ArrayList<>();

    public List<Generic> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(List<Generic> listaElementos) {
        this.listaElementos = listaElementos;
    }


}
