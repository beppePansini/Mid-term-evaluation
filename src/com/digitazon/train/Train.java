package com.digitazon.train;

/**
 * Progettare un sistema ferroviario costituito da treni e binari,
 * come specificato di seguito.Un Train possiede due campi che contengono
 * informazione sulla velocità del treno e sullo stato delle porte (aperte o chiuse).
 * Inoltre fornisce i seguenti metodi comuni a tutti i tipi di treno:
 *  ●stop che frena il treno azzerandone la velocità
 *  ●enterStation che frena il treno ed apre le porte
 *  ●setDoors(boolean value) che dato in input un booleano, imposta le porte allo stato
 *      corrispondente (aperte o chiuse).
 * Progettare inoltre due classi per modellare un treno regionale, RegionalTraine
 * un treno ad alta velovità, HighSpeedTrain che estendono un generico treno.
 * Il treno ad alta velocità sovrascrive il metodo enterStation,il quale,
 * oltre a frenare, verifica che la sua velocità sia uguale a zero e a quel
 * punto apre le porte.
 */
public abstract class Train {
    public int vel;
    public boolean doors;

    public Train(int vel, boolean doors) {
        this.vel = vel;
        this.doors = doors;
    }

    abstract int stop();
    abstract void enterStation();
    abstract void setDoors(boolean doors);
}