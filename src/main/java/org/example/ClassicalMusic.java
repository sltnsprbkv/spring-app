package org.example;

public class ClassicalMusic implements Music{
    public void doMyInit() {
        System.out.println("Doing my init");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return "classic song";
    }
}
