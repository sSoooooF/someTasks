package fromInterview

fun main(){
    println(groupWords(arrayOf("eat", "tea", "ate", "tan", "nat", "bat")))
}

fun groupWords(words: Array<String>):List<List<String>> {
    var result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord))
            map[sortedWord]?.add(word)
        else
            map[sortedWord] = mutableListOf(word)
    }
    for((key, values) in map){
        result.add(values)
    }

    return result
}