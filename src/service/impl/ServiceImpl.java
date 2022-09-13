package service.impl;

import service.ServiceOne;
import service.ServiceTwo;

import java.util.Arrays;

public class ServiceImpl implements ServiceOne, ServiceTwo {

    @Override
    public void methodOne() {
        System.out.println("This is method one");
    }

    @Override
    public void methodTwo(String message) {
        System.out.println("This is method two: " + message);
    }

    @Override
    public String methodThree(String... values) {
        return Arrays.toString(values);
    }

    @Override
    public int methodFour() {
        return 0;
    }

}
