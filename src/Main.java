import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int main(String[] args) {
        Scanner objScan = new Scanner(System.in);

        /* ///////////////////////////////////////// EJERCICIOS FUNDAMENTOS DE PROGRAMACION EN JAVA ////////////////////////////////////////////// */

        /*////////// CALCULADORA BASICA //////////*/

        /*System.out.println("Ingresa el primer numero: ");
        Long numero1 = objScan.nextLong();

        System.out.println("Ingresa el segundo numero: ");
        Long numero2 = objScan.nextLong();

        Long Suma = numero1 + numero2;
        Long Resta = numero1 - numero2;
        Long Multiplicacion = numero1 * numero2;
        Long Division = numero1 / numero2;

        System.out.println("La suma del numero " + numero1 + " y el numero " + numero2 + " es igual a " + Suma);
        System.out.println("La resta del numero " + numero1 + " y el numero " + numero2 + " es igual a " + Resta);
        System.out.println("La multiplicacion del numero " + numero1 + " y el numero " + numero2 + " es igual a " + Multiplicacion);
        System.out.println("La division del numero " + numero1 + " y el numero " + numero2 + " es igual a " + Division);*/

        /*//////// VERIFICADOR DE EDAD /////////////*/

        /*System.out.println("Ingresa tu edad: ");
        Byte edad = objScan.nextByte();

        if (edad >= 18){
            System.out.println("Usted tiene " + edad + " años y es mayor de edad");
        }else {
            System.out.println("Usted tiene " + edad + " años y es menor de edad");
        }*/

        /*/////// CONVERSOR DE UNIDADES //////////////*/

        /*System.out.println("Ingrese los kilometros que desea convertir a millas: ");
        double kilometros = objScan.nextDouble();

        double TotalValue = kilometros * 0.621371;

        System.out.println(kilometros + " Kilometros en sistema de millas seria " + TotalValue);*/

        /* /////// CALCULADORA DE INDICE DE MASA CORPORAL (IMC) //////// */

        /*System.out.println("Ingrese su altura en sistema metrico: ");
        float altura = objScan.nextFloat();

        System.out.println("Ingrese su peso en kg: ");
        float peso = objScan.nextFloat();

        float operation = altura * altura;

        float IMC = peso/operation;

        System.out.println("Su indice de masa corporal es: " + IMC );*/

        /* /////// CLASIFICADOR DE NUMEROS //////// */

        /*System.out.println("Ingrese un numero: ");
        short numero = objScan.nextShort();

        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero == 0) {
            System.out.println("Numero Cero");
        }else {
            System.out.println("El numero " + numero + " es negativo");
        }*/

        /*//////// CALCULADORA DE DIAS DEL MES ///////*/

        /*System.out.println("Escribe uno de los meses del año (1-12): ");
        int mes = objScan.nextByte();

        switch (mes){
            case 1:
                System.out.println("---------------ENERO------------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("------------------01 02 03 04 05 06---------");
                System.out.println("---------------07 08 09 10 11 12 13---------");
                System.out.println("---------------14 15 16 17 18 19 20---------");
                System.out.println("---------------21 22 23 24 25 26 27---------");
                System.out.println("---------------28 29 30 31------------------");
                break;
            case 2:
                System.out.println("---------------FEBRERO----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("---------------------------01 02 03---------");
                System.out.println("---------------04 05 06 07 08 09 10---------");
                System.out.println("---------------11 12 13 14 15 16 17---------");
                System.out.println("---------------18 19 20 21 22 23 24---------");
                System.out.println("---------------25 26 27 28 29---------------");
                break;
            case 3:
                System.out.println("---------------MARZO----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA-------");
                System.out.println("------------------------------01 02-------");
                System.out.println("---------------03 04 05 06 07 08 09-------");
                System.out.println("---------------10 11 12 13 14 15 16-------");
                System.out.println("---------------17 18 19 20 21 22 23-------");
                System.out.println("---------------24 25 26 27 28 29----------");
                break;
            case 4:
                System.out.println("---------------ABRIL----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA-------");
                System.out.println("---------------------------------01-------");
                System.out.println("---------------02 03 04 05 06 07 08-------");
                System.out.println("---------------09 10 11 12 13 14 15-------");
                System.out.println("---------------16 17 18 19 20 21 22-------");
                System.out.println("---------------23 24 25 26 27 28 29-------");
                break;
            case 5:
                System.out.println("---------------MAYO----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA------");
                System.out.println("---------------01 02 03 04 05 06 07------");
                System.out.println("---------------08 09 10 11 12 13 14------");
                System.out.println("---------------15 16 17 18 19 20 21------");
                System.out.println("---------------22 23 24 25 26 27 28------");
                System.out.println("---------------29---------------");
                break;
            case 6:
                System.out.println("---------------JUNIO----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA-------");
                System.out.println("------------------01 02 03 04 05 06-------");
                System.out.println("---------------07 08 09 10 11 12 13-------");
                System.out.println("---------------14 15 16 17 18 19 20-------");
                System.out.println("---------------21 22 23 24 25 26 27-------");
                System.out.println("---------------28 29----------------------");
                break;
            case 7:
                System.out.println("---------------JULIO----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA-------");
                System.out.println("---------------------01 02 03 04 05-------");
                System.out.println("---------------06 07 08 09 10 11 12-------");
                System.out.println("---------------13 14 15 16 17 18 19-------");
                System.out.println("---------------20 21 22 23 24 25 26-------");
                System.out.println("---------------27 28 29-------------------");
                break;
            case 8:
                System.out.println("---------------AGOSTO-----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("---------------------------01 02 03---------");
                System.out.println("---------------04 05 06 07 08 09 10---------");
                System.out.println("---------------11 12 13 14 15 16 17---------");
                System.out.println("---------------18 19 20 21 22 23 24---------");
                System.out.println("---------------25 26 27 28 29---------------");
                break;
            case 9:
                System.out.println("---------------SEPTIEMBRE-------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("---------------------------01 02 03---------");
                System.out.println("---------------04 05 06 07 08 09 10---------");
                System.out.println("---------------11 12 13 14 15 16 17---------");
                System.out.println("---------------18 19 20 21 22 23 24---------");
                System.out.println("---------------25 26 27 28 29---------------");
                break;
            case 10:
                System.out.println("---------------OCTUBRE----------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("---------------------------01 02 03---------");
                System.out.println("---------------04 05 06 07 08 09 10---------");
                System.out.println("---------------11 12 13 14 15 16 17---------");
                System.out.println("---------------18 19 20 21 22 23 24---------");
                System.out.println("---------------25 26 27 28 29---------------");
                break;
            case 11:
                System.out.println("---------------NOVIEMBRE--------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("---------------------------01 02 03---------");
                System.out.println("---------------04 05 06 07 08 09 10---------");
                System.out.println("---------------11 12 13 14 15 16 17---------");
                System.out.println("---------------18 19 20 21 22 23 24---------");
                System.out.println("---------------25 26 27 28 29---------------");
                break;
            case 12:
                System.out.println("---------------DICIEMBRE--------------------");
                System.out.println("---------------DO LU MA MI JU VI SA---------");
                System.out.println("---------------------------01 02 03---------");
                System.out.println("---------------04 05 06 07 08 09 10---------");
                System.out.println("---------------11 12 13 14 15 16 17---------");
                System.out.println("---------------18 19 20 21 22 23 24---------");
                System.out.println("---------------25 26 27 28 29---------------");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }*/

        /*////////MENU INTERACTIVO///////////*/

        System.out.println("-------------------MENU INTERACTIVO-------------------");
        System.out.println("-------SELECCIONE UNA DE LAS SIGUIENTES OPCIONES------");
        System.out.println("-------1). SUMA---------------------------------------");
        System.out.println("-------2). RESTA--------------------------------------");
        System.out.println("-------3). MULTIPLICACION-----------------------------");
        System.out.println("-------4). DIVISION-----------------------------------");
        int opcion = objScan.nextByte();

        switch (opcion){
            case 1:
                System.out.println("Ingrese un numero: ");
                int num1 = objScan.nextInt();

                System.out.println("Ingrese otro numero: ");
                int num2 = objScan.nextInt();

                int totalSum = num1 + num2;

                System.out.println("El resultado de la suma es: " + totalSum);

                System.out.println("1). Sumar resultado 2). Volver al menu 0). Fin");
                int opcAlt = objScan.nextInt();
                int opcALt = 0;

                while (opcAlt < 1) {
                    System.out.println("Ingrese siguiente numero a sumar: ");
                    int opcAlt1 = objScan.nextInt();

                    int totalAlt = totalSum + opcAlt1;

                    System.out.println("El resultado de la suma es: " + totalAlt);
                }
        }
    }
}