package com.example.kotlin

fun main() {
    var nome: String

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?:"Teste"

    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    try {
        println(sobrenome!!.capitalize())
        println(sobrenome!!.length)
    }catch(kne: KotlinNullPointerException){

    }


}