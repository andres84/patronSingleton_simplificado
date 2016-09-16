package singletonpatron;

public class app {

public static void main(String... fragozo){
    
    patronImpl instancia = patronImpl.getInstancia();
    
    for(Object objeto : instancia.getPais()){
        
        System.out.println(((Pais)objeto).getNombre());
        
    }
    
    System.out.println("no se crea una nueva instancia");
    
    
    patronImpl instancia2 = patronImpl.getInstancia();
    
    for(Object objeto : instancia2.getPais()){
        
        System.out.println(((Pais)objeto).getNombre());
        
    }
    
}

    
}
