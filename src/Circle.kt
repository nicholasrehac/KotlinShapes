class Circle(name: String) : Shape(name) {
    var radius: Double = 0.0
    override fun setDimensions(vararg radius: Double) {
        this.radius = radius[0]
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }
    override fun getArea(): Double {
        return 0.0
    }
}