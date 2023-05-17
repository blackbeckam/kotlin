fun main(){
    for (number in 10..20){
        println("number:$number")}
    for (letter in 'a'..'f'){
        println(letter)
    }
    for (numb in 10..15){

        if (numb==12){
            continue
        }
        println(numb)
    }
    for (myletter in 'a'..'f'){
        if (myletter=='c'){
            break
        }
        println(myletter)

    }
    for (yletter in 'a'..'f'){
        if (yletter=='c'){
            continue
        }
        println(yletter)

    }
}