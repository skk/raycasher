package RayCaster

fun main(args: Array<String>) {
    var nx = 200
    var ny = 100
    println("P3\n${nx} ${ny}\n255\n")

    val b = 0.2;

    for (j in ny - 1 downTo 0) {
        for (i in 0 until nx) {
            val r = i.toFloat() / nx.toFloat()
            val g = j.toFloat() / ny.toFloat()
            val ir = (255.99  * r).toInt()
            val ig = (255.99  * g).toInt()
            val ib = (255.99  * b).toInt()
            println("${ir} ${ig} ${ib}\n")
        }
    }
}