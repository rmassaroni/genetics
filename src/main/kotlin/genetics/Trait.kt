package genetics

import genetics.Allele

public class Trait(var name: String = "__", var a1: Allele, var a2: Allele) {

    public constructor(a1: Char = '_', a2: Char = '_') : this("" + a1 + a2, Allele(a1), Allele(a2))
}
