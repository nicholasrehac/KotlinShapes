class Square(name: String) : Shape(name) {
    var length = 0.0
    var height = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        this.length = dimensions[0]
        this.height = dimensions[1]
    }

    override fun printDimensions() {
        println("length: $length")
        println("height: $height")
    }

    override fun getArea(): Double {
        return length*height
    }
}