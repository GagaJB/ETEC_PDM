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
    recebeAnos(15)
    recebePalavra("literal")
    retornaCubo(4)
    milhasParaKm(8f)
    recebeStringParaConverter("O céu estava limpo, e a brisa suave trazia consigo o cheiro fresco da manhã.")
}

// exercicio 1
fun recebeAnos(ano: Int) {
    println("$ano anos equivalem a:")
    println("${ano * 12} meses")
    println("${ano * 365} dias")
    println("${ano * 8760} horas")
    println("${ano * 525600} minutos")
    println("${ano * 31536000} segundos")
}

// exercicio 2
fun recebePalavra(palavra: String) {
    println("A palavra '$palavra' tem ${palavra.length} caracteres")
}

// exercicio 3
fun retornaCubo(numero: Int) {
    println("$numero elevado ao cubo equivale a ${numero * numero * numero}")
}

// exercicio 4
fun milhasParaKm(milhas: Float) {
    val conversao = milhas * 1.6f
    println("$milhas milhas equivalem a $conversao km")
}

// exercicio 5
fun recebeStringParaConverter(textoParaConverter: String) {
    val textoFinal = textoParaConverter.uppercase().replace("A", "X")
    println(textoFinal)
}

// exercicio 6
fun funcaoExercicio2(palavra2: String) = println("Contagem de letras na palavra '${palavra2}': ${palavra2.count()}")
fun funcaoExercicio3(numero2: Int) = println("O cubo de $numero2 é ${numero2.toDouble().pow(3).toInt()}")
fun funcaoExercicio4(milhas2: Float) = println("Convertendo $milhas2 milhas: ${String.format("%.2f", milhas2 * 1.6)} km")