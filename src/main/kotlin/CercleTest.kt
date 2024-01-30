fun main () {
    var cercle: Cercle = Cercle()
    do {
        var eleccioUsr = menu()
        when(eleccioUsr) {
            1 -> cercle = crearCercle()
            2 -> cercle = crearCercleRadi()
            3 -> mostrarUltimCercle(cercle)
            4 -> mostrarPerimetreUltimCercle(cercle)
            5 -> mostrarAreaUltimCercle(cercle)
        }
    } while (eleccioUsr != 6)


}

fun menu(): Int {
    var menu = readInt("1.- Crear un cercle d'un radi determinat i d'un color determinat\n" +
            "2.- Crear un cercle d'un radi determinat\n" +
            "3.- Mostrar últim cercle creat\n" +
            "4.- Mostrar perímetre últim cercle creat\n" +
            "5.- Mostrar àrea últim cercle creat\n" +
            "6.- Sortir",
            "Introdueixi un número",
            "Introdueixi una opció vàlida",
            1,6)

    return menu

}

fun crearCercle(): Cercle {
    var radi = readFloat("Introdueix el radi del cercle",
            "Introdueix un número",
            "Introdueix un número vàlid",
            0.0f, 100.0f)
    var color = readSentence("Introdueix el color del cercle",
            "Introdueix un color")

    return Cercle(radi, color)
}

fun crearCercleRadi(): Cercle {
    var radi = readFloat("Introdueix el radi del cercle",
            "Introdueix un número",
            "Introdueix un número vàlid",
            0.0f, 100.0f)

    return Cercle(radi)
}

fun mostrarUltimCercle(cercle: Cercle) {
    println(cercle.toString())
}

fun mostrarPerimetreUltimCercle(cercle: Cercle) {
    println(cercle.perimetre())
}

fun mostrarAreaUltimCercle(cercle: Cercle) {
    println(cercle.area())
}