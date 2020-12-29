//data class - if we are not mentioning as a data class it will give the output not equal
data class Person(val name: String , var age: Int) {
}

fun main() {
    var person1 = Person("John",50)
    var person2 = Person("John",50)

    if (person1 == person2){
        println("equal")
    }

    else{
        println("not equal")
    }
}
