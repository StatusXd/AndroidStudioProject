package com.example.androidstudioproject.Data.Models;

public class ListModule {
    private String name; // название
    private String number;  // столица
    private int flag; // ресурс флага

    public ListModule(String name, String number, int flag){
        this.name=name;
        this.number=number;
        this.flag=flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFlag() {
        return this.flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
