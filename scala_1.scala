/* 1. Area of a disk with radius r is Pi r*r. What is the area of a disk with
 radius 5?*/

object HelloWorld{
    def main(args : Array[String]){
        val radius = 5
        val pi =22.0/7.0
        val area = pi * radius * radius

        println("The area is: " + area)
        
    }
}