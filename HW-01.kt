fun main() {
    val candles = 24
    val layers = 5

    printCakeCandles(candles)
	printCakeTop(candles)
	printCakeBottom(candles, layers)    
}

fun printCakeCandles(candles: Int){
    repeat(candles){
	print(",")
    }
        println("")

      repeat(candles){
    print("|")
    }
        println("")

}

fun printCakeTop(candles: Int){
    repeat(candles){
        print("=")
    }

}

fun printCakeBottom(candles: Int, layers: Int){
    repeat(layers){
         println("")
              
        repeat(candles){
         print("@")
 }}}
