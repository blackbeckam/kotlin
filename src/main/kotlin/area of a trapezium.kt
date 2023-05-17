import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("enter the parallel side 1")
    var a=read.nextInt()

    println("enter the parallel side 2")
    var b=read.nextInt()

    println("enter the height")
    var h=read.nextInt()

    var area=0.5*(a+b)*h
    println("the area of the trapezium is $area")

}