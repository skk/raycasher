package RayCaster

import java.io.File

fun main(args: Array<String>) {
    val imageData = generatePPMImageData()

    File("image.ppm").bufferedWriter().use { out ->
        imageData.forEach {
            out.write(it)
        }
    }

}

fun generatePPMImageData(): MutableList<String> {
    val nx = 200
    val ny = 100

    val data = mutableListOf<String>()
    data.add("P3\n$nx $ny\n255\n")

    val b = 0.2

    for (j in ny - 1 downTo 0) {
        for (i in 0 until nx) {
            val r = i.toFloat() / nx.toFloat()
            val g = j.toFloat() / ny.toFloat()
            val ir = (255.99  * r).toInt()
            val ig = (255.99  * g).toInt()
            val ib = (255.99  * b).toInt()
            data.add("$ir $ig $ib\n")
        }
    }

    return data
}