package com.chucky.kotlinfundamentals

fun mySum(n1 : Int, n2 : Int) {
    println("result = ${n1 + n2}")
}

fun myMultiply(n1: Int, n2: Int) : Int {
    val result = n1 * n2
    return result //or directly return n1 * n2
}

fun mySubtract(n1: Int, n2: Int) : Int {
    return n1 - n2
}

fun myDivision(n1: Int, n2: Int) : Double {
    return n1 / n2
}


fun main() {
    mySum(3, 5)

    println("Result = ${myMultiply(3,5)}")
}
