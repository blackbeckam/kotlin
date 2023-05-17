open class shape1{
    open fun area(){
        println("this is area")
    }

}

class circle4:shape1(){
    override fun area(){
        println("circle")
    }
}

class triangle2:shape1(){
    override fun area(){
        println("triangle")
    }
}
class rectangle3:shape1(){
    override fun area(){
        println("rectangle")
    }
}
fun main(){
    var c=circle4()
    c.area()
    var t=triangle2()
    t.area()
    var r=rectangle3()
    r.area()

}
