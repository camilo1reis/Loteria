/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ed.loteria.model;

/**
 *
 * @author camilo
 */
public class Jogo {
    
    private Time timeA, timeB;
    private EResultado resultado;

    public Jogo() {
    }

    public Jogo(Time timeA, Time timeB, EResultado resultado) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.resultado = resultado;
    }

    public Time getTimeA() {
        return timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public EResultado getResultado() {
        return resultado;
    }

    public void setResultado(EResultado resultado) {
        this.resultado = resultado;
    }
    
    
}
