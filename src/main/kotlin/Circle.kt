class Circle(
    val radius: Double

):Shape("Circle") {
    val pi = 3.1416
    init{
        println("Circle created with radius is = $radius")
        println("area is = ${area()}")
        println("area is = ${perimeter()}")

    }
    fun area() = radius*radius*pi
    fun perimeter() = 2*radius*pi
}