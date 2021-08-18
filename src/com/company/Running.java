package com.company;

public class Running extends Hobbies{
    String typeRunning;
    double nroKm;
    double nroTime;

    public Running(String typeRunning, double nroKm, double nroTime) {
        this.typeRunning = typeRunning;
        this.nroKm = nroKm;
        this.nroTime = nroTime;
    }

    public String getTypeRunning() {
        return typeRunning;
    }

    public double getNroKm() {
        return nroKm;
    }

    public double getNroTime() {
        return nroTime;
    }

    public String displayData(){
        return "the user has typeRunning : "+getTypeRunning()+ " the user has nroKm : "+getNroKm()+ " the user has nroTime : "+getNroTime();

    }
}
