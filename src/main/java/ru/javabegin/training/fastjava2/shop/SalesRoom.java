package ru.javabegin.training.fastjava2.shop;

import ru.javabegin.training.fastjava2.shop.client.BaseVisitor;
import ru.javabegin.training.fastjava2.shop.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private String name;
    private ArrayList<DepartmentInterface> departmentList;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;

}


