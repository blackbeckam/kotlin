import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("enter the temperature")
    var temperature=read.nextDouble()

    if (temperature<37){
        println("it is too cold")
    }
    else if (temperature>37){
        println("it is too hot")
    }

    else{
        println("normal temperature")
    }
}