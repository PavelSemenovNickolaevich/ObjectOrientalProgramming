package ru.javabegin.training.fastjava2.shop.service;

import ru.javabegin.training.fastjava2.shop.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;
    private boolean free;


    public void setName (String name) {
        this.name = name;
    }


    public void setFree (boolean free) {
        this.free = free;
    }


    public void setDepartment (DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public boolean isFree () {
        return free;
    }

    @Override
    public DepartmentInterface getDepartment () {
        return department;
    }
}
