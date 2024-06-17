/* 4. Suppose the cover price of a book is Rs. 24.95, but bookstores get
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75
cents for each additional copy. What is the total wholesale cost for 60
copies? */

object HelloWorld{
    def main(args : Array[String]){
        val bookPrice = 24.95
        val discount = 0.40
        val shipCost1 = 3
        val shipCost2 = 0.75
        val shopOder = 60
        val oderCost = shopOder * bookPrice * discount + shipCost1 * 50 + shipCost2 * (shopOder-50) 
        println( " total wholesale cost for 60 copies = " + oderCost )
    }
        
    
}
