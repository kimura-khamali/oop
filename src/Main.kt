import com.sun.source.doctree.AuthorTree

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 //house object  cutter-template-plan -class-template for creating objects
//sketch can e template
//manual script for novels
//constractor of the class always the rule of the class to create object
//dot opperator used to access state and attributes of an object
//we use class to create an object which is called instance of a class tangible
/*fun main() {
var car = Car("Toyota", "Prado", "KDO 1231", 0)
    //var ca2 = Car("Subaru", "Outback", "KDU 3435",0)
    println(car.make)
    //println(car)
    car.start()
    println(car.speed)
    //NO Car.start() its aclass note applicable its a template
    car.accelerate(accelaretion = 40)
    println(car.speed)
    car.accelerate(accelaretion = 80)//120
    car.deccelaration(declaration = 20 )//100
car.hoot()
    println(car.speed)
   println( car.speed)
    car.stop()
    println(car.speed)
}//var makes property to be able to be accessed and modified
class Car(var make: String, var model: String, var registration:String,  var speed: Int ) {
    fun start() {
        println("chongingiongio, vhruruuuuu")
    }

    fun accelerate(accelaretion: Int): Int {
        speed += accelaretion
        return speed
    }

    fun deccelaration(declaration: Int): Int {
        speed -= declaration
        return declaration
    }

    fun hoot() {
        println("HootHoot")
    }

    fun stop() {
        //speed = 0//0
        deccelaration(speed)//0
    }
}*/
//Data class//colects ultiple function
fun main() {
    var myBook = Book("Tell me lies", "Teresa Driscal", 334)
    println(myBook.author)
    println(myBook.pages)
    println(myBook.title)
}
data class Book(
    var title: String,
    var author: String,
    var pages: Int
)

fun main() {

}
data class AgeSet (
    var min :Int?,
    var max: Int?,
    var average: Double,
    var total: Int
)//double-nullassercion opperator
fun calculateAgeStatus(ages: Array<Int>): AgeSet{
    val min = ages.minOrNull()
    val max = ages.maxOrNull()
    val avg = ages.average()
    val total = ages.sum()
    val result = AgeSet(min,max,avg,total)
    return result
}
