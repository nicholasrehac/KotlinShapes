import java.util.Scanner
fun main() {

    var length = 0.0
    var height = 0.0
    var radius = 0.0
    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0
    var sideEq = 0.0

    val reader = Scanner(System.`in`)
    println("for square:")
    print("length: ")
    length = reader.nextDouble()
    print("height: ")
    height = reader.nextDouble()
    println("for circle")
    print("radius: ")
    radius = reader.nextDouble()
    println("for triangle")
    print("side 1: ")
    side1 = reader.nextDouble()
    print("side 2: ")
    side2 = reader.nextDouble()
    print("side 3: ")
    side3 = reader.nextDouble()
    println("for equilateral triangle")
    print("side: ")
    sideEq = reader.nextDouble()



    val square: Shape = Square("kevin")
    square.setDimensions(length, height)

    val circle: Shape = Circle("josh")
    circle.setDimensions(radius)

    val triangle: Shape = Triangle("amy")
    triangle.setDimensions(side1, side2, side3)

    val equilateral: Shape = EquilateralTriangle("karen")
    equilateral.setDimensions(sideEq)



    println()

    println("square has name ${square.name}, area ${square.getArea()}, and dimensions:")
    square.printDimensions()

    println()

    println("circle has name ${circle.name}, area ${circle.getArea()}, and dimensions:")
    circle.printDimensions()

    println()

    println("triangle has name ${triangle.name}, area ${triangle.getArea()}, and dimensions:")
    triangle.printDimensions()

    println()

    println("equilateral has name ${equilateral.name}, area ${equilateral.getArea()}, and dimensions:")
    equilateral.printDimensions()

}