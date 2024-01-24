class Square(name: String) : Shape(name) {
    var length = 0.0
    var height = 0.0

    override fun setDimensions(vararg length_height: Double) {
        this.length = length_height[0]
        this.height = length_height[1]
    }

    override fun printDimensions() {
        println("length: $length")
        println("height: $height")
    }

    override fun getArea(): Double {
        return length*height
    }
}