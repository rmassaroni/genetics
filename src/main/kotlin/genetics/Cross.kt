package genetics

import genetics.*

import java.util.ArrayList

public class Cross(var g1: Genotype, var g2: Genotype) {
    public val name: String = g1.name + " x " + g2.name
    public var offspring: ArrayList<Genotype>

    init {
        println(name)
        offspring = ArrayList()
        getOffspring()
    }

    public constructor(g1: String, g2: String) : this(Genotype(g1), Genotype(g2))

    public fun getOffspring() {
        for(i in g1.traits)
            for(j in g2.traits) {
                val genotypeName = "${i.a1}${j.a1}/${i.a2}${j.a2}"
                val genotype = Genotype(genotypeName)
                offspring.add(genotype)
            }
        println("Offspring: " + offspring)
    }

    public override fun toString(): String {
        return name
    }
}
