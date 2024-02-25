package com.study

fun main() {
    val wow = arrayOf(67,45,433,12,76)
    val sizeOfWow = wow.size
    var temp: Int

    for (i in 0 until sizeOfWow -1) {
        for(j in 0 until sizeOfWow-i-1)
            if (wow[j] > wow[j + 1]) {
                temp = wow[j]
                wow[j] = wow[j + 1]
                wow[j + 1] = temp
            }
        println(wow.contentToString())
    }

}
