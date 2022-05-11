/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Enums.PokeTypes;
import java.util.Objects;


/**
 *
 * @author arthur
 */
public class Poke {
    private String name;
    private int level;
    private Stats stats;
    private PokeTypes type1;
    private PokeTypes type2;
    private boolean aggressive;
    private Attack attack1;
    private Attack attack2;
    private Attack attack3;
    private Attack attack4;
    private boolean wild;
    private boolean ativo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public PokeTypes getType1() {
        return type1;
    }

    public void setType1(PokeTypes type1) {
        this.type1 = type1;
    }

    public PokeTypes getType2() {
        return type2;
    }

    public void setType2(PokeTypes type2) {
        this.type2 = type2;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public Attack getAttack1() {
        return attack1;
    }

    public void setAttack1(Attack attack1) {
        this.attack1 = attack1;
    }

    public Attack getAttack2() {
        return attack2;
    }

    public void setAttack2(Attack attack2) {
        this.attack2 = attack2;
    }

    public Attack getAttack3() {
        return attack3;
    }

    public void setAttack3(Attack attack3) {
        this.attack3 = attack3;
    }

    public Attack getAttack4() {
        return attack4;
    }

    public void setAttack4(Attack attack4) {
        this.attack4 = attack4;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.level;
        hash = 47 * hash + Objects.hashCode(this.stats);
        hash = 47 * hash + Objects.hashCode(this.type1);
        hash = 47 * hash + Objects.hashCode(this.type2);
        hash = 47 * hash + (this.aggressive ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.attack1);
        hash = 47 * hash + Objects.hashCode(this.attack2);
        hash = 47 * hash + Objects.hashCode(this.attack3);
        hash = 47 * hash + Objects.hashCode(this.attack4);
        hash = 47 * hash + (this.wild ? 1 : 0);
        hash = 47 * hash + (this.ativo ? 1 : 0);
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
        final Poke other = (Poke) obj;
        if (this.level != other.level) {
            return false;
        }
        if (this.aggressive != other.aggressive) {
            return false;
        }
        if (this.wild != other.wild) {
            return false;
        }
        if (this.ativo != other.ativo) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.stats, other.stats)) {
            return false;
        }
        if (this.type1 != other.type1) {
            return false;
        }
        if (this.type2 != other.type2) {
            return false;
        }
        if (!Objects.equals(this.attack1, other.attack1)) {
            return false;
        }
        if (!Objects.equals(this.attack2, other.attack2)) {
            return false;
        }
        if (!Objects.equals(this.attack3, other.attack3)) {
            return false;
        }
        if (!Objects.equals(this.attack4, other.attack4)) {
            return false;
        }
        return true;
    }

    
    
    
}
