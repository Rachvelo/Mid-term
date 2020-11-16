fun genlist() {

    val words = listOf("computer", "program", "book", "boat",
            "table", "dog", "folder")

    val w1 = words.first()
    println(w1)

    val w2 = words.last()
    println(w2)

    val w3 = words.findLast { w -> w.startsWith('b') }
    println(w3)

    val w4 = words.first { w -> w.startsWith('b') }
    println(w4)
}

genlist()
