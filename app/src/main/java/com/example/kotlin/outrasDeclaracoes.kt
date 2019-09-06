package com.example.kotlin

fun main() {
    //string explicito
    var nome : String = "José"

    //string implicito
    var sobrenome = "teste"

    // Inicialização tardia
    var nomeMeio: String // especificação de tipo obrigatório quando não inicializado
    nomeMeio = "Teste"

    // float
    val altura: Float = 1.74f

    //int
    var idade: Int = 36

    //casting (tudo em kotlin é objeto)
    var peso: Double = 70.toDouble() // 70.0

    println("Nome: ${nome} $nomeMeio $sobrenome \nAltura: $altura \nIdade: ${idade}")
}