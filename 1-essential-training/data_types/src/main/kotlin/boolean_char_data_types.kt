fun main(args: Array<String>) {
    println("Boolean and Char data types")

    // Character
    /*
    Char        -> var letter = 'A'
    ASCII       -> var tab = '\t'
    Unicode     -> var infinity = '\u221E'
     */

    val letter = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("letter = $letter")
    println("tab = $tab")
    println("infinity = $infinity")

    val bool1: Boolean = true
    val bool2 = false

    val bigNumber = 1_000_000
    val smallNumber = 100

    println("Is bigNumber bigger? $tab ${bigNumber > smallNumber}")
}
