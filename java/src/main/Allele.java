package main;

public class Allele {
    public char name;
    public boolean dominant;

    public Allele(char name) {
        this.name = name;
    }

    public boolean isDominant() {
        return Character.isUpperCase(name);
    }
}
