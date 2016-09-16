package singletonpatron;

import java.util.ArrayList;
import java.util.List;

public class patronImpl {

            
            private patronImpl(){
                
            }
            
            private static patronImpl unica_instancia = null;
            
            public static patronImpl getInstancia(){
                
                if(unica_instancia == null){
                    
                    unica_instancia = new patronImpl();
                    
                }
                
                return unica_instancia;
                
            }
            
            
            private List lista_paises = null;
            
            public List getPais(){
                
                
                if(lista_paises == null){
                    
                    lista_paises = new ArrayList();
                    
                    Pais p1 = new Pais("Colombia");
                    Pais p2 = new Pais("Venezuela");
                    Pais p3 = new Pais("Ecuador");
                    
                    lista_paises.add(p1);
                    lista_paises.add(p2);
                    lista_paises.add(p3);
                    
                }
                
                return lista_paises;
                
            }

    
}
