/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managebean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Poke;
import servico.PokeServico;

/**
 *
 * @author arthur
 */
@ManagedBean
@ViewScoped
public class PokeManagerBean {
    private Poke poke;
    private List<Poke> pokes;
    
    @EJB
    PokeServico pokeServico;
    
    @PostConstruct
    public void start(){
        this.poke = new Poke();
        this.pokes = new ArrayList();
        this.pokes = pokeServico.findAll();
    }

    public Poke getPoke() {
        return poke;
    }

    public void setPoke(Poke poke) {
        this.poke = poke;
    }

    public List<Poke> getPokes() {
        return pokes;
    }

    public void setPokes(List<Poke> pokes) {
        this.pokes = pokes;
    }
    
}
