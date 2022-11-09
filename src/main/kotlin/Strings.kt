fun main (){
    val string = "This is a test"       //strings can capture  character values in values or variables
    println("this is our string $string") //printing the string
    println("this is our string ${string.toUpperCase()}") //printing the string all in uppercases, the method returns string type
    println("this is our string ${string.toUpperCase().toLowerCase()}") //printing the string can concatenate several methods

    //Homework

    val  name = "Rage_Dragon_182"
    println("this is my name $name")
    println("this is my name in upper case ${name.toUpperCase()}")//Uppercase
    println("this is my name in lower case ${name.toLowerCase()}")//Lowercase
    println("this is my name reversed ${name.toUpperCase().reversed()}")//Uppercase Reversed

}