import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("enter number:")
    var no=read.nextInt()

    if (no%2==0){
     println("$no is even")
    }

    else{
        println("$no is odd")
    }
}