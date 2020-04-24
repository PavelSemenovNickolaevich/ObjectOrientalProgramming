package ru.javabegin.training.fastjava2.shop.client;

public class VipVisitor extends BaseVisitor {

    private String name;
    private float discount;

    public void getDiscount () {

    }

    @Override
    public void buy( ) {
        if (!checkDiscount()) {
            super.buy();
        } else{

        }
    }

    private boolean checkDiscount () {
        return discount > 0;
    }
}
