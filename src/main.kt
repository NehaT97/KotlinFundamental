fun main() {
    println("Hello Kotlin")
    println("Sum is : " + sum(3, 6))
    println("Multiplication is :" + multiply(2, 2))
    println(getWebsite())

    val (url: String, website: String) = getWebsite1()
    println(url)
    println(website)

    var a: String = "neha"   //mutable
    a = "Thakur"
    println(a)

    /*val b : Int = 20  //unmutable
    b = 40;
    println(b)

    var c : Int
    println(c)    // c must be initialized
    */

    //returns two value
    println("PAIR DEMO");
    var result : Pair<String, String> = (Pair("Hello ", "Kotlin"))
    println(result)
    Pair("Kotlin", 1)
    println(Pair(4, 5))


    //returns Three value
    println("TRIPLE DEMO")
    var result1 : Triple<String, Int, Float> = (Triple("hello" , 10, 20.4f))
    println(result1)
}

fun sum(x: Int, y: Int): Int {
    return x + y;
}

fun multiply(x: Int, y: Int) = x * y

fun getWebsite(): Pair<String, String> {
    return "www.google.com" to "the Website is"
}

fun getWebsite1(): Pair<String, String> {
    return "facebook" to "whatsapp"

}

