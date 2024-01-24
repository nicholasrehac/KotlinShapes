import kotlin.math.PI

class Circle(name: String) : Shape(name) {
    var radius: Double = 0.0
    override fun setDimensions(vararg dimensions: Double) {
        this.radius = dimensions[0]
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }
    override fun getArea(): Double {
        return PI * radius * radius
    }
}