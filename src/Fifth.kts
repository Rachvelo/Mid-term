fun grade() {

    val scores = mutableMapOf<String, Double>("Physics" to 0.0, "Maths" to 0.0, "Python" to 0.0)
    scores["Physics"] = 20.0
    scores["Maths"] = -5.0
    scores["Python"] = 100.0
    scores["Physics"] = scores["Physics"]!!.times(1.5)
    println(scores)

}

grade()