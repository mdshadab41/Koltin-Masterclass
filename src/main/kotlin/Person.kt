class Person {

    lateinit var firstName: String
    lateinit var lastName: String

   constructor() {
       println("This is primary constructor")
    }

    constructor(fName: String, lName: String): this(){
        firstName = fName
        lastName = lName
       println("This is Secondary parameter")
   }
fun someRaandomFun() {
    if (this::firstName.isInitialized) {
        println("Some Random Function: ${this.firstName}")
    } else {
        println("first name is not iniliazed")
    }

}
}

