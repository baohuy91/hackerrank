package algorithms.easy


import java.util.*

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
	if (v1 == v2)
		return "NO"

	if (v1 < v2)
		return "NO"

	if ((x2 - x1) % (v1 - v2) != 0)
		return "NO"

	return "YES"
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val x1V1X2V2 = scan.nextLine().split(" ")

	val x1 = x1V1X2V2[0].trim().toInt()

	val v1 = x1V1X2V2[1].trim().toInt()

	val x2 = x1V1X2V2[2].trim().toInt()

	val v2 = x1V1X2V2[3].trim().toInt()

	val result = kangaroo(x1, v1, x2, v2)

	println(result)
}

