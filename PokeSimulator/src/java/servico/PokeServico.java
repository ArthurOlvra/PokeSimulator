/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import generico.ServicoGenerico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Poke;

/**
 *
 * @author arthur
 */
@Stateless
public class PokeServico extends ServicoGenerico<Poke>{
    
    private Poke p;
    
    public PokeServico() {
        super(Poke.class);
    }
    
    @PersistenceContext
    EntityManager em;
}
