fun main() = (fibonacci())
fun fibonacci() {
    println("Enter number: ")
    val n: Int = readLine()?.toIntOrNull() ?: return
    var n1 = 0
    var n2 = 1

    for (i :Int in 1 .. n){
        if (i == n) {
            println(n1)
        }

        val sum :Int = n1 + n2
        n1 = n2
        n2 = sum
    }


}