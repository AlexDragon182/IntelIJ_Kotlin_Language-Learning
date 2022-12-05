import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double

) : Shape("Triangle") {
    init{
        println("$name is created with a=$a b=$b c=$c")
        println("perimeter is ${perimeter()}")
        println("area is ${area()}")
    }

    fun perimeter() = a+b+c
    fun area() = sqrt((perimeter()/2)*((perimeter()/2)-a)*((perimeter()/2)-b)*((perimeter()/2)-c))
}