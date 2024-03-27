package genetics

import genetics.Trait

import java.util.ArrayList

public class Genotype(var name: String = "__") {
    public var traits: ArrayList<Trait>

    init {
        traits = ArrayList()
        traits.set(0, Trait(name[0], name[1]))
        for (i in 0 until name.length step 2)
            //if(name[i].isLetter())
            traits.add(Trait(name[i], name[i + 1]))
    }

    public fun alleles(): ArrayList<Allele> {
        var alleles = ArrayList<Allele>()
        for(i in 0 until name.length)
            alleles.add(Allele(name[i]))
        return alleles
    }

    public override fun toString(): String {
        return name
    }
}
