/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managebean;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Player;
import servico.PlayerServico;

/**
 *
 * @author arthur
 */
@ManagedBean
@ViewScoped
public class PlayerManagerBean {
    private Player player;
    private List<Player> players;
    
    @EJB
    PlayerServico playerServico;
    
    public void start(){
        this.player = new Player();
        this.players = new ArrayList();
        this.players = playerServico.findAll();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public PlayerServico getPlayerServico() {
        return playerServico;
    }

    public void setPlayerServico(PlayerServico playerServico) {
        this.playerServico = playerServico;
    }
    
}
