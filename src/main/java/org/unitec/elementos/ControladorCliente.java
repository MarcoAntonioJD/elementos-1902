/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorCliente {
        
    @Autowired RepoCliente repoC;
    
    //Buscar todos los clientes
    @GetMapping("/cliente")
    List<Cliente> buscarTodos(){
        return repoC.findAll();
    }
    
    //Guardar un cliente
    @PostMapping("/cliente")
    Estatus guardar(@RequestBody String json) throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Cliente c=maper.readValue(json, Cliente.class);
        repoC.save(c);
        Estatus e=new Estatus("Cliente guardado", true);
        return e;
    }
    
    //Borrar cliente por id
    @DeleteMapping("/cliente/{id}")
    Estatus borrar(@PathVariable Integer id) throws Exception{
        repoC.deleteById(id);
        Estatus e = new Estatus("Cliente borrado", true);
        return e;
    }
}
