public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HundirLaFlota t = new HundirLaFlota(10);
		    var r1 = t.ColocarBarco(1, 0, 0, HundirLaFlota.DireccionBarco.Abajo); //Devuelve falso
            var r2 = t.ColocarBarco(3, 0, 0, HundirLaFlota.DireccionBarco.Derecha); //Devuelve true
            var r3 = t.ColocarBarco(5, 3, 4, HundirLaFlota.DireccionBarco.Abajo); //Devuelve true
            var r4 = t.ColocarBarco(6, 3, 2, HundirLaFlota.DireccionBarco.Derecha); //Devuelve true
 
            //t.Disparar(1, 6);
            //t.Disparar(1, 7);
            //t.Disparar(1, 8);
            //t.Disparar(3, 3);
            //t.Disparar(3, 4);
            //t.Disparar(3, 5);
            //t.Disparar(9, 6);
            //t.Disparar(8, 6);
            //t.Disparar(9, 7);
            //t.Disparar(9, 7);
            t.ImprimirTablero();


	}

}
