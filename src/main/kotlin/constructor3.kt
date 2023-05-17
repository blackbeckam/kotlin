class dogs(var breed:String,var size:String,var age:Int,var color:String){
    fun Eat(food:String){
        println(food)
    }

    fun Sleep(sleep:String) {
        println(sleep)
    }

    fun Sit(sit:String) {
        println(sit)
    }

    fun Run(run:String) {
        println(run)
    }
}
fun main(){
    var dog1=dogs("neopolitan mastiff","large",5,"black")
    dog1.Eat("dog food")
    println(dog1.breed)
    var dog2=dogs("maltese","small",2,"white")
    println(dog2.breed)
    var dog3=dogs("chow chow","medium",3,"brown")
    println(dog3.breed)
}