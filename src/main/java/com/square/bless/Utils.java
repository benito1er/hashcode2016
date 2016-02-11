package com.square.bless;

import com.square.bless.domain.Order;

import java.util.Collection;

/**
 * Created by benoi on 11/02/2016.
 */
public class Utils {

    public static int distance(int rf, int cf, int rd, int cd) {
        double dx = rf-rd;
       double dy = cf-cd;

        return (int)Math.ceil(Math.sqrt(
                dx*dx + dy*dy
        ));


    }

    public static int computeScore(Collection<Order> orders, int globalTime) {
        int score = 0;
        for(Order o:orders) {
            score+= computeScore(o, globalTime);
        }
        return score;
    }

    public static int computeScore(Order order, int globalTime) {
        double delta = globalTime-order.getCompletionTime();
        double score =delta/(double)globalTime;
        return (int)Math.ceil(score*100);
    }
}
