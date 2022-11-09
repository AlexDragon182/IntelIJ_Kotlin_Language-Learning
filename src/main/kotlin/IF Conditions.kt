fun main(){
    val x = 8
    val y = 7
    val z = if (x + y == 15) 6 else 4

    if( x < y) { // will only execute ir condition is true
        println("x is lesser than y")
    }else if (x>y){ //will check if condition is true
        println("x is greater")
    }else { // this will execute if all other conditions are false
        println("x is equal to y")
    }

    if( x < y || y * y == 49) { // will execute if one of the conditions is true
        println("one of the conditions is true")
    }else if (x>y){ //will check if condition is true
        println("x is greater")
    }else { // this will execute if all other conditions are false
        println("x is equal to y")
    }

    println("value of z is $z")

    println("this code will always be executed")

 //Homework
    val palindrome = "racecar"
    val reversepalindrome = palindrome.reversed()

    if (palindrome == reversepalindrome){
        println("thw word $palindrome is a palindrome")
    }else{
        println("the word $palindrome is not a palindrome")
    }
}