//Aula 15: Controle de Fluxo: Laço de Repetição "while()"

fun main() {
    var i =0
    /*
        while (true) {
            print("$i ")
            i++
            if(i == 10) break
        }
        println()

        while(i >= -5){
            print("$i ")
            i--
        }
        println()

        i = 0
        while (true){
            print("Tecle ENTER para continuar ou 0 (zero) para encerrar o app: ")
            var resposta = readln()
            if(resposta == "0") {
                println("Ok, estamos terminando...")
                break
            }
            println("Tudo bem, vamos continuar: ${++i}")
        }
        println()
    */
    val str = "Kotlin"
    var contador = 0
    while (contador < str.length) {
        print("${str[contador]}")
        contador++
    }
    println()

    contador = str.length - 1
    while(contador >= 0) {
        print("${str[contador]}")
        contador--
    }
}

//A - Escreva um código, usando "while( )" ou "do while( )", capaz de receber um texto e imprimi-lo invertido
//          Exemplo de entrada: Meu nome é Asdrúbal
//          Exemplo de saída esperada: labúrdsA é emon ueM

//B -  Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres "x" e "o" e retorna true ou false. Caso não exista nem "x" nem "o", retornar false. Use "while( )" ou "do while( )"

// Exercicio A
fun main() {
    print("Digite um texto: ")
    val texto = readln()

    var i = texto.length - 1
    while (i >= 0) {
        print(texto[i])
        i--
    }
    println() // Para pular a linha após imprimir o texto invertido
}

// Exercicio B

fun main() {
    print("Digite uma string: ")
    val texto = readln()

    val resultado = verificaQuantidadeXEO(texto)
    println("Existem a mesma quantidade de 'x' e 'o'? $resultado")
}

fun verificaQuantidadeXEO(str: String): Boolean {
    var contadorX = 0
    var contadorO = 0
    var i = 0

    while (i < str.length) {
        when (str[i]) {
            'x' -> contadorX++
            'o' -> contadorO++
        }
        i++
    }

    // Retorna true se a quantidade de 'x' e 'o' é igual e se pelo menos um dos dois caracteres existe.
    return (contadorX == contadorO) && (contadorX > 0 || contadorO > 0)
}

