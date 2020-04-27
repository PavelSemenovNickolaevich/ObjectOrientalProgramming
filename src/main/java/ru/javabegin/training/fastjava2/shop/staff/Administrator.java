package ru.javabegin.training.fastjava2.shop.staff;

import ru.javabegin.training.fastjava2.shop.SalesRoom;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public  Administrator(SalesRoom salesRoom) {this.salesRoom = salesRoom;}

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface){
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }

        return null;
    }

}
