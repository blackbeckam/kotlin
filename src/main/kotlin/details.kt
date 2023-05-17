fun main(){
    employee("Collins","Kenyan",false,"Single","Manager",1234)
    employee("Zahra","Ugandan",false,"Married","Marketer",1235)
    employee("Ryan","Tanzanian",false,"Married","Director",1236)
    employee("Kibet","English",false,"Married","Striker",1237)
    employee("Marvel","Italian",false,"Married","MID",1238)

}
fun employee(name:String,citizneship:String,disability:Boolean,status:String,position:String,id:Int){
    println("Employee details:")
    println("Employee name is $name,Employee is a $citizneship,Employee is disables? $disability,Employee marital status is $status ,Employee position is $position,Employee id is $id  ")
}