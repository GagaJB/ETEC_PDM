//Aula 6: Métodos e propriedades do String

fun main(){
    val str = "Programação Kotlin"
    var msg:String

    msg = "Tamanho da string: ${str.length} caracteres"
    //Propriedade length (comprimento, tamanho)

    msg = "Posição (índice) 0 da string: ${str[9]}"
    //Propriedade contéudo no índice 0

    msg = str.startsWith("Pro").toString()
    //Método booleano de string: começa com?

    msg = str.endsWith("abc").toString()
    //Método booleano de string: termina com?

    msg = str.substring(2,9)
    //Método de string que recupera do índice 2 até antes do 9

    msg = str.replace("Kotlin", "com Kotlin.")
    //Método de string que substitui um trecho de texto

    msg = str.lowercase()
    //Converte tudo em minúsculas

    msg = str.uppercase()
    //Converte tudo em maiúsculas

    val str2 = "        Usada no Android Studio!    "
    msg = str2.trim()
    msg = str + str2.trim() + str
    msg = "$str ${str2.trim()} $str"
    //Tira os espação

    println(msg)
}