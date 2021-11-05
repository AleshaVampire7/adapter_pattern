package com.company.Adapter;

import com.company.Specific_request.DistanceCalculator;

public class Adapter implements ITarget{
    DistanceCalculator distanceCalculator;

    public Adapter(DistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }

    @Override
    public String calculateDistance(int distance, int takentime, int giventime) {
        int speed=distance/takentime;
        return "final "+distanceCalculator.Calculate(speed,giventime);
    }
}
