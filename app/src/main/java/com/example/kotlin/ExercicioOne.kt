package com.example.kotlin

fun main() {

    val listaCursos: MutableList<String> = mutableListOf(
            "Sistemas para dispositivos móveis",
            "Análise e Desenvolvimento de Sistemas"
    )

    listaCursos.add("Técnico em Informática para internet")
    listaCursos.add("Manutenção de Aeronave")
    listaCursos.add("Técnico em Céculas")
    listaCursos.add("Processos gerenciais")


    for(i in listaCursos){
        if(i.contains("Sistemas")){
            println(i)
        }
    }

    println("--------------------------------")

    listaCursos.forEach{
        if(it.contains("Sistemas")){
            println(it)
        }
    }

    var listResult = listaCursos.filter{x -> x.contains("Sistemas")}
    var listResultA = listaCursos.filter{it.contains("Sistemas")}

    listResult.withIndex().forEach{println("${it.index} - ${it.value}") }
    listResult.withIndex().forEach(::imprime)


    val imp = fun (i: IndexedValue<String>){
        println("${i.index} - ${i.value}")
    }

    listResult.withIndex().forEach(imp)
}
fun imprime(i: IndexedValue<String>){
    println("${i.index} - ${i.value}")
}