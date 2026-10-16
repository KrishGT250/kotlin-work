// Name: Krish Punjabi
// Student ID: 202025852

import kotlin.math.sqrt

typealias Triangle = Triple<Double, Double, Double>

fun isValidTriangle(t: Triangle): Boolean {
    val a = t.first
    val b = t.second
    val c = t.third

    return (a < b + c) && (b < a + c) && (c < a + b)
}

fun triangleArea(t: Triangle): Double {
    val a = t.first
    val b = t.second
    val c = t.third

    val s = (a + b + c) / 2.0
    return sqrt(s * (s - a) * (s - b) * (s - c))
}
