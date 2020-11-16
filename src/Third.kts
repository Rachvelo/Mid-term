fun mix() {
    val sia = listOf("business", "technology", "student", "university", "subject")

    val lengths = sia.map { v -> v.length }

    val withLengths = sia.map { v -> mapOf(v to v.length) }

    val withLengthsOne = sia.map { v -> v to v.length }.toMap()

    println(withLengthsOne)
    println(withLengths)
    println(lengths)
}

mix()
