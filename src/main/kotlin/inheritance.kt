//parent/super/base class
open class animal{
    var age:Int=12
    var gender:String="female"
    fun ismammal(){
        println("Animal is a mammal")
    }

}
//child/sub/derived classes
class duck:animal(){
    var color="white"
    fun swim(){
        println("swim")
    }

}
class fish:animal(){
    var Caneat=true
    fun swim(){
        println("can swim")
    }
}

class  horse:animal(){
    var iswild=true
    fun run(){
        println("running")
    }
}
fun main(){
    var d=duck()
    var f=fish()
    var h=horse()
    println(d.color)
    f.swim()
}