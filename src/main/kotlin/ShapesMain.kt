fun main() {
    val rectangle1 = RectangleClass( 5.0, 7.0)
    println("rectangle area is ${rectangle1.area()}")
    println("rectangle perimeter is ${rectangle1.perimeter()}")
    println("rectangle square is ${rectangle1.isSquare()}")
    val rectangle2 = RectangleClass(2.0)
    val rectangle3 = RectangleClass(3,5)

    val list = listOf<Int>(1,2,3,4,5)
    val array = arrayOf(1,2,3,4,5)

    val circle1 = Circle (7.0)
    val circle2 = Circle (3.0)
    circle2.changeName("SmallerCircle")
    println(circle2.name)
    val circle4 = Circle.randomCircle()


    val triangle1 = Triangle (3.0, 2.0, 6.0)
    triangle1.changeName("John")

    val rectangle4 = RectangleClass(5.0)
    val circle3 = Circle(3.0)
    val triangle2 = Triangle(4.0,7.0,3.0)

    val maxArea1and2 = maxArea(rectangle4,circle3)
    val maxArea1to2to3= maxArea(rectangle4,circle3,triangle2)

    println("max area is $maxArea1and2")
    println("max area is $maxArea1to2to3")

    val a = 3.0
    val b = 4.0
    val h = 2.0
    val parallelogram = object : Shape("parallelogram",a,b,h){

        init {
            println("parallellogram created with a = $a , b = $b and h = $h")
            println("area = ${area()}")
            println("perimeter = ${perimeter()}")
        }

        override fun area() : Double {
            return a*h
        }

        override fun perimeter() : Double{
            return 2*a +2*b
        }
        fun isRectangle(): Boolean = h == b

    }
    println("Is is ? ${parallelogram.isRectangle()}")
    val bg = 3.0
    val bc = 4.0
    val l = 2.0
    val o = 5.0
    val height = 4.0
    val trapecio = object : Shape("parallelogram",bg,bc,l,o,height){

        init {
            println("parallellogram created with B = $bg , b = $bc , l = $l, o = $o, height = $height")
            println("area = ${area()}")
            println("perimeter = ${perimeter()}")
        }

        override fun area() : Double {
            return ((bg+bc)/2)*height
        }

        override fun perimeter() : Double{
            return bg+bc+l+o
        }
        fun mightBeParalelogram(): Boolean = bc == bg

    }


}
fun maxArea(shape1:Shape, shape2:Shape,): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()

    return if(areaShape1 > areaShape1) areaShape1 else areaShape2
}
fun maxArea(shape1:Shape, shape2:Shape,shape3:Shape): Double{
    val maxShapeArea = maxArea(shape1,shape2)
    val areaShape3 = shape3.area()

    return if (maxShapeArea>areaShape3) maxShapeArea else areaShape3
}
fun alternatingPrint(list: List<Int>) {
    var j = list.size - 1
    var i = 0
    var toggle = true
    while (i <= j)  {
        if (toggle) {
            println(list[i])
            i++
        } else {
            print(list[j])
            j--
        }
        toggle = !toggle

    }
}

fun alternatingPrint(array: Array<Int>) {
    var j = array.size - 1
    var i = 0
    var toggle = true
    while (i <= j)  {
        if (toggle) {
            println(array[i])
            i++
        } else {
            print(array[j])
            j--
        }
        toggle = !toggle

    }
}
//exceptions are an event that occurs in the running of a program and disrupts the normal flow, that we crash if we do not manage it correctly  