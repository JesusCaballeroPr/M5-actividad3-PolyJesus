package models

import utilities.readChar
import java.io.IOException
import  java.util.Scanner
class Calculadora {
    private var operacion:Operacion= Operacion.Z

    constructor(operacion: Char){
        this.operacion=owu(operacion)
    }
    private fun owu(operacion:Char):Operacion{
        when (operacion){
            '+'->return Operacion.SUMA
            '-'->return Operacion.RESTA
            '*'->return Operacion.MULTIPLICACION
            '/'->return Operacion.DIVISION
            'Z'->return Operacion.Z
            else->return Operacion.z
        }
    }
    fun operacion09(num1: Int, num2: Int):Float{
        when(this.operacion){
            Operacion.RESTA->return num1-num2.toFloat()
            Operacion.SUMA->return num1+num2.toFloat()
            Operacion.MULTIPLICACION->return num1*num2.toFloat()
            Operacion.DIVISION->return num1/num2.toFloat()
            else-> return 0f
        }
    }

}