import kotlin.math.sqrt

class Triangle(name: String) : Shape(name) {
    var side_1 = 0.0
    var side_2 = 0.0
    var side_3 = 0.0
    override fun setDimensions(vararg dimensions: Double) {
        this.side_1 = dimensions[0]
        this.side_2 = dimensions[1]
        this.side_3 = dimensions[2]
    }

    override fun getArea(): Double {
        val s = (side_1 + side_2 + side_3)/2.0
        return sqrt(s*(s-side_1)*(s-side_2)*(s-side_3))
    }

    override fun printDimensions() {
        println("Side 1: $side_1")
        println("Side 2: $side_2")
        println("Side 3: $side_3")
    }
}