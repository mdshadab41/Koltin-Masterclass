fun main(){
    val waiter = Waiter(Chef(), Bartender())

    //val beverage = waiter.prepareBeverage("Soda")
    val entree = waiter.prepareEntree("Salmon on Rice")

    waiter.receiveCompliment("The salmon entree was fantastic!")
    waiter.receiveCompliment("The peach tea beverage was fantastic!")
    waiter.receiveCompliment("The service was fantastic!")

}

interface KitchenStaff{
    fun prepareEntree(name: String): Entree?

    fun receiveCompliment(message: String)
}

interface BarStaff{
    fun preparebeverage(name: String): Beverage?
    fun receiveCompliment(message: String)

}

class Bartender: BarStaff{
    override fun preparebeverage(name: String): Beverage? = when(name) {
        "Water"  -> Beverage.WATER
        "Soda"   -> Beverage.SODA
        "Peach Tea" -> Beverage.PEACH_ICED_TEA
        "Tea-Lemonade" -> Beverage.TEA_LEMONADE
        else       -> null
    }

    override fun receiveCompliment(message: String) =
        println("Bartender received a compliment: $message")
}

class Chef: KitchenStaff {
    override fun prepareEntree(name: String): Entree? = when(name){
        "Tossed Salad" -> Entree.TOSSED_SALAD
        "Salmon on Rice" -> Entree.SALMON_ON_RICE
        else -> null
    }

    override fun receiveCompliment(message: String) =
        println("Chef received a compliment: $message")
}

//class Waiter(private val chef: Chef): KitchenStaff by chef{
//    //The waiter can prepare a beverage by himself...
//    fun prepareBeverage(name: String): Beverage? = when (name){
//        "Water" -> Beverage.WATER
//        "Soda" -> Beverage.SODA
//        else   -> null
//    }
//
//    //...but need the chef to prepare the ent
////     fun prepareEntree(name: String): Entree? = chef.prepareEntree(name)
//    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
//
//}

class Waiter(
    private val chef: Chef,
    private val bartender: Bartender
): KitchenStaff by chef,BarStaff by bartender{

    override fun receiveCompliment(message: String) = when {
        message.contains("entree") -> chef.receiveCompliment(message)
        message.contains("beverage") -> bartender.receiveCompliment(message)
        else -> println("Waiter received compliments")
    }
//    override fun preparebeverage(name: String): Beverage? = bartender.preparebeverage(name)

    override fun prepareEntree(name: String): Entree? =
        if (name == "Tossed Salad") Entree.TOSSED_SALAD else chef.prepareEntree(name)
    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
}

enum class Entree{TOSSED_SALAD, SALMON_ON_RICE}
enum class Beverage{WATER, SODA, PEACH_ICED_TEA, TEA_LEMONADE}

