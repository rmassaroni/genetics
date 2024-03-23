package main;

import Allele;

public class Genotype {
    public String name;

    public Genotype(String name) {
        this.name = name;
    }

    public Allele[] alleles() {
        Allele[] alleles = new Allele[name.length()];
        for(int i = 0; i < alleles.size; i++)
            alleles[i] = name.charAt(i);
        return alleles;
    }

    //traits will eventually be its own class and will account for mutations variations
    public Allele[][] traits() {
        Allele[][] traits = new Allele[2][name.length()/2];
        for(int i = 0; i < alleles().size; i += 2)
            traits[0][i] = alleles()[i];
        for(int i = 1; i < alleles().size; i += 2)
            traits[1][i - 1] = alleles()[i];
        return traits;
    }
}
