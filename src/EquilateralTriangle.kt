class EquilateralTriangle(_name: String) : Triangle(_name) {
    override fun setDimensions(vararg dimensions: Double) {
        super.setDimensions(dimensions[0], dimensions[0], dimensions[0])
    }

    override fun printDimensions() {
        println("All sides are ${super.side1}")
    }
}