open class figure{
    var start="start"
    fun area(){
        println("this is the area")
    }
    fun perimeter(){
        println("this is the perimeter")
    }
    fun draw(){
        println("this is")
    }
}

class circle:figure(){
    var radius=12
    fun area1(){
        println("this is the area")
    }
    fun perimeter1(){
        println("this is the perimeter")
    }
    fun draw1(){
        println("this is")
    }
}
open class rectangle:figure(){
    var width=3
    var height=7
    fun area2(){
        println("this is the area")
    }
    fun perimeter2(){
        println("this is the perimeter")
    }
    fun draw2(){
        println("this is")
    }
}

class square:rectangle(){

}
fun main(){
    var f=figure()
    f.area()
    var c=circle()
    c.area()
    var r=rectangle()
    r.area()
    var s=square()
    s.draw2()
}