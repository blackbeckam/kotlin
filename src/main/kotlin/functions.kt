

fun main(){
    //predefined functions
    println("Hello world")

    var squareroot=Math.sqrt(256.0)
    println(squareroot)

    var roundoff=Math.round(34.56)
    println(roundoff)

    var number=Math.ceil(34.56)
    println(number)

    myfun()
    sum()
    details("Moses",18)
    details("Mark",34)

}

// user defined function
fun myfun(){
    println("Today is Friday")
}
fun sum(){
    var num1=12
    var num2=13
    println(num1+num2)

}

fun details(name:String,age:Int){

    println("$name is $age years old")
}