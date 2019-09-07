package com.example.kotlin


fun main() {

    val familiaMap: MutableMap<String, String> = mutableMapOf(
            Pair("Pai", "Pedro"),
            Pair("Mãe", "Marcela"),
            Pair("Filho", "João"),
            Pair("Caçula", "Cadu"),
            Pair("Pet", "Paçoca")
    )

    familiaMap.forEach{println("${it.key}: ${it.value}") }

    familiaMap.keys.forEach{println("${it}: ${familiaMap.get(it)}") }

    fun percorreMap(par: Map.Entry<String, String>){
        println("${par.key}: ${par.value}")
    }
    familiaMap.forEach(::percorreMap)

    val percorreMaps = fun (k: String, v: String){
        println("$k - $v")
    }

    //familiaMap.forEach(::percorreMaps)
    //api 24
    //familiaMap.forEach{t, u -> print("$t - $u")}
}





