abstract class Shape(var name: String) : Dimensionable{
    open fun getArea() : Double {
        return 0.0
    }
}