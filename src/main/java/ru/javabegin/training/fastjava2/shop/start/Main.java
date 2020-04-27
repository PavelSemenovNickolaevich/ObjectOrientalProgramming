package ru.javabegin.training.fastjava2.shop.start;

import ru.javabegin.training.fastjava2.shop.SalesRoom;
import ru.javabegin.training.fastjava2.shop.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop.client.VipVisitor;
import ru.javabegin.training.fastjava2.shop.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop.goods.Computer;
import ru.javabegin.training.fastjava2.shop.goods.GameConsole;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.staff.Administrator;
import ru.javabegin.training.fastjava2.shop.staff.Consultant;

public class Main {

    public static void main (String[] args) {
        imitateWorkShop();
//        Televisor televisor = new Televisor("samsung");
//        GoodsInterface goods = new Televisor("Rubin");
//        ((Televisor)goods).selectChannel();
//        Subwoofeer subwoofeer = new Subwoofeer("Microlab");
//        Computer computer = new Computer("McBook");
//        Computer computerTwo = new Computer("ASUS");
//        CommonVisitor commonVisitor = new CommonVisitor();
//        commonVisitor.buy(televisor);
//        commonVisitor.buy(computer);
//        commonVisitor.buy(computerTwo);
//        commonVisitor.buy(subwoofeer);
//        commonVisitor.buy(goods);
//        Sberbank sberbank  = new Sberbank("Sberbank", "test description");
//        sberbank.checkInfo();
//        sberbank.checkInfo();
//        sberbank.checkInfo();
//        VTB vtb  = new VTB("VTB", "test description");
//        vtb.checkInfo();
//        vtb.checkInfo();
//        vtb.checkInfo();
//        System.out.println("sberbank = " + Sberbank.requestCount);
    }

    private static void imitateWorkShop () {
        //Создаем новую комнату продажи
        SalesRoom salesRoom = new SalesRoom();
        Administrator administrator = new Administrator(salesRoom);
        //Создаем департаменты(отделы) в магазине
        GameDepartment gameDepartment = new GameDepartment();
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        //Добавляем отделы в магазин
        salesRoom.addDepartment(gameDepartment);
        salesRoom.addDepartment(electronicDepartment);
        //Создаем сотруников и добавляем их в отделы
        Consultant consultantOne = new Consultant("Джон");
        Consultant consultantTwo = new Consultant("Мария");
        consultantOne.setFree(true);

        electronicDepartment.addEmploee(consultantOne);
        electronicDepartment.addEmploee(consultantTwo);

        //Создаем и добавляем товары
        Computer computer = new Computer(300,  true, "HP", "Asus", 256);
        Televisor televisor = new Televisor(1000, true, "SmartTV", "samsung");
        GameConsole xbox = new GameConsole("Xbox", 256);

        gameDepartment.addGoods(xbox);
        electronicDepartment.addGoods(computer);
        electronicDepartment.addGoods(televisor);

        //Добавление посетителей
        CommonVisitor  commonVisitor = new CommonVisitor("Ivan");
        VipVisitor vipVisitor = new VipVisitor("Петя", 50);

        //Работа администратора (поиск и пердоставление консультанта)
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(commonVisitor);

        switch (consultResult) {
            case BUY:
                commonVisitor.buy(televisor);
                break;
            case EXIT:
                break;
        }











    }


}
