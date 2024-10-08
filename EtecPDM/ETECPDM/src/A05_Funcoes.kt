// Aula 5: Funções

fun main(){
    println("println() é uma função utilitária e main() é uma função")

    bomDia()
    bomDia()
    bomDia()
    bomDia2()

    hello("Mallado")

    var resultado = soma(7, 9)
    println(resultado)

    println(subtracao(10.0, 9))

    println(divisao(resultado, 2.0))

    mensagem("Parisotto")
    mensagem("Edson","Parisotto")
    mensagem("Edson", 61)
    mensagem(61, "Parisotto")
}

fun bomDia(){
    println("Bom dia!")
}

fun bomDia2() = println("Bom dia 2!")

fun hello(nome: String){
    println("Olá, $nome")
}

fun hello2(nome: String) = println("Olá, $nome")

fun soma(a: Int, b: Int):Int {
    var resultado = a + b
    return resultado
}

fun soma2(a: Int, b: Int) = a + b

fun subtracao(a: Double, b: Int = 3) = a - b //lançando o 3 fala que o int é opcional, pq se não for dado vai ser 3

fun divisao(a: Int, b: Double) = (a / b)

fun mensagem(sobrenome: String) = println("Seu sobrenome é $sobrenome")
fun mensagem(nome: String, sobrenome: String) = println("Bem-vindo $nome $sobrenome")
fun mensagem(nome: String, idade: Int) = println("Como vai $nome, você tem $idade anos?")
fun mensagem(idade: Int, sobrenome: String) = println("Você tem $idade, $sobrenome")