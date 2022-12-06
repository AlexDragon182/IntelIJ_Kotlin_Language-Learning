import kotlin.random.Random

class RectangleClass ( // constructor
    val x: Double,
    val y: Double

        ) :Shape("Rectangle"){ // a class is the nutrient of the object, is a blueprint of what it should look like
   constructor(x:Double): this(x,x)// we call the primary constructor with 2 times the same value

    constructor(x:Int,y:Int): this(x.toDouble(),y.toDouble())

    companion object {
        fun randomRectamgle(): RectangleClass {
            val x = Random.nextDouble(1.0, 10.0)
            val y = Random.nextDouble(1.0, 10.0)
            return RectangleClass(x, y)
        }
    }
    init{    //this is all the logic we need to have executed when the instance is called
            println("$name created with x = $x and y = $y")
   }
    override fun area(): Double = x*y // telling kotlin that the function in shape will be overridden for this
    override fun perimeter(): Double = 2*x+2*y
    fun isSquare() = x==y // this one is not overriden becuase its unique to Rectangle

    //Ctrl +0 will show all functions we can implement from the super class
    //every object in kotlin inherits form object any
}