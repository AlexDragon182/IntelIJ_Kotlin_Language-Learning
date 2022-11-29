fun main (){
    println("please enter a number")
    val input = readln()?.toInt()
    val list = listOf<Int>(1,2,3,4,5,6)

    if(input != null){
        if(input.isPrime()){ // you can use it as a extension because it is declared as an Int
            println("it is a prime number")
        } else {
            println(" is not prime number")
        }
    }
}

fun Int.isPrime(): Boolean { // this will check if the number is a prime number
    for (i in 2 until this-2) // this acces to the integer
        if (this % i == 0 ) {
            return false
        }
    return true
}

fun Int.theProduct(): Int {
    for (i in 0 until list)
}