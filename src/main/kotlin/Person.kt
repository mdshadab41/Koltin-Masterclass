class Person {

    var firstName: String? = null
        set(value) {
            println("Setter for firstName getting invoked")
            field = value?.toUpperCase()
        }
        get() {
            println("getter for firstName getting invoked")

            return field
        }


    var lastName: String? = null
        set(value) {
            println("Setter for firstName getting invoked")
            field = value
        }
        get() {
            println("getter for firstName getting invoked")

            return field
        }
    var age: Int? = null
        set(value) {
            if(value?.compareTo(18)!!<0){
                throw Exception("Person is Minor")
            }else{
                field = value
            }
        }

   constructor() {
    }

    constructor(fName: String, lName: String): this(){
        firstName = fName
        lastName = lName

   }
fun someRaandomFun() {

        println("Some Random Function: ${this.firstName}")


    }

}


