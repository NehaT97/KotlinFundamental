/* Scope Function */

class Employee {
    var name: String = "Neha"
    var age: Int = 23
}

fun main() {

    /** scope Function : 'with' properties
    1.refer to context object by using 'this'
    2.the return value is 'lambda result'
     **/


    val person = Employee()
    // println(person.name) //repeating person object
    // println(person.age)

    println("\n____WITH FUNCTION____")
    //Operating on object
    val personAgeAfterFiveYears: Int = with(person) {
        println(name)
        println(age)

        age + 5
    }

    println("Person Age After 5 years : $personAgeAfterFiveYears")


    /** scope Function : 'Apply' properties
    1.refer to context object by using 'this'
    2.the return value is 'Context Object'
     **/

    println("\n____APPLY FUNCTION____")
    val person1 = Employee().apply {
        this.name = "Shubham"
        this.age = 20
    }

    with(person1) {
        println(name)
        println(age)
    }

    person1.also {
        it.name = "THAKUR"
        println("Updated Name : ${it.name}")
    }

    /** scope Function : 'also' ->To Perform Additional operation on object after initialising
    1.refer to context object by using 'it'
    2.the return value is 'Context Object'
     **/

    println("____ALSO FUNCTION____")

    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)
    /*
    println("the list elements are:$numberList")

    numberList.add(4)
    println("the updated list elements are:$numberList")

    numberList.remove(2)
    println("the updated list elements are:$numberList")
    */
    
    numbersList.also {
        println("the list elements are:$it")

        it.add(4)
        println("the updated list elements are:$it")

        it.remove(2)
        println("the updated list elements are:$it")
    }



}