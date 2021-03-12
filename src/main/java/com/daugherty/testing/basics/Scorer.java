package com.daugherty.testing.basics;

import java.util.List;

public class Scorer {
    public static Integer score(List<Integer> rolls) {
        Integer total = 0;
        int rollIndex = 0;
        while (rollIndex < rolls.size()) {
            int frameTotal = rolls.get(rollIndex);
            if (frameTotal == 10) {
                frameTotal += rolls.get(rollIndex + 1) + rolls.get(rollIndex + 2);
                rollIndex += 1;
            } else {
                frameTotal += rolls.get(rollIndex + 1);
                if (frameTotal == 10 ) {
                    frameTotal += rolls.get(rollIndex + 2);
                }
                rollIndex += 2;
            }
            total += frameTotal;
        }
        return total;
    }
}
