package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.goods.GameConsole;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.EmployeeInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

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

    public void setEmployeeList (ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList () {
        return goodsList;
    }

    public void setGoodsList (ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    public void addGoods (GoodsInterface goods) {
        goods.setDepartment(this);
        goodsList.add(goods);
    }

    public  void addEmploee (EmployeeInterface employee) {
        employee.setDepartment(this);
        employeeList.add(employee);
    }
}
