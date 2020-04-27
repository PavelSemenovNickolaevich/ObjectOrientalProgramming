package ru.javabegin.training.fastjava2.shop.goods;

public class Computer extends ElectronicDevice {


    private int ram;

    public Computer (String name, String ram) {
        super(name);
    }

    public Computer (String name) {
        super(name);
    }

    public Computer (double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }

    public void loadOS () {

    }

}
