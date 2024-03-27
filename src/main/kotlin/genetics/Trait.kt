package genetics

import genetics.Allele

public class Trait(var name: String = "__", var a1: Allele = Allele(name[0]), var a2: Allele = Allele(name[0])) {

    public constructor(a1: Char = '_', a2: Char = '_') : this("" + a1 + a2)

    public override fun toString(): String {
        return name
    }
}
