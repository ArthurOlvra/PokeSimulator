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
import modelo.Attack;

/**
 *
 * @author arthur
 */
@Stateless
public class AttackServico extends ServicoGenerico<Attack>{
    
    private Attack p;
    
    public AttackServico() {
        super(Attack.class);
    }
    
    @PersistenceContext
    EntityManager em;
}
