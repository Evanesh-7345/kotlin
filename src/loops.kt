fun main(args: Array<String>) {
    // while loop

    var num=10
    while (num>=5){
        println("Loop: $num")
        num-=2
    }
//    for loop
    val students= arrayOf("Evance","Chichi","Jevan","Vascol")
    students.sort()
    for (i in students){
        println(i)
    }
    val nambari= arrayOf(-4,0,34,64,76,23,7,23,65,-3,-65,-18)
    nambari.sort()
    for (c in nambari){
        println(c)
    }
}