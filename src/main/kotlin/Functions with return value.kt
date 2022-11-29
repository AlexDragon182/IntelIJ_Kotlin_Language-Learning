fun main (){
    val pow = printingPower(3,5)
    println(pow)
    println(multiply(5,5))
    val list = listOf(1,2,3,)
    val listH = listOf<Int>(1,5,8,2,6,9,7,4)
    val searchedvalue =  readLine()?.toInt()
    printFirstItem(list)
    if (searchedvalue != null) {
        println(searchIndex(listH,searchedvalue))
    }
}

fun printingPower (base:Int , exponent:Int):Int { // need to decalre the type of return value
    var result = 1
    for(i in 1..exponent) {
        result *= base // *= this saves the multiplication value in result
    }
 return result // to save values in variables, to return the value of the function, ths makes the function over
}

fun multiply (a: Int, b: Int) = a*b // it will understand that the value is Integer and doesn't need the curly brackets

fun printFirstItem(list:List<Int>) = println(list[0]) //list as a parameter in a function
//Homework

fun searchIndex (listH: List <Int>, searchedvalue : Int):Int { // method instances list and the value searched
    if(searchedvalue != null) {
        for (i in 0 until listH.size-1) { // for cycle at the list size
            if (listH[i] == searchedvalue) {//is the values are equal
                return i // return the value

            }
        }
    }
    return -1 //returns a minus 1
}