import java.util.Scanner

fun main(){
    var read=Scanner(System.`in` )

    println("enter first number:")
    var firstnumber=read.nextInt()

    println("enter second number:")
    var secondnumber=read.nextInt()

    println("enter third number:")
    var thirdnumber=read.nextInt()

    if (firstnumber>secondnumber && firstnumber>thirdnumber){
        println("$firstnumber is the largest")
    }
    else if (secondnumber>firstnumber && secondnumber>thirdnumber){
        println("$firstnumber is the largest")
    }

    else{
        println("$thirdnumber is the largest")
    }


}