package genetics

public class Allele(var name: Char = '_') {
    public fun isDominant(): Boolean {
        return Character.isUpperCase(name)
    }

    public override fun toString(): String {
        return name.toString()
    }
}
