fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("First letter is $firstChar and $lastChar for second letter")

}

// TODO 1
fun String.getFirstAndLast() = mapOf<String, Char>(
        "first" to this.get(0),
        "last" to this.get(this.length-1)
)