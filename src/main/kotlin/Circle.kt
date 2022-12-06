import kotlin.random.Random

class Circle(
    val radius: Double

):Shape("Circle") {

    // this is a function that can only have one instance
    companion object{
        fun randomCircle():Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

    init{
        println("Circle created with radius is = $radius")
        println("area is = ${area()}")
        println("area is = ${perimeter()}")

    }
    override fun area() = radius*radius*importantNumbers.PI // an object where only one single instance of exist
    override fun perimeter() = 2*radius*importantNumbers.PI
}