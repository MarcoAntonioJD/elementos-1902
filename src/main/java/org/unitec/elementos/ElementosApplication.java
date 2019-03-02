package org.unitec.elementos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner{

    @Autowired
    RepoUsuario repoU;
    
	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        //Aquí irán todas las pruebas sin necesidad de UI
        
        //Guardar (primera forma)
        //repoU.save(new Usuario(1, "Marco"));
        //repoU.save(new Usuario(2, "Antonio"));
        
        //Guardar (segunda forma)
        //Usuario u=new Usuario();
        //u.setId(3);
        //u.setNombre("JD");
        //repoU.save(u);
        
        //Buscar todos
        //for(Usuario u:repoU.findAll()){
        //    System.out.println(u);
        //}
        
        //Buscar por id
        //System.out.println(repoU.findById(1).get());
                
        //Actualizar (primera forma)
        //repoU.save(new Usuario(3,"JD"));
        
        //Actualizar (segunda forma)
        //Usuario u=new Usuario();
        //u.setId(3);
        //u.setNombre("JD");
        //repoU.save(u);
        
        //Borrar
        //repoU.deleteById(4);
                
        //--------Ejercicio-------
        
        //for(Usuario u:repoU.findAll()){System.out.println(u);}
        
        //repoU.save(new Usuario(4, "JD"));
        
        //Buscando por nombre (creado en RepoUsuario.java)
        //for(Usuario u:repoU.findByNombre("JD")){
        //    System.out.println(u);
        //}
                
        //-------- --------
        
        
        
        
        
        
    }
}

