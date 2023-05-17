class dog(var name:String,var breed:String,var color:String,var age:Int, var weight:Int){

    fun speak(talk:String){
        println(talk)
    }
}
fun main(){
    var dog1=dog("Tito","Chiwawa","black",5,12)
    println(dog1.name)
    dog1.speak("Barking")

    var dog2=dog("billy","kienyeji","brown",12,12)
}

