import java.util.Scanner
fun main(){
    var proof=Scanner(System.`in`)
    println("Enter Number(1,2,3,4,5:)")
    var day=proof.next()[0]
    when (day){
        '1'-> println("Monday")
        '2'-> println("Tuesday")
        '3'-> println("Wenesday")
        '4'-> println("Thursday")
         '5'-> println("Friday")
    }
}