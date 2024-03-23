package genetics

import genetics.Trait

import java.util.ArrayList

public class Genotype(var name: String = "__") {
    public var traits: ArrayList<Trait>

    init {
        traits = ArrayList()
        for (i in 0 until name.length step 2) {
            traits.add(Trait(name[i], name[i + 1])
        }
    }
}
