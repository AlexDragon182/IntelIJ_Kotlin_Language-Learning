import java.lang.Exception

//exceptions are an event that occurs in the running of a program and disrupts the normal flow, that we crash if we do not manage it correctly
// ctrl + q to see the exceptions a function can manage
// try will execute that piece of code
fun main () {
    println("please enter a number")


    val input = try{
        readLine()?.toInt()
    }catch(e: NumberFormatException) {
        0
    }finally {
        println("this is from the finally block")
    }
    println("you entered $input")

    val division = try{
        divide(5.0,0.0)
    }catch (e:divisionbyZero){
        0.0
    }
    println("result is $division")

    val circle = try {
        Circle(-7.0)
    }catch (e: negativeRadius){
        0.0
    }
    println(circle)
}
class divisionbyZero:Exception("You cannot divide by 0 , choose another number")

fun divide (a:Double, b:Double): Double {
    if (b== 0.0){
        throw divisionbyZero()
    }
    return a / b
}

class negativeRadius:Exception("you cannot have a circle with negative radius")
