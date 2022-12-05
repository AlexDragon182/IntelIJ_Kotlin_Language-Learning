open class Shape( // can only inherit if the class is available
    var name: String
) {
    init {
        println("i am the super class!")
    }
    fun changeName(newName: String){
        name = newName
    }

}
// visibility modifiers
//private val : only visibile inside the class, cannot access it from outer classes, it would not make sense if it needs information from the outside
//public val : usually redundant
// protected only accesible within the shape class and classes that inherit that class