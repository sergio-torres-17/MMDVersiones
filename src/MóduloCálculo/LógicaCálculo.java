/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MóduloCálculo;

import MóduloCálculo.Objetos.ColecciónPseudoAleatorios;
import MóduloCálculo.Objetos.Parámetros;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author SERGIO
 */
public class LógicaCálculo {

    private ArrayList<ColecciónPseudoAleatorios> listaCantidades;
    private Parámetros parámetroPrincipal;

    public Parámetros getParámetroPrincipal() {
        return parámetroPrincipal;
    }

    public void setParámetroPrincipal(Parámetros parámetroPrincipal) {
        this.parámetroPrincipal = parámetroPrincipal;
    }



    public ArrayList<ColecciónPseudoAleatorios> getListaCantidades() {
        return listaCantidades;
    }

    public void setListaCantidades(ArrayList<ColecciónPseudoAleatorios> listaCantidades) {
        this.listaCantidades = listaCantidades;
    }

    //Funciones calculadoras
    public void calculaParámetros(int númerosSolicitados) {
        parámetroPrincipal = new Parámetros();
        double e;
        e = 1 - (Math.pow(10, -6));

        if (númerosSolicitados < 500) {
            parámetroPrincipal.setD(4);
        } else {
            parámetroPrincipal.setD(Integer.parseInt(String.valueOf((1 + Math.log10(2 * númerosSolicitados) / Math.log10(10) + e))));
            System.out.println("Parametro");
        }
        int h = (int) (5*Math.pow(10,(parámetroPrincipal.getD()-2)));
        parámetroPrincipal.setH(h);
        parámetroPrincipal.setM((int)Math.pow(10,parámetroPrincipal.getD()));
        parámetroPrincipal.setA(raízPrimitiva(númerosSolicitados));
        parámetroPrincipal.setC(0);
        parámetroPrincipal.setN0(númerosSolicitados);
        
        while ((this.parámetroPrincipal.getN0() % 5) == 0) {
            this.parámetroPrincipal.setN0(this.imparAleatorio(númerosSolicitados));
        }
        

        System.out.println("Parametros hechos");
    }

    public ArrayList<ColecciónPseudoAleatorios> numerosAleatorios(int númerosSolicitados) {
        ArrayList<ColecciónPseudoAleatorios> dev;
        ColecciónPseudoAleatorios nuevoNum, numGen, numAnterior;
        float xi, ni;
        dev = new ArrayList<>();

        nuevoNum = new ColecciónPseudoAleatorios();
        nuevoNum.setNi(this.imparAleatorio(númerosSolicitados));

        
        nuevoNum.setI(0);
        nuevoNum.setXi(nuevoNum.getNi() / númerosSolicitados);

        this.parámetroPrincipal.setN0((int) nuevoNum.getNi());
        if(nuevoNum!=null){
            dev.add(nuevoNum);
        }
        ni = this.redondear(nuevoNum.getNi());
        numGen = new ColecciónPseudoAleatorios();
        numGen.setNi((int)numeroAleatorio(0,this.parámetroPrincipal.getN0()));
        //Creacion de numeros aleatorios
        for (int i = 0; i <= númerosSolicitados; i++) {
            xi = (float)redondear((nuevoNum.getNi() / númerosSolicitados));
            numGen.setI(i);
            numGen.setXi(redondear(this.numeroAleatorio(0.0001f, 1f)));
            numAnterior = (ColecciónPseudoAleatorios)numGen.clone();
            ni = (float) numGen.getNi();
            numGen = new ColecciónPseudoAleatorios();
            dev.add(numGen);
            numGen.setNi((int)numeroAleatorio(0,this.parámetroPrincipal.getN0()));
            //numGen.setNi((this.parámetroPrincipal.getA() * ni + this.parámetroPrincipal.getC()) % númerosSolicitados);
        }
        return dev;
    }


    private float numeroAleatorio(float inicioIntervalo, float finIntervalo) {
        return (float) Math.random() * finIntervalo + inicioIntervalo;
    }

    private int imparAleatorio(int m) {
        int aleatorio = (int)((numeroAleatorio(1, m - 1))%m);
        System.out.println("Ciclo "+aleatorio);
        return (2 * (int) aleatorio);
    }
   private float redondear(float numero){
         BigDecimal bd = new BigDecimal(numero).setScale(4, RoundingMode.HALF_UP);
        float val2 = (float)bd.doubleValue();
        return val2;
   }
   private float redondear(float numero, int cantDec){
         BigDecimal bd = new BigDecimal(numero).setScale(cantDec, RoundingMode.HALF_UP);
        float val2 = (float)bd.doubleValue();
        return val2;
   }
   
    private int raízPrimitiva(int m) {
        int k, t, aleatorio;
        int[] clasesEquivalencia = new int[16];
        clasesEquivalencia[0] = 3;
        clasesEquivalencia[1] = 11;
        clasesEquivalencia[2] = 13;
        clasesEquivalencia[3] = 19;
        clasesEquivalencia[4] = 21;
        clasesEquivalencia[5] = 27;
        clasesEquivalencia[6] = 29;
        clasesEquivalencia[7] = 37;
        clasesEquivalencia[8] = 53;
        clasesEquivalencia[9] = 59;
        clasesEquivalencia[10] = 61;
        clasesEquivalencia[11] = 67;
        clasesEquivalencia[12] = 69;
        clasesEquivalencia[13] = 77;
        clasesEquivalencia[14] = 83;
        clasesEquivalencia[15] = 91;
        k = (int) (numeroAleatorio(0, 15));
        t = (int) (numeroAleatorio(0, m));
        if (numeroAleatorio(0, 15) < 0.5) {
            System.out.println("Clases equivalencia "+k);
            return (200 * t - clasesEquivalencia[k]);
        } else {
            System.out.println("Clases equivalencia "+k);
            return (200 * t + clasesEquivalencia[k]);
        }
    }
   
}
