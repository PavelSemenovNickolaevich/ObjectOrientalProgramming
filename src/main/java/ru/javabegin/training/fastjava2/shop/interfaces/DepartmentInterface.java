package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.goods.BaseGoods;
import ru.javabegin.training.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

public interface DepartmentInterface {
    String getName ();

    ArrayList<EmployeeInterface> getEmployeeList ();

    ArrayList<GoodsInterface> getGoodsList ();

}
