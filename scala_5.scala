/* 5. I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7
min per km) and 2 km at easy pace again to reach home. What is the
total running time? */

object HelloWorld{
    def main(args : Array[String]){
        val easy = 2
        val speedEasy = 8
        val Tempo = 3
        val speedTempo = 7
        val easy2 = 2
        val Ttime = easy * speedEasy + Tempo * speedTempo + easy2 * speedEasy
        println( " otal running time = " + Ttime )
    }
 
}
