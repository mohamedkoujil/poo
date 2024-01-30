fun main() {
    var p1: Persona = Persona()
    p1.dni = "12345678A"
    p1.nom = "Pep"
    p1.cognoms = "Garcia"
    for (i in 1..25) {
        p1.aniversari()
    }
    p1.casament()
    println("${p1.nom} ${p1.cognoms} té ${p1.edat} anys ")
}