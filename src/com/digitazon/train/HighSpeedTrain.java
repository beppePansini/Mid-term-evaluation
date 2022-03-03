package com.digitazon.train;

/**
 *  ●stop che frena il treno azzerandone la velocità
 *  ●enterStation che frena il treno ed apre le porte
 *  ●setDoors(boolean value) che dato in input un booleano, imposta le porte allo stato
 *      corrispondente (aperte o chiuse).
 * HighSpeedTrain
 * Il treno ad alta velocità sovrascrive il metodo enterStation,il quale,
 * oltre a frenare, verifica che la sua velocità sia uguale a zero e a quel
 * punto apre le porte.
 */
public class HighSpeedTrain extends Train{
    public HighSpeedTrain(int vel, boolean doors) {
        super(vel, doors);
    }

    @Override
    int stop() {
        return vel = 0;
    }

    @Override
    void enterStation() {
        if (vel == 0) {
            doors = true;
        }
    }

    @Override
    void setDoors(boolean doors) {
        this.doors = doors;
    }
}