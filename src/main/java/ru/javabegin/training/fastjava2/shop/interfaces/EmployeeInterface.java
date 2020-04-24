package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.department.BaseDepartment;

public interface EmployeeInterface {

    String getName();
    boolean isFree();
    DepartmentInterface getDepartment();
}
