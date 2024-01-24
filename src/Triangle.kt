import kotlin.math.sqrt

open class Triangle(name: String) : Shape(name) {
    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        this.side1 = dimensions[0]
        this.side2 = dimensions[1]
        this.side3 = dimensions[2]
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3)/2.0
        return sqrt(s*(s-side1)*(s-side2)*(s-side3))
    }

    override fun printDimensions() {
        println("Side 1: $side1")
        println("Side 2: $side2")
        println("Side 3: $side3")
    }
}