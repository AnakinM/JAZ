package com.anikiej.demo;

public class MyPlainJavaObject {
    private String name;
    private int count;
    private float price;

    public MyPlainJavaObject() {
        System.out.println("MyPlainJavaObject instance created");
    }

    public MyPlainJavaObject(String name) {
        this.name = name;
        System.out.println("MyPlainJavaObject instance created");
    }

    public MyPlainJavaObject(String name, int count, float price) {
        this.name = name;
        this.count = count;
        this.price = price;
        System.out.println("MyPlainJavaObject instance created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyPlainJavaObject{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
