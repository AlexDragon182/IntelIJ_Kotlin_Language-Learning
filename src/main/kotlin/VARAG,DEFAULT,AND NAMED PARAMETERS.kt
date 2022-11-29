import javax.script.AbstractScriptEngine

fun main (){

    val array = intArrayOf(10,11,12,13,14,15,16,17,18,19)
 val max = getMax(1,2,3,4,5,*array,6,7,8,9,)
    val test = alternatingSum(1,2,3,4,5)
    println("the maximum is $max")
    searchFor("how to program in kotlin")
    searchFor("how to become pokemon trainer","bing")// you chan change it if you want
    searchFor(searchEngine = "yahoo answers",search = "how to capture all pokemons")//if you have a lot of parameters it can get confusing
    println(alternatingSum(max))
    println(test)
}

fun getMax (vararg numbers: Int): Int {     // we can variable number of arguments that all safe in numbers and ara all integers
    var  max= numbers[0]                //you can treat id as a list
    for (number in numbers) {           //insert and array in between the parameters vararg
        if (number>max){
            max=number
        }
    }
    return max
}

fun searchFor(search: String, searchEngine: String = "Google") { // Default parameter, you don't have to change it because its google by default.
    println ("searching fot '$search' on $searchEngine")
}

//Homework
fun alternatingSum( vararg numbers2: Int):Int{
    var sum = 0
    var toggle = true
    for( i in numbers2) {
        if (toggle) { // checks if even
            sum += i
        } else {
            sum -= i
        }
        toggle = !toggle
    }
      return sum
}