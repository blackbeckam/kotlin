import java.util.Scanner
fun main() {
    var read=Scanner(System.`in`)

    println("ENTER FIRST NUMBER:")
    var no1=read.nextFloat()

    println("ENTER SECOND NUMBER:")
    var no2=read.nextFloat()

    var quotient=no1/no2
    println("the quotient is $quotient")

     var remainder=no1%no2
    println("the remainder is $remainder")

}