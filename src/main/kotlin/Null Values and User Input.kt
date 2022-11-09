fun main () {
    val userInput = readLine() // this screen has te option to not contain anything, even-though it needs to return a string
                                // it will block the code until the user enters lines characters
                                //you cannot call functions
                                //it will always be saved as string
    println("words typed $userInput")
    println(userInput?.toUpperCase()) //question mark checks if it is null, so you can use functions

    if (userInput != null) // no need to put question mark because this is checked
    println(userInput.toInt() + 5 )  //if you know the user put an input in a string , this will receive errors because characters cannot be converted to Inv vale

    // Homework
    val age = readLine()
    val requiredage = 18

    if (age != null){
        if (age.toInt() >= requiredage){
            println("you are an adult")
        }else if (age.toInt() < requiredage){
            println("you are not an adult")
        } else {
            println("that is not a that is not a number")
        }

    }


    }
