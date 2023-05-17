import java.util.Scanner
fun main(){
    var read=Scanner(System. `in`)

    println("enter the length")
    var l=read.nextInt()

    println("enter the width")
    var w=read.nextInt()

    var sum=l+w
    var perimeter=sum*2
    println("the perimeter is $perimeter")
}