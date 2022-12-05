class RectangleClass ( // constructor
    val x: Double,
    val y: Double

        ) :Shape("Rectangle"){ // a class is the nutrient of the object, is a blueprint of what it should look like
   init{    //this is all the logic we need to have executed when the instance is called
            println("$name created with x = $x and y = $y")
   }
    fun area() = x*y
    fun perimeter() = 2*x+2*y
    fun isSquare() = x==y
}