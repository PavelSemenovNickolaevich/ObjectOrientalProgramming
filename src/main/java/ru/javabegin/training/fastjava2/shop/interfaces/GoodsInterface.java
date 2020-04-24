package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.department.BaseDepartment;

public interface GoodsInterface {
    BaseDepartment department();
    String name();
    String company();
    double price();
    boolean hasGuarantee();

}
