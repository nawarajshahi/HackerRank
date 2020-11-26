package com.hakerRank;

public class Operators {
    public static void main(String[] args) {
        solve(12.0, 20, 8);

    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double final_cost;
        double tip = meal_cost * ((double)tip_percent/100);
        double tax = meal_cost * ((double)tax_percent/100);
        final_cost = meal_cost + tip + tax;
        System.out.println(Math.round(final_cost));


    }
}
