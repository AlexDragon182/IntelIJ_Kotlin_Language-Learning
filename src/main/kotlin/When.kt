fun main (){
    val age = readLine()?.toInt()
    val x = 6
    when (age) { // more convenient when refactoring , makes conditions more managable
        in 0..5 -> {    println("you are a kid")
                                println("a very young kid")
        }
        in 6 .. 17 -> println("you are a teenager")
        18 -> if ( x== 6){
                println("you are in the clause 18")
            }
        19,20 -> println("you are a young adult")
        in 21 .. 65 -> println("you are an old adult")
        else -> println("you are an old")
        // "hello" -> println("hello") // it will check if the age is equal to hello if it was not an integer
    }

    var nationality = readLine()

    when (nationality){
        "indian" -> println("namaste")
        "USA" -> println("hello")
        "mexico" -> println("kiubole")
        "japan" -> println("arigato gosaimas")
        "french" -> println("bonjour")
        else -> println("i do not know your language")
    }
}