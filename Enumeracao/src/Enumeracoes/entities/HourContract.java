package Enumeracoes.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.PrimitiveIterator;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){

    }

    public HourContract(Date date, Integer hours, Double valuePerHour) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
}
