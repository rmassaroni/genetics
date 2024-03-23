package genetics

import genetics.*

public class Cross(var g1: Genotype, var g2: Genotype) {
    public constructor(g1: String, g2: String) : this(Genotype(g1), Genotype(g2))
}
