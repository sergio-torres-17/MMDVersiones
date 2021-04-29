import java.io.Serializable;

class Coordenada implements Cloneable, Serializable
{
    private double x,y;
    public Coordenada() {
        x = y = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "("  + x + ", " + y + ')';
    }

    @Override
    protected Coordenada clone() {
        Coordenada x = null; 
        try {
            x = (Coordenada) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        // clonado profundo    clone()
        return x;
    }
    
}