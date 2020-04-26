package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterface {
    public ElectronicDevice () {

    }

    public ElectronicDevice (String name) {
        super(name);

    }

    @Override
    public void on () {

    }

    @Override
    public void off () {

    }

}
