fun main(args: Array<String>) {
    println("Enter marks: ")
    val marks=Integer.valueOf(readlnOrNull())
    if (marks>=80 && marks<=100){
        println("Your grade is A")
    }
    else if (marks>100){
        println("Invalid marks")
    }
    else if (marks>=70 && marks<80){
        println("Your grade is B")
    }
    else if (marks>=50 && marks<70){
        println("Your grade is C")
    }
    else if (marks>=30 && marks<50){
        println("Your grade is D")
    }
    else println("Your grade is E")





}