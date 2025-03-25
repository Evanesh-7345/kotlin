fun main(args: Array<String>) {
    Addtwonum()
}

fun Addtwonum(){
        print("Enter the first number:")
        val num1=Integer.valueOf(readlnOrNull())
        println("Enter the second number:")
        val num2=Integer.valueOf(readlnOrNull())
        println("The sum of $num1 and $num2  is ${num1+num2}")
}
