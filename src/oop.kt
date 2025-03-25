class Myclass{
//    data member
    var myname:String="My name is Evanesh Evee."

//    member function

    fun  display(){

        println(myname)

    }
}

fun main(args: Array<String>) {
//    create an instance object
    val myobj=Myclass()
    myobj.display()
    val obj2=Car()
    obj2.brand="Mercedes"
    obj2.model="G-class"
    obj2.yearofman=2024

    println("My favourite car brand is ${obj2.brand} and model is ${obj2.model} manufactured in ${obj2.yearofman}")
}
class Car{
    var brand=""
    var model=""
    var yearofman=0

}