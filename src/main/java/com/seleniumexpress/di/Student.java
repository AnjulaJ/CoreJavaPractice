package com.seleniumexpress.di;

public class Student {
    String id;
    String name;
    String address;

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void Calling(){
        System.out.println("id: "+ id + "\nName: "+name + "\nAddress:" +address);
    }
}