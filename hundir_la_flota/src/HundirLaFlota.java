import java.sql.Array;

public class HundirLaFlota {
    public char t[][];

    public void ImprimirTablero() {
        for (int i = 0; i < this.t.length; i++) {
            for (int j = 0; j < this.t.length; j++) {
                System.out.print(this.t[i][j]);
            }
            System.out.println("");
        }
    }


    public enum DireccionBarco {Abajo, Derecha}

    ;

    public HundirLaFlota(int ladoTablero) {
        if (ladoTablero > 10)
            t = new char[10][10];
        else if (ladoTablero < 4)
            t = new char[4][4];
        else
            t = new char[ladoTablero][ladoTablero];

    }

    //Si coloca el barco (verificando las restricciones) devuelve true, en caso contrario falso
    public boolean ColocarBarco(int tamBarco, int casillaFila, int casillaColumna, DireccionBarco direccion) {
        boolean barko = false;
        int i = casillaFila;
        int j = casillaColumna;
        int cont = 1;
        if (barcoEntra(tamBarco, casillaFila, casillaColumna, direccion) && noChoca(tamBarco, casillaFila, casillaColumna, direccion)/* && noAlrededor(tamBarco, casillaFila, casillaColumna, direccion)*/ && tamBarco>=2){
            t[i][j] = 'B';
            if (direccion == DireccionBarco.Abajo) {
                do {

                    t[i][j] = 'B';
                    i++;
                    cont++;
                } while (cont <= tamBarco);
                barko = true;
            } else {
                do {

                    t[i][j] = 'B';
                    j++;
                    cont++;
                } while (cont <= tamBarco);
                barko =true;
            }
        }
        return barko;
    }

    private boolean noAlrededor(int tamBarco, int casillaFila, int casillaColumna, DireccionBarco direccion) {
        boolean barko = true;
        int i = casillaFila;
        int j = casillaColumna;
        int cont = 1;
        if(j==0 && i==0) {
            if (direccion == DireccionBarco.Abajo) {
                do {
                    if (t[i][j+1] == 'B' || t[i+1][j] == 'B' || t[i+1][j+1] == 'B' )
                        barko = false;
                    i++;
                    cont++;
                } while (cont <= tamBarco && barko);
            } else {
                do {
                    if (t[i][j+1] == 'B' || t[i+1][j] == 'B' || t[i+1][j+1] == 'B' )
                        barko = false;

                    j++;
                    cont++;
                } while (cont <= tamBarco && barko);
            }
        }else if(j==this.t.length && i==this.t.length) {
            if (direccion == DireccionBarco.Abajo) {
                do {
                    if (t[i][j-1] == 'B' || t[i-1][j] == 'B' || t[i-1][j+-1] == 'B' )
                        barko = false;
                    i++;
                    cont++;
                } while (cont <= tamBarco && barko);
            } else {
                do {
                    if (t[i][j-1] == 'B' || t[i-1][j] == 'B' || t[i-1][j-1] == 'B' )
                        barko = false;

                    j++;
                    cont++;
                } while (cont <= tamBarco && barko);
            }
        } else if(j==this.t.length && i==this.t.length) {
            if (direccion == DireccionBarco.Abajo) {
                do {
                    if (t[i][j-1] == 'B' || t[i-1][j] == 'B' || t[i-1][j+-1] == 'B' )
                        barko = false;
                    i++;
                    cont++;
                } while (cont <= tamBarco && barko);
            } else {
                do {
                    if (t[i][j-1] == 'B' || t[i-1][j] == 'B' || t[i-1][j-1] == 'B' )
                        barko = false;

                    j++;
                    cont++;
                } while (cont <= tamBarco && barko);
            }
        }

        return barko;
    }

    private boolean noChoca(int tamBarco, int casillaFila, int casillaColumna, DireccionBarco direccion) {
        boolean barko = true;
        int i = casillaFila;
        int j = casillaColumna;
        int cont = 1;
        if (direccion == DireccionBarco.Abajo) {
            do {
                if(t[i][j] =='B')
                    barko=false;
                i++;
                cont++;
            } while (cont <= tamBarco && barko);
        } else {
            do {
                if(t[i][j] =='B')
                    barko=false;

                j++;
                cont++;
            } while (cont <= tamBarco && barko);
        }
        return barko;
    }


    private boolean barcoEntra(int tamBarco, int casillaFila, int casillaColumna, DireccionBarco direccion) {
        int i = casillaFila;
        int j = casillaColumna;
        if (DireccionBarco.Abajo == direccion) {
            if (i + tamBarco > this.t.length) {
                return false;
            }
        } else {
            if (j + tamBarco > this.t.length) {
                return false;
            }

        }
    /*public void Disparar(int fila, int columna)
    {
        //A rellenar por el alumno
        ImprimirTablero();
    }*/
        return true;
    }
}