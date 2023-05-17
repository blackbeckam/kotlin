class car{
    var make=12
    var model=13
    var color="blue"
    var drivingspeed="180km/h"

    fun drive(){
     println("driving")
    }
    fun turn(){
        println("turning")
    }
    fun stop(){
        println("stopping")
    }
}
fun main(){
    var driver=car()
    driver.stop()
    println(driver.make)
    println(driver.model)

    var pickup=car()
    pickup.drive()
    pickup.turn()
    println(pickup.color)
    println(pickup.drivingspeed)



}