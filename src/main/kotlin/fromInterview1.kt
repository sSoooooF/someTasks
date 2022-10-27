package fromInterview

fun main(){
    // Даны массивы [1,2,3,2,0] и [5,1,2,7,3,2]
    // нужно получить [1,2,2,3] (порядок не важен)
    println(getRepeatedIntersection((intArrayOf(1,2,3,2,0)), intArrayOf(5,1,2,7,3,2)))


}

fun getRepeatedIntersection(a1: IntArray, a2: IntArray): List<Int>{
    val s1 = a1.toHashSet()
    val s2 = a1.toHashSet()

    val result = mutableListOf<Int>()

    for (e in s1){
        if (s2.contains(e)){
            val numberOfRepeats = minOf(a1.count{e == it}, a2.count{e == it})
            repeat(numberOfRepeats) {result.add(e)}
        }
    }
    return(result)
}

