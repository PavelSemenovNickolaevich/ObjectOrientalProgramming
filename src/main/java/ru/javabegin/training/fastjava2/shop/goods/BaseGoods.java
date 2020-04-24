package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class BaseGoods implements GoodsInterface {

    private BaseDepartment department;
    private String name;
    private String company;
    private double price;
    private boolean hasGuarantee;


    @Override
    public BaseDepartment department () {
        return null;
    }

    public void setDepartment (BaseDepartment department) {
        this.department = department;
    }

    @Override
    public String name () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String company () {
        return company;
    }

    public void setCompany (String company) {
        this.company = company;
    }

    @Override
    public double price () {
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

