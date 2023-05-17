package com.seleniumexpress.classrefer;

public class Student {
    private int id;
    private  Cheat cheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void startCheating(){
        cheat.mathCheat();
    }
}
