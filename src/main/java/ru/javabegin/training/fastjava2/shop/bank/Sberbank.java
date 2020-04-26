package ru.javabegin.training.fastjava2.shop.bank;

public class Sberbank extends AbstractBank {




    public Sberbank (String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo () {
        super.checkInfo();

    }

    @Override
    public void giveCredit () {
    }

    public void checkInfo (boolean critical) {
        System.out.println("sberbank");

    }
}
