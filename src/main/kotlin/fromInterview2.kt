package fromInterview

fun main(){
    // AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB -> A4B3C2XYZD4E3F3A6B28

    println(getNumOfChar("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"))
}

fun getNumOfChar(str : String):String{
    var currentLetter = str[0]
    var count = 1
    var result = ""

    for(letter in str.substring(1)){
        if(currentLetter == letter)
            count++
        else{
            if(count == 1)
                result += currentLetter
            else
                result += "$currentLetter$count"

            count = 1
            currentLetter = letter
        }
    }

    if (count == 1)
        result += currentLetter
    else
        result += "$currentLetter$count"

    return result
}

