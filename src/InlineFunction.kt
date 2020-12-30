fun main(){
    calculateTimeAndRun {
        loop(10000000)
    }
}
//using inline it improves the  performance
inline fun calculateTimeAndRun(fn: ()->Unit){
    val start : Long = System.currentTimeMillis();
    fn()
    val end : Long = System.currentTimeMillis();
    println("Time Taken To execute: ${start - end}ms")
}

fun loop(number: Long){
    for (i:Long in 1..number){

    }

}