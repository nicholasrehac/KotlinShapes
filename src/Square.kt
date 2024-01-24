class Square(name: String) : Shape(name) {
    var length = 0.0
    var height = 0.0

    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("length: $length")
        println("height: $height")
    }

    override fun getArea(): Double {
        return length*height
    }
}