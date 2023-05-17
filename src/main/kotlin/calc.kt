import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Enter first Number: ")
    val firstNumber = input.nextFloat()
    print("Enter second Number: ")
    val secondNumber = input.nextFloat()
    print("Enter Action (+, -, *, /, %): ")
    val choice  = input.next()[0]
    val result  = when(choice){
        '+' -> firstNumber  + secondNumber
        '-' -> firstNumber  - secondNumber
        '*' -> firstNumber  * secondNumber
        '/' -> firstNumber  / secondNumber
        '%' -> firstNumber  % secondNumber
        else -> {
            println("Not a valid operation")
        }
    }
    println(result)
}

