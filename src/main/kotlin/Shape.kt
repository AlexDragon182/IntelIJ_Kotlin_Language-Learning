import java.awt.Dimension

abstract class Shape( // can only inherit if the class is available
    var name: String
) {

    constructor(name: String,vararg dimension:Double):this(name)
    init {
        println("i am the super class!")
    }
    abstract fun area(): Double //this is for returning a double
    abstract fun perimeter(): Double
    fun changeName(newName: String){
        name = newName
    }

}
// visibility modifiers
//private val : only visibile inside the class, cannot access it from outer classes, it would not make sense if it needs information from the outside
//public val : usually redundant
// protected only accesible within the shape class and classes that inherit that class

//open: class for other files to open it
//abstract: the only purpose of that class is to inherit from here