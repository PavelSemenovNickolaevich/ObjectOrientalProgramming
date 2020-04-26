package ru.javabegin.training.fastjava2.shop.client;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.VisitorInterface;

public abstract  class AbstractVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(GoodsInterface goods){
        System.out.println(goods.getName());

        if (goods instanceof Televisor) {
            ((Televisor)goods).selectChannel();
        }

    }

    @Override
    public void returnGoods(GoodsInterface goods){

    }

    @Override
    public String getName () {
        return name;
    }


}
