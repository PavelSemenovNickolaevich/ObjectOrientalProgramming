package ru.javabegin.training.fastjava2.shop.start;

import ru.javabegin.training.fastjava2.shop.bank.Sberbank;
import ru.javabegin.training.fastjava2.shop.bank.VTB;
import ru.javabegin.training.fastjava2.shop.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop.goods.Computer;
import ru.javabegin.training.fastjava2.shop.goods.Subwoofeer;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class Main {

    public static void main (String[] args) {
        Televisor televisor = new Televisor("samsung");


        GoodsInterface goods = new Televisor("Rubin");
        ((Televisor)goods).selectChannel();

        Subwoofeer subwoofeer = new Subwoofeer("Microlab");

        Computer computer = new Computer("McBook");
        Computer computerTwo = new Computer("ASUS");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computerTwo);
        commonVisitor.buy(subwoofeer);
        commonVisitor.buy(goods);


        Sberbank sberbank  = new Sberbank("Sberbank", "test description");
        sberbank.checkInfo();
        sberbank.checkInfo();
        sberbank.checkInfo();



        VTB vtb  = new VTB("VTB", "test description");
        vtb.checkInfo();
        vtb.checkInfo();
        vtb.checkInfo();
        System.out.println("sberbank = " + Sberbank.requestCount);

    }
}
