package ru.javabegin.training.fastjava2.shop;

import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop.staff.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "wwwww";

    private String name;
    private ArrayList<DepartmentInterface> departmentList;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;

}


