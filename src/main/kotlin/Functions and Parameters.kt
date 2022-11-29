fun main () {
    powerPrinting(3,5)
    powerPrinting(4,6)
    powerPrinting(2,4)
    calculatesum(5)
    calculatesum(6)

    var x = 3
printingLines() // by calling the function by its name it will lead to de execution of the code
    }
fun printingLines (){
    println("first")
    println("second")
    println("third")
    println("fourth")
}
//namme the functions with lower letter at the beginning and then use capital letters (Camel Case)
fun powerPrinting (base:Int , exponent:Int){
    var result = 1
    for(i in 1..exponent) {
        result *= base // *= this saves the multiplication value in result
    }
    println(" $base to the power of $exponent is $result")
}
// Homework
fun calculatesum(number:Int){
    println("please, insert a number")
    var sum = 0
    var count = 1
    for (i in 1..number){
        sum = sum + count
        count ++
    }
    println(sum)
}