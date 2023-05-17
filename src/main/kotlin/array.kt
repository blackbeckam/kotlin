fun main(){
    var language= arrayOf("python","javascript","kotlin")
    language[2]="c++"
    println(language[2])
   var lang=language.plus("laravel")
    for (x in lang){
        println(x)
    }
    var dd=lang.size
    println(dd)

    var xx=language.size
    println(xx)


}