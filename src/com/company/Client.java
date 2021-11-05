package com.company;

import com.company.Adapter.Adapter;
import com.company.Adapter.ITarget;
import com.company.Specific_request.DistanceCalculator;

public class Client {

    public static void main(String[] args) {
    int distance=20;
    int takentime=4;
    int giventime=5;
        ITarget calculate=new Adapter(new DistanceCalculator());
        System.out.println(calculate.calculateDistance(distance,takentime,giventime));
    }
}
