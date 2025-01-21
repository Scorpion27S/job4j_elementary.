package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightMan) {
        return (heightMan - 100) * 1.15;
    }

    public static double womanWeight(short heightWoman) {
        return (heightWoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double man = Fit.manWeight(heightMan);
        System.out.printf("Man 187 is %.2f\n", man);
        double woman = Fit.womanWeight(heightWoman);
        System.out.printf("Woman 170 is %.2f\n", woman);
    }
}
