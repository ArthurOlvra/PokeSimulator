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
import modelo.Player;

/**
 *
 * @author arthur
 */
@Stateless
public class PlayerServico extends ServicoGenerico<Player>{
    
    private Player p;
    
    public PlayerServico() {
        super(Player.class);
    }
    
    @PersistenceContext
    EntityManager em;
}