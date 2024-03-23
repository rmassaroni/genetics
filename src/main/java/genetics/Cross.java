package main;

import Genotype;

public class Cross {
    public Genotype g1, g2;

    public Cross(Genotype g1, Genotype g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public void offspring() {
        System.out.println("Crossing " + g1.name + " x " + g2.name);

    }
}
