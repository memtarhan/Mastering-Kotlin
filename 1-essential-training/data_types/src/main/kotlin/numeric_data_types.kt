fun main(args: Array<String>) {
    // Immutable variables -> var
    var count: Int = 0

    // Constants -> val
    val limit: Int = 42

    // Type inference
    val inferred = 10

    /*
    Int     -> 32 bits
    Long    -> 64 bits
    Byte    -> 8 bits
    Short   -> 16 bits
     */

    val myLong: Long = 300000000L
    val myByte: Byte = 127
    val myShort: Short = 32767

    // Double and Float
    val myDouble: Double = 98.6
    val myFloat: Float = 12.1F
    val anotherDouble = 101.5

    // Conversion
    val asInt = anotherDouble.toUInt()
    val asFloat = myLong.toFloat()

    // Using underscores
    val maxInt = 2_147_438_648

    // Literals
    /*
    Hexadecimal     -> 0xFEDC
    Binary          -> 0b10101
    Long            -> 123456L
     */

}