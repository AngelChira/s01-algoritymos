package s01Algoritmos;

import s01Algoritmos.Persona;

public class Alumno extends Persona {
    private float n1;
    private float n2;
    private float n3;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public float calcularPromedio() {
        return (n1 + n2 + n3)/3;
    }
}
