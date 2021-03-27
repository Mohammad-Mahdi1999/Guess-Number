//In His Name
import kotlin.random.Random
fun main()
{
    //ask user to set a upper limit for random number
    println("Enter a higher limit:")
    val upperLimit:Int = readLine()!!.toInt();
    println("Higher Limit is \"$upperLimit\"")

    //pick a random from 1 to upperLimit
    val randomNumber = Random.nextInt(1,upperLimit)
    println("Random Number is \"$randomNumber\"")

}