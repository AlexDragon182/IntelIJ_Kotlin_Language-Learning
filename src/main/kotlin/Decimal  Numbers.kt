
fun main() {
    var x: Float = 23.165423F      //Float is used for decimal numbers
    var y: Float = 13.63546F          //F also decalres it as a Float, use them if you donte need it to be that accurate.

    var j = 123.43234              // Double is more exact than Float
    var k = 323.654356             // it needs more memory than Float

    println("the result of x+y is now ${x+y}")
    println("the result of x+y is now ${j+k}")

    //Homework

    val TresCuartos = .75
    var radius = 72.0
    val pi = 3.1416
    val power = 3.0
    var  radiuspower = Math.pow(radius,power)           //math.pow calculate the ppower based in two variables.
    println("volume of the sphere is ${TresCuartos*pi*radiuspower}")
    println("Volume of the sphere is ${TresCuartos*pi*radius*radius*radius}")

}