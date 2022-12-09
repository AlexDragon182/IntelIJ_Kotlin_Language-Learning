import javax.print.attribute.standard.NumberUpSupported

//Lambda functions is how to use a function as a parameter
//ctrl + p to see what king of function you want in here
fun main(){
    val circle1 = Circle(3.5)
    val circle2 = Circle(7.0)
    val triangle1 = Triangle(4.0,3.0,7.0)
    val triangle2 = Triangle(5.0,2.0,6.0)
    val rectangle1 = RectangleClass(5.0)
    val rectangle2= RectangleClass(5.0,7.0)

    var integers = (1..10).toList().customfilter { it > 5 }
    var triple = Triple<Int,String,Boolean> (5,"hola",true)
    var customTriple = CustomTriple<Int,String,Boolean>(7,"bonjour",true)


    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectangle1,rectangle2)
    shapes = shapes.customfilter { it.area() > 20.0 }
    for (shape in shapes) {
        println("${shape.name} and ${shape.area()}")
    }



    var list = (1..20).toList()
    println(list)

    list = list.sortedBy { it.isPrime() }
    println(list)

    list = list.filter { it % 2 == 0 }
    println(list)

}

fun <T> List<T>.customfilter(filterFunction: (T) -> (Boolean)): List <T> {
    val result = mutableListOf<T>()
    for(item in this){
        if (filterFunction(item)) {
            result.add(item)
        }
    }
    return result
}
//T is naming convention for generic types
//Shift + f6 to rename variable