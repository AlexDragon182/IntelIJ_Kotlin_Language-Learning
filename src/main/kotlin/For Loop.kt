fun main(){
    val array3 = arrayOf(1,2,3) //array of numbers
    for(i in array3){       // counts 1 2 3
        println(i)
    }
    for(i in 1..10){       // counts 1 2 3 .. 10 .. means to 10
        println(i)
    }
    for(i in 10 downTo  5 step 2){       // counts backwars from 10 (Downto Function) (step) increases down by 2
        println(i)
    }
    for(i in 'a'..'z') {       // counts 1 2 3 .. 10 .. means to 10
        println(i)
    }

    val array4 = arrayOf(1,2,3,4,7,2,8,5,10) //array of numbers
    var biggest = array4[0]

    for(item in array4){        //item refers to a part in array
        if (item > biggest){        //if item id bigger than biggest
            biggest = item          //change the value of biggest to item
        }
    }
    println(biggest)

    //Homework
    val array5 = arrayOf(1,3,6,7,3,6,7)
    var total = 0
    for(i in array5) {
        total = total + i
    }
    println(total)

    var average = 0.0 //declares variable average
    println("Please insert 5 numbers")
    for( i in 1..5){ // cycle for five times
        var values = readLine()?.toInt() // declares variable values and ask user to put insert a number
            if(values != null){ // asks if null
                average += values / 5.0 // sums up the equal to average
            }
    }
    println (average)
}