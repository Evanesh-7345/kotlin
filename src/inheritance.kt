open class MyparentClass{
    val father="He likes watching football"
    val mother="She likes going shopping"

}
class MyboychildClass:MyparentClass(){
    fun boy(){
        println(father)
    }

}
class MygirlchildClass:MyparentClass(){
    fun girl(){
        println(mother)
    }

}

fun main(args: Array<String>) {
    val myobj=MyboychildClass()
    myobj.boy()
    val myobj2=MygirlchildClass()
    myobj2.girl()
}


