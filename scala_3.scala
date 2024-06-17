/* 3. The volume of a sphere with radius r is 4/3 Pi r3. What is the
volume of a sphere with radius 5?
*/

object HelloWorld{
    def main(args : Array[String]){
        val radius = 5
        val pi =22.0/7.0
        val volume = 4/3 * pi * radius *  radius * radius

        println("The area is: " + volume)
        
    }
}