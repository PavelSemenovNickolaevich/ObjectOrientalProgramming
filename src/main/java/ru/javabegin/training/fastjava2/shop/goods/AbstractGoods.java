package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface {

    private AbstractDepartment department;
    private String name;
    private String company;
    private double price;
    private boolean hasGuarantee;

    public static  void  print(String message) {
        System.out.println("message = " + message);
    }

    public AbstractGoods() {

    }

    public AbstractGoods(String name) {
        this.name = name;
    }

    @Override
    public AbstractDepartment getDepartment () {
        return department;
    }

    public void setDepartment (AbstractDepartment department) {
        this.department = department;
    }

    @Override
    public String  getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String getCompany () {
        return company;
    }

    public void setCompany (String company) {
        this.company = company;
    }

    @Override
    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee () {
        return false;
    }

    public void setHasGuarantee (boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }
}

