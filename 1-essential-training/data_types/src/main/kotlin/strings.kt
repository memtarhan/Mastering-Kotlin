import kotlin.math.sin

fun main(args: Array<String>) {
    println("Strings")

    val string: String = "#1"
    val string2 = "#2"

    val age = 27
    val ageDescription = "I'm $age years old"
    println(ageDescription)

    val debt = 100
    val owed = "I owe \$$debt"
    println(owed)

    val greeting = "Hello there"
    var c1 = greeting[0]
    var c2 = greeting[1]

    println("${c1.compareTo(c2)}")

    val sub = greeting.subSequence(6, 9)
    println("sub = $sub")

    for (single in greeting) {
        print("$single")
    }
}