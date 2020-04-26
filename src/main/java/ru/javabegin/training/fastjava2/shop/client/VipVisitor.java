package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    private float discount;

    public void getDiscount () {

    }

    @Override
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        } else{

        }
    }

    private boolean checkDiscount () {
        return discount > 0;
    }
}
