//In His Name
import kotlin.random.Random

fun main() {

    //ask user to set a upper limit for random number
    println("Enter a higher limit:")
    val upperLimit = readLine()!!.toInt()
    println("Higher Limit is \"$upperLimit\"")

    //pick a random from 1 to upperLimit
    val randomNumber = Random.nextInt(1, upperLimit)

    //Let user to guess the number
    var isTrue = false
    var guessNumber: Int
    var counter = 1

    while (!isTrue) {
        println("Guess the Number:")
        guessNumber = readLine()!!.toInt()

        when {
            guessNumber==randomNumber -> {
                println("You guessed correctly in $counter tries.")
                isTrue=true
            }
            guessNumber<randomNumber -> {
                println("the number is too small")
                counter++
            }
            else -> {
                println("the number is too big")
                counter++

            }
        }

    }
}