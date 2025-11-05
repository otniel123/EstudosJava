package Generics.GenericsDelimitados.Estatistica.application;

import java.util.ArrayList;
import java.util.List;

public class Estatistica <Generic extends Number>{
    protected List<Generic> list = new ArrayList<>();

    public List<Generic> getList() {
        return list;
    }

    public void setList(List<Generic> list) {
        this.list = list;
    }
    
    public double media(){
        double sum = 0;
        
        for (Generic e : this.list){
            sum += e.doubleValue();
        }
        return sum / this.list.size();
    }

    public double maxValue(){
        double max = 0;
        for (Generic e : list){
            if (e.doubleValue() > max){
                max = e.doubleValue();
            }
        }
        return max;
    }

    public double minValue(){
        double max = 0;
        for (Generic e : list){
            if (e.doubleValue() < max){
                max = e.doubleValue();
            }
        }
        return max;
    }
}
