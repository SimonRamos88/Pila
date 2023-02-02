
package estructuras.de.datos;


public class Pila {
    
    public char[] Arreglo;
    private int cont;
    private int n; 
    
    public boolean full(){
        return cont == n;
    }
    
    public boolean empty(){
        return cont == 0;
    }
    public void push(char string){
        if(!full()){
            int pos = this.cont;
            char[] arreglo = this.Arreglo;
            arreglo[pos] = string;
            this.cont++;
        }
    }
   
    public char pop(){
        char element = ' ';
        if(!empty()){
            this.cont -= 1;
            element = this.Arreglo[cont];           
        }
        return element;
    }
    
    public Pila(int n){       
        char[] arreglo = new char[n];
        this.Arreglo = arreglo ;
        this.cont = 0;
        this.n = n;
    }

    @Override
    
    public String toString(){
        char[] arreglo = this.Arreglo;
        String cad = "[ ";
        int i = 0;
        while(i<this.cont){       
            cad += arreglo[i] + " ";
            i++;
        }
       
        cad += "]";
        return cad;
    }
    
    public static void main(String[] args) {
        Pila mipila = new Pila(3);
        mipila.push('a');
        
        mipila.push('b');
        mipila.push('c');
        mipila.push('d');
        
        
        
        System.out.println(mipila.toString());
        char xd = mipila.pop();
        char xd1 = mipila.pop();
        char xd2 = mipila.pop();
        char xd3 = mipila.pop();
        System.out.println(xd2);
        System.out.println(mipila.n);
        System.out.println(mipila.toString());
        
    }
    

    
}

/*public class Pila {
    
    public String[] Arreglo;
    private int cont;
    
    public boolean full(){
        int i = 0;
        String[] arreglo = this.Arreglo;       
        while(i<5 && arreglo[i] != null){
            i++;       
        }
        return i==5;
    }
    
    public boolean empty(){
        int i = 0;
        String[] arreglo = this.Arreglo;
        String elemento = arreglo[i];
        return elemento == null;
    }
    public void push(String string){
        String[] arreglo = this.Arreglo;
        if(!full()){
            int cont = this.cont;
            arreglo[cont] = string;
            this.cont += 1;
        }  
    }
    
    public String pop(){
        String[] arreglo = this.Arreglo;
        if(!empty() && cont != 5){
            int cont = this.cont;
            arreglo[cont] = null;
            this.cont -=1;
        }
        return tString(arreglo);
    }
        public Pila(){
        String[] arreglo = new String[5];
        this.Arreglo = arreglo ;
        this.cont = 0;
    }
     public String tString(String[] arreglo){
        String cad = "[ ";
        for(String x : arreglo ){
            cad += x;
            cad += " ";
        }
        cad += "]";
        return cad;
    }
    @Override
    
    public String toString(){
        String[] arreglo = this.Arreglo;
        String cad = "[ ";
        for(String x : arreglo ){
            cad += x;
            cad += " ";
        }
        cad += "]";
        return cad;
    }
    
    public static void main(String[] args) {
        Pila mipila = new Pila();
        mipila.push("A");
        
        mipila.push("A");
        
        mipila.push("A");
        
        mipila.push("A");
        
        mipila.push("A");
        System.out.print(mipila.toString());
        String xd = mipila.pop();
        System.out.println(xd);
         
    }
    

    
}
*/