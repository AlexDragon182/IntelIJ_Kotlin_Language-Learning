fun main() {
    val rectangle1 = RectangleClass( 5.0, 7.0)
    println("rectangle area is ${rectangle1.area()}")
    println("rectangle perimeter is ${rectangle1.perimeter()}")
    println("rectangle square is ${rectangle1.isSquare()}")

    val circle1 = Circle (7.0)
    val circle2 = Circle (3.0)
    circle2.changeName("SmallerCircle")
    println(circle2.name)


    val triangle1 = Triangle (3.0, 2.0, 6.0)
    triangle1.changeName("John")
}