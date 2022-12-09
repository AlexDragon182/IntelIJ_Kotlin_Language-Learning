// nullable types are written in that object and question mark notation

class CustomTriple <A: Any,B : Any,C: Any>(
    var first : A,
    var second : B,
    var third : C
        ) {
    fun printTypes(){
        println("the type of first ${first::class}")
        println("the type of first ${second::class}")
        println("the type of first ${third::class}")
    }

}
// Ctrl + D duplicates the line