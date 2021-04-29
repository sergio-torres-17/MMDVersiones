/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MóduloCálculo.Objetos;

/**
 *
 * @author SERGIO
 */
public class ColecciónPseudoAleatorios {
    private int  ni,i;
    private float  xi;

    public ColecciónPseudoAleatorios() {
    }

    
    public ColecciónPseudoAleatorios(int i, int ni, float xi) {
        this.i = i;
        this.ni = ni;
        this.xi = xi;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getNi() {
        return ni;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }

    public float getXi() {
        return xi;
    }

    public void setXi(float xi) {
        this.xi = xi;
    }


  

    public Object clone()  {
        Object dev = null;
        try {
            dev = super.clone();
        } catch (Exception e) {
        }
        return dev;
    }
    
    
}
