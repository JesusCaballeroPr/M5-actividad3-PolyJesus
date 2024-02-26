package org.example.controllers

import models.Calculadora
import java.util.Scanner
import models.Divisora
import models.Figura
import java.io.IOException

val scan=Scanner(System.`in`)
fun main() {
 println("Ejercicio 1")
 ej1()
 println()
 println()
 println("Ejercicio 2")
 ej2()
 println("Ejercicio 3")
ejercicio3()

}
fun ej1(){
 var numeros:Divisora=Divisora()
 var num1:Int=0
 var num2:Int=0
 var error:Boolean=false
 try {
  println("Introduzca dos numeros para dividirlos")
  num1 = Integer.parseInt(scan.next())
  num2 = Integer.parseInt(scan.next())
  println(numeros.dividir(num1,num2))
 }catch (e:NumberFormatException){
  println("Una palabra no es un número, prueba otra vez tio listo ^_^")
  error=true
 }catch (e:ArithmeticException){
  println("No es posible dividir entre 0, tontito :D")
  error=true
 }
 finally {
  if (error) {
   num1 = 0
   num2 = 0
   println("Ha ocurrido un error. Valores reestablecidos a 0")
  }
 }
}
fun ej2(){
 var salir:Boolean=false
 var error:Boolean=true
 var numero1:Int=0
 var numero2:Int=0
 var operacion:Char=' '
 var calculadoraSuma: Calculadora = Calculadora('+')
 var calculadoraResta: Calculadora = Calculadora('-')
 var calculadoraMultiplicacion: Calculadora = Calculadora('*')
 var calculadoraDivision: Calculadora = Calculadora('/')
 do{
  println(
   "Introduce la operación que quiera realizar: \n" +
           "Para sumar: +\n" +
           "Para restasr: -\n" +
           "Para multiplicar: *\n" +
           "Para dividir: /\n" +
           "Si desea salir, escriba 'Z'"
  )
  try {
   operacion = readln().first()

  } catch (e: IOException) {
   println("No es una operación/opción válida")
   error=false
  }

  if (operacion!='Z'){
   println("Introduzca el primer valor numérico")

   try {
    numero1 = scan.nextInt()
   } catch (e: NumberFormatException) {
    println("Una palabra no es un número, prueba otra vez tio listo ^_^")
    error = false
   } catch (e: Exception) {
    println("Una palabra no es un número, prueba otra vez tio listo ^_^")
    error = false
   }

   scan.nextLine()

   println("Introduzca el segundo valor numérico")

   try {
    numero2 = scan.nextInt()
   } catch (e: NumberFormatException) {
    println("Una palabra no es un número, prueba otra vez tio listo ^_^")
    error = false
   } catch (e: Exception) {
    println("Una palabra no es un número, prueba otra vez tio listo ^_^")
    error = false
   }

   scan.nextLine()

   if (error) {
    when (operacion) {
     '+' -> println(calculadoraSuma.operacion09(numero1, numero2))
     '-' -> println(calculadoraResta.operacion09(numero1, numero2))
     '*' -> println(calculadoraMultiplicacion.operacion09(numero1, numero2))
     '/' -> println(calculadoraDivision.operacion09(numero1, numero2))
     'Z' -> salir = true

    }
   }
  }else salir=true

  }while (!salir)


 println("""Deu \(^_^)/""")
}

fun ejercicio3 (){
  try {
   val figura: Figura = Figura(4, 5, 6, 7, 8)
   println("El perímetro de la figura es: ${figura.perimetre()}")
  } catch (e: IllegalArgumentException) {
   println(e.message)
  }
 }
