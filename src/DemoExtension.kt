fun main(){
    println("Hello Kotlin".messageNumber().messageHeading())
    Example().printFunctionType();
}

fun String.messageHeading() : String{
    return "-------------\n$this\n--------------"
}

fun String.messageNumber() : String {
    return "1.\t$this"
}

class Example{
    fun printFunctionType(){
        println("Class Method")
    }
}


