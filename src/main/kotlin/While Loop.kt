fun main() {
    var x = 5
    val arrary2 = arrayOf("the", "foundations", "of", "decay") // my chemical romance song
    val arraylenght = arrary2.size            //returns the length of Array2
    var i = 0
    while (x > 0) {                         //while checks if the condition is true and then executes the code, until the condition is false
        println("hello world")
        x--                                 //decreases x by 1
    }

    while (i < arraylenght) {
        println(arrary2[i])
        i++
    }
    println("it ended")

    //Homework

    var number = readln()
    var numberInt = number.toInt()

    if (number != null) {
        while (numberInt >= 0) {
            println(numberInt)
            numberInt--
        }

    } else {
        println("didn't insert a number")
    }

    // Homework 2 enter two numbers and calculate the first one to the power of the second one
    println(" Insert number 1:")
    var number1 = readLine()?.toInt()
    println(" Insert number 2:")
    var number2 = readLine()?.toInt()
    var power = 1
    var counter = 0

while( number1!= null && number2 != null && counter<number2){
    power = power*number1
    counter++
}
    print("power is $power")
}