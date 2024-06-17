/* 2. The temperature is 35C; convert this temperature into Fahrenheit.
ºF =ºC * 1.8000 + 32.00 */

object HelloWorld{
    def main(args : Array[String]){
        val Ratio = 1.8000
        val Celsius =35
        val Fahrenheit = Celsius * Ratio + Ratio

        println("The Fahrenheit temperature is: " + Fahrenheit)
        
    }
}