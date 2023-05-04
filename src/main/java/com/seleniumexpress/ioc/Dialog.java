package com.seleniumexpress.ioc;

public class Dialog implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling using Dialog Sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using Dialog sim");
    }
}
