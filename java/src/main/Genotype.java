package main;

public class Genotype {
    public String name;

    public Genotype(String name) {
        this.name = name;
    }

    public char[] alleles() {
        return name.toCharArray();
    }
}
