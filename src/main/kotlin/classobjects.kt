class person{
    // properties/variables/data members/attributes
    var name:String="moses"
    var age:Int=18
    var location:String="Nairobi"
    var height:Double=5.5

    //METHODS/FUNCTIONS
    fun eat(){
        println("eating")
    }
    fun walk(){
        println("walking")
    }
}
fun main(){
    var teacher=person()
    teacher.eat()
    println(teacher.name+' '+teacher.age+' '+teacher.height+' '+teacher.location)
}


