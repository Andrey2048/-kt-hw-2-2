fun main() {
    for (i in 1..121) {
        println("Нравится  $i " + likesTitle(i))
    }
}

fun likesTitle(likes: Int): String {
    return if ((likes % 10 == 1) and (likes % 100 != 11)) "человеку"
    else "людям"
}