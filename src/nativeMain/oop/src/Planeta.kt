class Planeta(var nome: String) {
    private val id: Int = 0
    private var massa: Double = 0.0
    private var raio: Double = 0.0

    constructor(nome: String, massa: Double, raio: Double) : this(nome) {
        this.massa = massa
        this.raio = raio
    }

    fun getMassa(): Double {
        return massa
    }

    fun setMassa(massa: Double) {
        this.massa = massa
    }

    fun getRaio(): Double {
        return raio
    }

    fun setRaio(raio: Double) {
        this.raio = raio
    }
}