package ru.javabegin.training.fastjava2.shop.bank;

import ru.javabegin.training.fastjava2.shop.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {


    private String name;
    private String creditDescription;
    public static int requestCount;

    public AbstractBank (String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    @Override
    public void checkInfo () {
        requestCount++;
    }

    @Override
    public void giveCredit () {

    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public String getCreditDescription () {
        return getCreditDescription();
    }


}
