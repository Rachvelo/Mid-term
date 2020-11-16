fun loveornot() {

    val map1 = mapOf("Miyvars" to "Kitri", "Ar Miyvars" to "Pamidori")
    val map2 = mapOf("Miyvars" to "Kitri", "Ar Miyvars" to "Stafilo")
    val DoWeLikeSame = map1["Miyvars"].equals(map2["Miyvars"])
    val doWeDislikeSame = map1["Ar Miyvars"].equals(map2["Ar Miyvars"])

    println(DoWeLikeSame)
    println(doWeDislikeSame)
}

loveornot()

