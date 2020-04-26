package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.department.AbstractDepartment;

public interface GoodsInterface {
    AbstractDepartment getDepartment();
    String getName();
    String getCompany();
    double getPrice();
    boolean hasGuarantee();

}
