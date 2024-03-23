package main;

public class Genotype {
    public String name;
    public char[] alleles;

    public Genotype(String name) {
        this.name = name;
        alleles = name.toCharArray();
    }
}
