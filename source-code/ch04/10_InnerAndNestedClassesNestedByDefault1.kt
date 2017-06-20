package ch04.InnerAndNestedClassesNestedByDefault1

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}
