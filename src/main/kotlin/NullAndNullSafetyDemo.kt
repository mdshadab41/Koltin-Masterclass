fun main(){

//    val saraReview = CoffeeReview("Sara","Loved the coffee!", 5)
//    val tobyReview = CoffeeReview("Toby","Pretty Good", 4)
//    val lucyReview = CoffeeReview("Lucy","Will this buy again")
//

//    fun printReview(review: CoffeeReview) =
//        println("${review.name} gave it ${review.stars} stars!")
//
//
//    println("Latest coffee reviews")
//    println("----------------------")
//    printReview(saraReview)
//    printReview(tobyReview)
//    printReview(lucyReview)
//
//    fun printReview(name: String, stars: Int) =
//        println("$name gave it $stars stars!")

//    val saraStars: Int? = 5
//    printReview("Sara", saraStars)

//    fun orderCoffee(payment: Payment): Coffee{
//        return Coffee()
//    }
//
//    val payment: Payment? = null

//    //smart casting
//    if(payment != null){
//        val coffee = orderCoffee(payment)
//    }else{
//        println("I can't order coffee today")
//    }

//    when(payment){
//        null -> println("I can't order today")
//        else -> orderCoffee(payment)
//    }

    //val coffee = orderCoffee(if(payment !=null) payment else getPaymentFromFriend())
   //val coffee = orderCoffee(payment?:getPaymentFromFriend())

//    val coffee = orderCoffee(payment!!)//non-nullable

//    fun orderCoffee(payment: Payment?): Coffee{
//        val paymentType = payment?.type?.name?.toLowerCase() ?: "encouragment"
//        println("Thank you for supporting us with your $paymentType")
//        return Coffee()
   // }


}

class CoffeeReview(
    val name: String,
    val comment: String,
    val stars: Int?=null
)
enum class PaymentType{
    CASH, CHECK, CARD;
}

class Payment (
    val type: PaymentType = PaymentType.CASH
)
