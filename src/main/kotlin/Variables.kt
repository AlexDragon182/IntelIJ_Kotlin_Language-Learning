fun main () {
    var VariableName: Int = 6        //var (declares variable), Name : Type = Value (variable value can change)
    println("The Value is "+VariableName)       //Prints message + Variables, prints 6
    VariableName = 2            //calls the Variable and set it to 2
    println("The Value is now: $VariableName" )       //Prints message + Variables, prints 2

    val ValueName: Int = 7  // value cannot change its value in further code
    println("The Value is "+ValueName)

    var myBvariable: Boolean = true  //boolean can only be true or false
    println("The Value is "+myBvariable)
    myBvariable = false
    println("The Value is now: $myBvariable" )

    //Homework save age in a variabel , favorite number in a variable
    val FavoriteNumber: Int = 8
    var Age: Int = 24

    println("My favorite number is $FavoriteNumber , and my age is $Age")
}