fun main() {
    // Aula 2: Variáveis e tipos de dado

    var x = "9" // tem valor texto (string)

    var y = 7   // tem valor numérico (inteiro)

    // Declarando variáveis de tipos primitivos com seus respectivos valores máximos
    val umByte: Byte = 127 // 1 byte ou 8 bits: -128 até 127
    val umShort: Short = 32767 // 2 bytes ou 16 bits: -32768 a 32767
    val umInt: Int = 2147483647 // 4 bytes ou 32 bits: -2147483648 a 2147483647
    val umLong: Long = 9223372036854775807 // 8 bytes ou 64 bits

    // Variáveis Float e Double
    val umFloat: Float = 3.14F // Necessário 'F' para indicar tipo Float
    val umDouble: Double = 3.14159265359

    // Imprimindo valores mínimos e máximos dos tipos primitivos
    println("Byte MIN ${Byte.MIN_VALUE} - MAX ${Byte.MAX_VALUE}")
    println("Short MIN ${Short.MIN_VALUE} - MAX ${Short.MAX_VALUE}")
    println("Int MIN ${Int.MIN_VALUE} - MAX ${Int.MAX_VALUE}")
    println("Long MIN ${Long.MIN_VALUE} - MAX ${Long.MAX_VALUE}")
    println("Float MIN ${Float.MIN_VALUE} - MAX ${Float.MAX_VALUE}")
    println("Double MIN ${Double.MIN_VALUE} - MAX ${Double.MAX_VALUE}")

    // Utilizando tipos unsigned (sem sinal)
    val umUByte: UByte = 255u // unsigned Byte
    val umUShort: UShort = 65535u // unsigned Short
    val umUInt: UInt = 4294967295u // unsigned Int
    val umULong: ULong = 18446744073709551615u // unsigned Long

    // Imprimindo valores mínimos e máximos dos tipos unsigned
    println("UByte MIN ${UByte.MIN_VALUE} - MAX ${UByte.MAX_VALUE}")
    println("UShort MIN ${UShort.MIN_VALUE} - MAX ${UShort.MAX_VALUE}")
    println("UInt MIN ${UInt.MIN_VALUE} - MAX ${UInt.MAX_VALUE}")
    println("ULong MIN ${ULong.MIN_VALUE} - MAX ${ULong.MAX_VALUE}")
}
