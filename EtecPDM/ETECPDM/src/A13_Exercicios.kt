fun main() {
    quadradoOuRetangulo()
    triangulo()
}

// 1. Escreva uma rotina capaz de ler dois números inteiros maiores que zero que representam os lados de uma figura geométrica quadrada ou retangular. Informar se é um quadrado ou retangulo.
fun quadradoOuRetangulo() {
    println("Digite o valor do primeiro lado (maior que zero):")
    val lado1 = readln().toInt()

    println("Digite o valor do segundo lado (maior que zero):")
    val lado2 = readln().toInt()

    if (lado1 <= 0 || lado2 <= 0) {
        println("Os valores devem ser maiores que zero.")
    } else {
        if (lado1 == lado2) {
            println("É um quadrado.")
        } else {
            println("É um retângulo.")
        }
    }
}

// 2. Escreva uma função capaz de ler três números inteiros maiores que zero que representam os lados de um triângulo. Informar se é um triângulo equilátero (todos os lados iguais), isósceles (apenas dois lados são iguais) ou escaleno (os trÊs lados são diferentes.

fun triangulo() {
    println("Digite o valor do primeiro lado do triângulo (maior que zero):")
    val lado1 = readln().toInt()

    println("Digite o valor do segundo lado do triângulo (maior que zero):")
    val lado2 = readln().toInt()

    println("Digite o valor do terceiro lado do triângulo (maior que zero):")
    val lado3 = readln().toInt()

    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
        println("Todos os lados devem ser maiores que zero.")
    } else {
        if (lado1 == lado2 && lado2 == lado3) {
            println("É um triângulo equilátero.")
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            println("É um triângulo isósceles.")
        } else {
            println("É um triângulo escaleno.")
        }
    }
}