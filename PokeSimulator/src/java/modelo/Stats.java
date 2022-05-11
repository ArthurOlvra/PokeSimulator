/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author arthur
 */
public class Stats {
    private int life;
    private int physAttack;
    private int specAttack;
    private int physDefense;
    private int specDefense;
    private int speed;
    private boolean ativo;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPhysAttack() {
        return physAttack;
    }

    public void setPhysAttack(int physAttack) {
        this.physAttack = physAttack;
    }

    public int getSpecAttack() {
        return specAttack;
    }

    public void setSpecAttack(int specAttack) {
        this.specAttack = specAttack;
    }

    public int getPhysDefense() {
        return physDefense;
    }

    public void setPhysDefense(int physDefense) {
        this.physDefense = physDefense;
    }

    public int getSpecDefense() {
        return specDefense;
    }

    public void setSpecDefense(int specDefense) {
        this.specDefense = specDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.life;
        hash = 29 * hash + this.physAttack;
        hash = 29 * hash + this.specAttack;
        hash = 29 * hash + this.physDefense;
        hash = 29 * hash + this.specDefense;
        hash = 29 * hash + this.speed;
        hash = 29 * hash + (this.ativo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stats other = (Stats) obj;
        if (this.life != other.life) {
            return false;
        }
        if (this.physAttack != other.physAttack) {
            return false;
        }
        if (this.specAttack != other.specAttack) {
            return false;
        }
        if (this.physDefense != other.physDefense) {
            return false;
        }
        if (this.specDefense != other.specDefense) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        if (this.ativo != other.ativo) {
            return false;
        }
        return true;
    }

    
    
    
}
    