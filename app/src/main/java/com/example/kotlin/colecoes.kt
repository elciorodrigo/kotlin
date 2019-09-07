package com.example.kotlin

fun main() {
    // list (imutavel) // mutablelist (mutavel)
    var names: List<String> = listOf("jose", "maria", "joao")
    //names.add("teste") imutavel

    //referencia da lista é imutavel mas a variavel não
    names = listOf("a")

    // for
    for (n in names){
        println(n)
    }

    //list de inteiros
    val listaInteiros: List<Int> = listOf(1,2,3)
    val listaInt: List<Int> = (1..3).toList()

    val listaIntTeste: List<Int> = (1..10 step 2).toList()

    for(i in 0..2){
        println(listaInteiros[i])
    }

    for(i in 0..listaInteiros.size - 1){
        println(listaInteiros[i])
    }

    for(i in listaIntTeste){
        println(i)
    }

    listaIntTeste.forEach { println(it) }
    var aList : ArrayList<String> = ArrayList()

    //lista mutável
    val listaCursos: MutableList<String> = mutableListOf("Ads", "sdm")

    listaCursos.add("tii")
    listaCursos.add("tii")

    listaCursos.forEach{ println(it) }

    //set e mutable
    val setCursos: MutableSet<String> = mutableSetOf("ads", "sdm")

    //map e mutableMap
    val nomesMap: MutableMap<String, String> = mutableMapOf(
            Pair("Pai", "Jose"),
            Pair("mae", "maria")
            )

    nomesMap.put("filho", "joao")

}