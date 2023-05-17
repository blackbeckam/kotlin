fun main(){
    var number=1

    while (number<=6){
        println(number)
        number++

        if (number==4){
            break
        }
    }

    var x=30

    while (x>=25) {
        println(x)
        x--

        if (x == 28) {
            break
        }
    }
// continue
    var y=5

    while (y<=10){
        if (y==8){
            y++
            continue
        }
        println(y)
        y++
    }
}