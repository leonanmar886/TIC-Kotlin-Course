class Planeta(var nome: String) {
    private val id: Int = 0
        get(){
            return field
        }
    private var massa: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    private var raio: Double = 0.0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(nome: String, massa: Double, raio: Double) : this(nome) {
        this.massa = massa
        this.raio = raio
    }
}