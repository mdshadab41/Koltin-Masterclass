fun main() {

    fun isEven(number: Int): Boolean = number%2==0

    //Variable argument functions

    fun sum(vararg numbers: Int, name: String = "S"): Int{
        var sum = 0
        for (number in numbers){
            sum = sum+number
        }
        return sum

    }


    val person = Person()
    person.firstName = "Shadab"
    person.lastName = "Rayeen"
    person.age = 19

    println(person.displayPerson(param = "p"))

    println("${person.firstName} ${person.isMinor()}")

    person.demoFunction("Shadab", "R")

    println(isEven(20))


    println("Sum: ${sum(12,3,3,name="SS")}")



}