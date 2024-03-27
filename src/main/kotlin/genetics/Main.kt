package genetics

import genetics.Cross

fun main() {
    var g1 = Genotype("AABB")
    println(g1.alleles() + " ; " + g1.traits)
    var g2 = Genotype("aabb")
    println(g2.alleles() + " ; " + g2.traits)
    var c = Cross("AABB", "aabb")
}
