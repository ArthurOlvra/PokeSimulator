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
import modelo.Attack;
import servico.AttackServico;

/**
 *
 * @author arthur
 */
@ManagedBean
@ViewScoped
public class AttackManagerBean {
    private Attack attack;
    private List<Attack> attacks;
    
    @EJB
    AttackServico attackServico;
    
    public void start(){
        this.attack = new Attack();
        this.attacks = new ArrayList();
        this.attacks = attackServico.findAll();
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public AttackServico getAttackServico() {
        return attackServico;
    }

    public void setAttackServico(AttackServico attackServico) {
        this.attackServico = attackServico;
    }
    
    
}
