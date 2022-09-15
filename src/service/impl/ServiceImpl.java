package service.impl;

import entities.abstraction.A;
import service.ServiceOne;
import service.ServiceTwo;

import java.util.Arrays;
import java.util.List;

public class ServiceImpl extends A implements ServiceOne, ServiceTwo {

    @Override
    public List<Boolean> listOfBooleans(int i) {

        //TODO

        return null;
    }

    @Override
    public void methodOne() {

    }

    @Override
    public void methodTwo(String message) {

    }

    @Override
    public String methodThree(String... values) {
        return null;
    }

    @Override
    public int methodFour() {
        return 0;
    }

    @Override
    public void printStatus() {

    }
}
