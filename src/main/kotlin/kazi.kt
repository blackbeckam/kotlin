import java.util.Scanner
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)


    print("Enter Character : ")
    val c = scanner.next()[0]

    when (c) {
        'a','e' ,'i' ,'o' ,'u','A','E','I','O','U' -> println("The given character $c is vowel")
        else -> println("The given character $c is consonant")
    }

    //or

    println("Enter letter:")
    var letter=scanner.next().single()
    if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
        println("$letter is a vowel")
    }
    else { println("The given character $letter is consonant")}
}