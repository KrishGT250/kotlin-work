// Name: Krish Punjabi
// Student Number: 202025852

import kotlin.math.sqrt

fun main(args: Array<String>) {
    if (args.size < 3) {
        println("There is an error: values for a, b, c are required on the command line")
        return
    }

    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    val s = (a + b + c) / 2.0
    val area = sqrt(s * (s - a) * (s - b) * (s - c))

    println("Area = %.5f".format(area))
}
