//super class
open class shape{
   open fun draw(){
        println("drawing")
    }
}

//child class
class rectangle2:shape(){
    override fun draw(){
        println("draw a rectangle")
    }
}
class square1:shape(){
    override fun draw(){
        println("draw a square")
    }
}
fun main(){
    var r=rectangle2()
    r.draw()
    var s=square1()
    s.draw()
}