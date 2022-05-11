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
public class Attack {
    private String nome;
    private int power;
    private int accurracy;
    private PokeTypes type;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccurracy() {
        return accurracy;
    }

    public void setAccurracy(int accurracy) {
        this.accurracy = accurracy;
    }

    public PokeTypes getType() {
        return type;
    }

    public void setType(PokeTypes type) {
        this.type = type;
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
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + this.power;
        hash = 71 * hash + this.accurracy;
        hash = 71 * hash + Objects.hashCode(this.type);
        hash = 71 * hash + (this.ativo ? 1 : 0);
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
        final Attack other = (Attack) obj;
        if (this.power != other.power) {
            return false;
        }
        if (this.accurracy != other.accurracy) {
            return false;
        }
        if (this.ativo != other.ativo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }

    
    
}
