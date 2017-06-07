/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joyclub.pokerstarsleaguecalculator;

/**
 *
 * @author nicola
 */
    public class PuntiLeague {

        int premiati;
        double puntiAssegnati;
        double percentuale;

        int aPremio(int iscritti) {
            premiati = (iscritti * 15) / 100;
            return premiati;
        }

        double puntiAssegnati(int iscritti, int posizione) {
            puntiAssegnati = 10 * (Math.sqrt(iscritti) / Math.sqrt(posizione));
            return puntiAssegnati;
        }

        double percentuale(int iscritti, int posizione) {
            percentuale = ((double) posizione * 100) / (double) iscritti;
            return percentuale;
        }
    }
