package gps;
/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static int longituDiferente(int [] camino) {
    	
    	int suma=0;
    	for(int i=0; i<camino.length; i++) {
    		suma += camino[i];
    	}
    	return suma;
    }
    
    public static String rutaCorta(int sum1, int sum2, int sum3)
    {      	
           
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        
        int sum1 = Bicicleta.longituDiferente(camino1);
        int sum2 = Bicicleta.longituDiferente(camino2);
        int sum3 = Bicicleta.longituDiferente(camino3);
        
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(sum1,sum2,sum3)+".");
    }
}

