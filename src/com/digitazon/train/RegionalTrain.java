package com.digitazon.train;

/**
 *  ●stop che frena il treno azzerandone la velocità
 *  ●enterStation che frena il treno ed apre le porte
 *  ●setDoors(boolean value) che dato in input un booleano, imposta le
 *      porte allo stato corrispondente (aperte o chiuse).
 * Progettare inoltre due classi per modellare un treno regionale, RegionalTrain
 */
public class RegionalTrain extends Train{
    public RegionalTrain(int vel, boolean doors) {
        super(vel, doors);
    }

    @Override
    public int stop() {
        return vel = 0;
    }

    @Override
    public void enterStation() {
        while (vel > 0) {
            vel -= 5;
            if (vel == 0) {
                doors = true;
            }
        }
    }

    @Override
    public void setDoors(boolean doors) {

    }
}