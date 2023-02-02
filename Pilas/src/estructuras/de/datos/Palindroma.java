
package estructuras.de.datos;

public class Palindroma {
    
    private String string;
    final int len;
    final Pila mipila;
    private char[] car;
    
    
    public void llenar(){
        for(char x: this.car){
            mipila.push(x);
        }
        String cad = mipila.toString();
        System.out.println(cad);
    }
    
    public boolean comparar(char Caracter, int pos){ 
        return Caracter==car[pos];
    }
    
    public boolean Verificar(){
        llenar();
        int i = 0;
        char caracter = mipila.pop();
        while(i<(this.len/2) && comparar(caracter,i)){ 
            caracter = mipila.pop();
            i ++;
        }      
        return i== (this.len/2);
    }
 
    public Palindroma(String string){
        this.string = string;
        int len = string.length();
        this.len = len;
        this.mipila = new Pila(len);
        this.car =  string.toCharArray();   
    }
    
    public static void main(String[] args) {
        Palindroma pal = new Palindroma("malam");
        System.out.println(pal.Verificar());
         
    }
            
}
