package ru.javabegin.training.fastjava2.shop.staff;

import ru.javabegin.training.fastjava2.shop.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractStaff {


    public Consultant (String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        return ConsultResult.BUY;
    }


    public void send(){

    }


}
