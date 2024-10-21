fun main() {
    // Aula 1: Primeiro contato

    println("Olá, mundo!")

    print("Edson")
    print(" ")
    print("Parisotto")

    println()

    var nome = "Edson\nEscape Parisotto"
    println(nome)

    //var nome = "Não posso redeclarar uma variável"
    nome = "Edson"
    print("Olá, " + nome + "\n")

    var sobrenome = "Parisotto"
    println("Como vai, $nome $sobrenome")

    val variavelEstatica = "Bom dia"
    //variavelEstatica = "Não posso reatribuir um novo valor1"

    println(variavelEstatica)

    val nomeCompleto = nome + "  " + sobrenome
    println("$variavelEstatica, $nomeCompleto!")
}