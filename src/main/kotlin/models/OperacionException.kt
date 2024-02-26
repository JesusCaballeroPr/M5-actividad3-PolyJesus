package models

class OperacionException:Exception {
    constructor():this("Simbolo incorrecto"){}
    constructor(mensaje:String):super(mensaje){}
}