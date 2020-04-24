package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.goods.BaseGoods;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.EmployeeInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

public class BaseDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<GoodsInterface> goodsList;
    private ArrayList<EmployeeInterface> employeeList;

    @Override
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList () {
        return employeeList;
    }

    public void setEployeeList (ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList () {
        return goodsList;
    }

    public void setGoodsList (ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

}
