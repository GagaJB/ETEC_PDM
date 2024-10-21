/*
    Aula 8: Exercício de reforço
    Métodos e funções
 */

/* 1. Escreva uma função que seja capaz de receber a quantidade de anos e tranformar em meses, dias, hras, minutos e segundos. Sída desejada:
    2 anos equivalem a:
        24 meses
        730 dias
        17520 horas
        1051200 minutos
        63072000 segundos
 */

// 2. Escreva uma função capaz de receber um string e retornar a quantidade de carcteres

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)

// 4. Escreva uma função capaz de receber uma medida em milhas e converter em km (1 milha = 1.6 km)

/* 5. Escreva um programa que seja capaz de receber uma string e fazer a troca todas as letras "a" ou "A" por "x". Observando que:
    a. Não deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras maiúsculas
    Exemplo: Entrada = "Programação em Kotlin" - Saída = "PROGRxMxÇxO EM KOTLIN"
 */

// 6. Sobre as funções criadas nos exercícios 2, 3 e 4, é possível transfomá-las em fuções de uma única linha? Se sim, trasforme-as.

fun main() {
    // Exemplo de uso das funções

    // Exercício 1
    val anos = 2
    converterAnos(anos)

    // Exercício 2
    val stringExemplo = "Literal"
    println("Quantidade de caracteres: ${contarCaracteres(stringExemplo)}")

    // Exercício 3
    val numero = 3
    println("Cubo de $numero: ${calcularCubo(numero)}")

    // Exercício 4
    val milhas = 10.0
    println("$milhas milhas equivalem a ${converterMilhasParaKm(milhas)} km")

    // Exercício 5
    val texto = "Programação em Kotlin"
    println("Resultado da troca: ${trocarLetraAporX(texto)}")
}

// Exercício 1: Converter anos em meses, dias, horas, minutos e segundos
fun converterAnos(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos anos equivalem a:")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

// Exercício 2: Contar a quantidade de caracteres de uma string
fun contarCaracteres(texto: String) = texto.length

// Exercício 3: Calcular o cubo de um número
fun calcularCubo(n: Int) = n * n * n

// Exercício 4: Converter milhas para quilômetros
fun converterMilhasParaKm(milhas: Double) = milhas * 1.6

// Exercício 5: Trocar letra "a" ou "A" por "x" e transformar em maiúsculas
fun trocarLetraAporX(texto: String) = texto.replace(Regex("[aA]"), "x").uppercase()