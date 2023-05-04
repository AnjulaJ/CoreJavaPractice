package com.seleniumexpress.ioc;

public class Hutch implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling using Hutch Sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using Hutch sim");
    }
}
