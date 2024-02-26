package models

class Figura {
    private var numeroLados:Int=0
    private var lados:IntArray
    constructor(numeroLados: Int, vararg lados: Int){
        this.numeroLados=numeroLados
        this.lados=lados
        if (numeroLados < 3 || numeroLados != lados.size) {
            throw IllegalArgumentException("El número de costados debe ser al menos 3 y debe coincidir con el número de longitudes proporcionadas.")
        }

    }
    fun perimetre(): Int {
        return lados.sum()
    }
}