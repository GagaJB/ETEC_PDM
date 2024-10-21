//A16_Exercicios
//Atividade para presença sexta-feira 11/10/24

fun main() {
    // Exercicio 1: Imprimir números de 1 a 50
    for (i in 1..50) {
        print("$i ")
    }
    println() // Quebra de linha para separar as saídas

    // Exercicio 2: Imprimir números de 50 a 1
    for (i in 50 downTo 1) {
        print("$i ")
    }
    println() // Quebra de linha para separar as saídas

    // Exercicio 3: Imprimir números de 1 a 50, excluindo múltiplos de 5
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
    println() // Quebra de linha para separar as saídas

    // Exercicio 4: Somar os números de 1 a 500
    var sum = 0
    for (i in 1..500) {
        sum += i
    }
    println("A soma de 1 a 500 é: $sum")

    // Exercicio 5: Imprimir uma escada de caracteres de libra (#)
    val n = 5 // valor que você deseja
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}
