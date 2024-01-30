class Persona() {
    //Estructura, coneguda com a propietats o atributs

    var dni: String = ""
    var nom: String = ""
    var cognoms: String = ""
    var edat: Int = 0
    private var estatCivil: Boolean = false

    constructor (nom: String, cognoms: String):this() {
        this.nom = nom
        this.cognoms = cognoms
    }

    constructor(dni: String, nom: String, cognoms: String, edat: Int, estatCivil: Boolean):this() {
        this.dni = dni
        this.edat = edat
        this.estatCivil = estatCivil
    }

    fun aniversari() {
        edat++
    }

    fun casament() {
        estatCivil = true
    }

    fun divorci() {
        estatCivil = false
    }

    override fun toString(): String {
        return super.toString()
    }

}