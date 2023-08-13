
open class Animal{
   open fun makeSound(){
        println("Make generic sound")
    }
}

open class WildAnimal: Animal(){
    override fun makeSound() {
        println("Make Wildanimal sound")

    }
}

open class DomesticAnimal: Animal(){
    override fun makeSound() {
        println("Make DomesticAnimal sound")

    }
}


class Tiger: WildAnimal(){
    override fun makeSound() {
        println("Make Tiger sound")

    }
}

class Cat: DomesticAnimal(){
    override fun makeSound() {
        println("Make Cat sound")

    }

}

class Dog: DomesticAnimal(){
    override fun makeSound() {
        println("Make bark sound")

    }
}


fun main(){

    val animal: DomesticAnimal = Cat()
    animal.makeSound()

}