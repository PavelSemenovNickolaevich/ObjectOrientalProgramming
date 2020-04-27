package ru.javabegin.training.fastjava2.shop.goods;

public class Televisor extends ElectronicDevice {


    private String company;
    private String department;
    private String model;

    public Televisor (String name) {
        super(name);
    }

    public Televisor (double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }


    public void selectChannel(){
        System.out.println("Select channel");

    }

    public void selectChannel(int numChannel){

    }

    public void selectChannel(String nameChannel){

    }



    // пока без гетеров и сетеров, т.к. код будет еще меняться

}
