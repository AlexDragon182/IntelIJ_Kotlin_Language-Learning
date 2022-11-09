
fun main(){
    val x = 5
    val y = 5

    val a = 6
    val b = 10

    println(x == y) //== gives the comparison returns boolean
    println(x < y) //if x is less than y
    println(x > y) //if x is more than y
    println(x <= y) //if x is less or equal than y
    println(x >= y) //if x is more or equal than y
    println(x != y) //if x is not the same as y
    println(x == y && a == b) // for putting 2 expressions in the same method with &&(AND OPERATOR), if you want a true then both conditions need to be true
    println(x == y || a == b) // for putting 2 expressions in the same method with ||(OR OPERATOR), if you want a true then one conditions need to be true
    println(!(x == y)|| a == b) // for putting 2 expressions in the same method with ||, if you want a true then one conditions need to be true,boolean is negated with !
    println(!(x == y|| a == b)) // the end operator (!) is stronger and it will negate.
    println(!(x == y|| a == b && a >= y)) // AND is stronger than OR
    println(!((x == y|| a == b) && a >= y)) // It will prioritize smaller parenthesis


    //Homework
     val  easymode = 3 > 4 || 4 > 3 && 4 <= 4
    println (easymode)

    val bool = true
    val j =9
    val k =3
    val l =9

    val hardmode = !(j !=l) && bool || l > (j + k) && (!bool || k < l)
    println(hardmode)

}