fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9) // can be changed during run time
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9) // cannot be changed during runtime
    val list2 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)  // mutable list can change in values and size during runtime

    list2.add(4) // adds a 4 at the end of the mutable list (list2)
    list2.remove(2) // removes the value 2
    list2.removeAt(7) // removes the item in the index
    println(list2) // you can just print the list.

    val testlist = mutableListOf<Int>() //this can create an empty list <>
    for ( i in 1 .. 10) { // cycle for from 1 to 10
        var x = readLine()?.toInt() //asks for a value to put in x
        if (x != null) { // checks if it is null
            testlist.add(x)// adds it to the list
        }

    }
println(testlist)

    // Homework
    val homeworklist = mutableListOf<Int>()
    for (i in 1..5) {
        var y = readLine()?.toInt()
        if (y != null) {
            homeworklist.add(y)
        }
    }
    for (i in list.size - 1 downTo 0) { // counts from the largest number to the lowest
        println(homeworklist[i])
    }


    println(homeworklist.reversed())

    println("enter a number n > 1 so it can calculate fibonacci")
    val userinput = readLine()?.toInt() //
    var fibonacci = mutableListOf<Int>(0,1)
    var sums = 1

    for (i in 1 ..(userinput!!-2)) {
        sums = fibonacci[i] + fibonacci[i - 1]
        fibonacci.add(sums)
    }
    //    var fibonacci = mutableListOf<Int>(0,1)
    //    val userinput = readLine()?.toInt() //
    // if (userinput != null) {
    //      for (i in 2 .. userinput-1)
    //      list.add(list [i-2] + list[i-1])
    // }
    println(fibonacci)
}