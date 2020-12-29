fun main(){
    println("Hello Kotlin")
    println("Sum is : " +sum(3,6))
    println("Multiplication is :" + multiply(2,2))

    var a : String = "neha"   //mutable
    a = "Thakur"
    println(a)

    val b : Int = 20  //unmutable
    b = 40;
    println(b)

    var c : Int
    println(c)    // c must be initialized


}

fun sum( x : Int ,y : Int  ): Int {
    return x+y;
}

fun multiply(x : Int, y : Int  )
        = x * y