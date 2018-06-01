/*
 * Adrian Camilo Osorio Achipiz
 * Programa 04
 * 23/04/2018
 * Correlacion
 * Programa que permite calcular el rango de tamaños.
 */

//Importamos las librerias necesarias para el programa
package calcularrangotamaños;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author adrianosorio
 */
public class CalcularRangoTamaños {
    //Declaramos las variables
    static int numero = 0;       
    static double varianza;
    static double desviacion;
    static double promedio;
    static double sumaLn;
    static double totalLn = 0;
    static double lnVs;
    static double lnS;
    static double lnM;
    static double lnL;
    static double lnVl;
    static double rangoVs = 0;
    static double rangoS = 0;
    static double rangoM = 0;
    static double rangoL = 0;
    static double rangoVl = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while (!salir) {
            System.out.println("1. Tabla 1. LOC / Datos Método");
            System.out.println("2. Tabla 2. Páginas por capítulo");
            System.out.println("3. Salir");
 
                /* Variables que utilizaremos para calcular las opereaciones secundarias */
                double ln1 = 0, ln2 = 0, ln3 = 0, ln4 = 0, ln5 = 0, ln6 = 0, ln7 = 0, ln8 = 0, ln9 = 0,ln10 = 0, ln11 = 0, ln12 = 0, ln13 = 0, ln14, ln15, ln16;
                double promLn1 = 0, promLn2 = 0, promLn3 = 0, promLn4 = 0, promLn5 = 0, promLn6 = 0, promLn7 = 0, promLn8 = 0, promLn9 = 0,promLn10 = 0, promLn11 = 0, promLn12 = 0, promLn13 = 0, promLn14, promLn15, promLn16;
                float prom1 = 0, prom2 = 0, prom3 = 0, prom4 = 0, prom5 = 0, prom6 = 0, prom7 = 0, prom8 = 0, prom9 = 0,prom10 = 0, prom11 = 0, prom12 = 0,prom13 = 0;
                System.out.println("Digite una de las opciones");
                opcion = sn.nextInt();
                
                switch (opcion) {
                    /* Opcion 1 donde ingresaremos los LOC/Métodos y calcularemos los rangos de tamaño */
                    case 1:
                        System.out.println("LOC / Datos Método");
                        Scanner num= new Scanner(System.in);
                        System.out.println("================================"); 
                        
                        int[]numeros =new int[13];
                        int[]numeros3 =new int[13];
                          /* For para ingresar los valores de Loc */ 
                          for (int i = 0; i < numeros.length; i++) {
                            
                            System.out.println("Ingrese los numero de CLASS LOC");
                            numeros[i]=num.nextInt();
                            
                           }  
                           System.out.println("=================================");  
                            /* For para ingresar los valores de Métodos */ 
                           for (int i = 0; i < numeros3.length; i++) {
                             
                            System.out.println("Ingrese los numero de Metodos");
                            numeros3[i]=num.nextInt();
                       
                           } 
                          /* For para calcular las operaciones basicas y principales */ 
                          for (int i = 0; i < numeros.length; i++) {
                             
                            /* Calcular el promedio de cada 1 de los numeros en el array */  
                            prom1=(float)numeros[0]/numeros3[0];  
                            prom2=(float)numeros[1]/numeros3[1]; 
                            prom3=(float)numeros[2]/numeros3[2]; 
                            prom4=(float)numeros[3]/numeros3[3]; 
                            prom5=(float)numeros[4]/numeros3[4]; 
                            prom6=(float)numeros[5]/numeros3[5];
                            prom7=(float)numeros[6]/numeros3[6]; 
                            prom8=(float)numeros[7]/numeros3[7]; 
                            prom9=(float)numeros[8]/numeros3[8]; 
                            prom10=(float)numeros[9]/numeros3[9]; 
                            prom11=(float)numeros[10]/numeros3[10]; 
                            prom12=(float)numeros[11]/numeros3[11]; 
                            prom13=(float)numeros[12]/numeros3[12]; 
                            
                            /* Calcular el Logaritmo natural de los promedios de cada numero en el array */
                            ln1=Math.log(prom1);
                            ln2=Math.log(prom2);
                            ln3=Math.log(prom3);
                            ln4=Math.log(prom4);
                            ln5=Math.log(prom5);
                            ln6=Math.log(prom6);
                            ln7=Math.log(prom7);
                            ln8=Math.log(prom8);
                            ln9=Math.log(prom9);
                            ln10=Math.log(prom10);
                            ln11=Math.log(prom11);
                            ln12=Math.log(prom12);
                            ln13=Math.log(prom13);
                          
                            /* Calcular la sumatoria de los logaritmo natural de cada array, y el promedio*/  
                            totalLn=ln1+ln2+ln3+ln4+ln5+ln6+ln7+ln8+ln9+ln10+ln11+ln12+ln13;
                            promedio=totalLn/numeros.length;
                            
                            /* Calcular cada numero la potencia de su logoritmo */
                            promLn1=Math.pow(ln1-promedio, 2);
                            promLn2=Math.pow(ln2-promedio, 2);
                            promLn3=Math.pow(ln3-promedio, 2);
                            promLn4=Math.pow(ln4-promedio, 2);
                            promLn5=Math.pow(ln5-promedio, 2);
                            promLn6=Math.pow(ln6-promedio, 2);
                            promLn7=Math.pow(ln7-promedio, 2);
                            promLn8=Math.pow(ln8-promedio, 2);
                            promLn9=Math.pow(ln9-promedio, 2);
                            promLn10=Math.pow(ln10-promedio, 2);
                            promLn11=Math.pow(ln11-promedio, 2);
                            promLn12=Math.pow(ln12-promedio, 2);
                            promLn13=Math.pow(ln13-promedio, 2);
                            
                            sumaLn=promLn1+promLn2+promLn3+promLn4+promLn5+promLn6+promLn7+promLn8+promLn9+promLn10+
                                    promLn11+promLn12+promLn13;
                       
                           } 
                           
                           /* Calcular las operaciones principales */
                           varianza=sumaLn/(numeros.length-1);
                           desviacion=Math.sqrt(varianza);
                            
                            lnVs=promedio-(2*desviacion);
                            lnS=promedio-desviacion;
                            lnM=promedio;
                            lnL=promedio+desviacion;
                            lnVl=promedio+(2*desviacion);
                            
                            rangoVs=Math.exp(lnVs);
                            rangoS=Math.exp(lnS);
                            rangoM=Math.exp(lnM);
                            rangoL=Math.exp(lnL);
                            rangoVl=Math.exp(lnVl);
                          
                          System.out.println("================================");
                          System.out.println("VS "+rangoVs);
                          System.out.println("S "+rangoS);
                          System.out.println("M "+rangoM);
                          System.out.println("L "+rangoL);
                          System.out.println("VL "+rangoVl);
                          
                        
                        break;
                    case 2:
                        /* Opcion 1 donde ingresaremos las pagina por capitulos y calcularemos los rangos de tamaño */
                        System.out.println("Página por capitulo");
                        Scanner num2= new Scanner(System.in);
                        
                        System.out.println("================================");
                        int[]numeros2 =new int[16];

                          for (int i = 0; i < numeros2.length; i++) {
                            
                            System.out.println("Ingrese el numero");
                            numeros2[i]=num2.nextInt();
                           }  
                          
                          /* Calcular el Logaritmo natural de cada numero en el array */
                          for (int i = 0; i < numeros2.length; i++) {
                            ln1=Math.log(numeros2[0]);
                            ln2=Math.log(numeros2[1]);
                            ln3=Math.log(numeros2[2]);
                            ln4=Math.log(numeros2[3]);
                            ln5=Math.log(numeros2[4]);
                            ln6=Math.log(numeros2[5]);
                            ln7=Math.log(numeros2[6]);
                            ln8=Math.log(numeros2[7]);
                            ln9=Math.log(numeros2[8]);
                            ln10=Math.log(numeros2[9]);
                            ln11=Math.log(numeros2[10]);
                            ln12=Math.log(numeros2[11]);
                            ln13=Math.log(numeros2[12]);
                            ln14=Math.log(numeros2[13]);
                            ln15=Math.log(numeros2[14]);
                            ln16=Math.log(numeros2[15]);
                            
                            
                            totalLn=ln1+ln2+ln3+ln4+ln5+ln6+ln7+ln8+ln9+ln10+ln11+ln12+ln13+ln14+ln15+ln16;
                            promedio=totalLn/numeros2.length;
                            
                            promLn1=Math.pow(ln1-promedio, 2);
                            promLn2=Math.pow(ln2-promedio, 2);
                            promLn3=Math.pow(ln3-promedio, 2);
                            promLn4=Math.pow(ln4-promedio, 2);
                            promLn5=Math.pow(ln5-promedio, 2);
                            promLn6=Math.pow(ln6-promedio, 2);
                            promLn7=Math.pow(ln7-promedio, 2);
                            promLn8=Math.pow(ln8-promedio, 2);
                            promLn9=Math.pow(ln9-promedio, 2);
                            promLn10=Math.pow(ln10-promedio, 2);
                            promLn11=Math.pow(ln11-promedio, 2);
                            promLn12=Math.pow(ln12-promedio, 2);
                            promLn13=Math.pow(ln13-promedio, 2);
                            promLn14=Math.pow(ln14-promedio, 2);
                            promLn15=Math.pow(ln15-promedio, 2);
                            promLn16=Math.pow(ln16-promedio, 2);
                            
                            sumaLn=promLn1+promLn2+promLn3+promLn4+promLn5+promLn6+promLn7+promLn8+promLn9+promLn10+
                                    promLn11+promLn12+promLn13+promLn14+promLn15+promLn16;
                            
                            varianza=sumaLn/(numeros2.length-1);
                           
                            desviacion=Math.sqrt(varianza);
                            
                            lnVs=promedio-(2*desviacion);
                            lnS=promedio-desviacion;
                            lnM=promedio;
                            lnL=promedio+desviacion;
                            lnVl=promedio+(2*desviacion);
                            
                            rangoVs=Math.exp(lnVs);
                            rangoS=Math.exp(lnS);
                            rangoM=Math.exp(lnM);
                            rangoL=Math.exp(lnL);
                            rangoVl=Math.exp(lnVl);
                           } 
                        
                          System.out.println("================================");
                          System.out.println("VS "+rangoVs);
                          System.out.println("S "+rangoS);
                          System.out.println("M "+rangoM);
                          System.out.println("L "+rangoL);
                          System.out.println("VL "+rangoVl);
                          
                          
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("================================");
                        System.out.println("Solo números entre 1 y 3");
                }
                
            }
    }
    
}
