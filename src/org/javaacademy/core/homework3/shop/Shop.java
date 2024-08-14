package org.javaacademy.core.homework3.shop;

/**
 * Магазин
 */
public class Shop {
    private boolean isClearFloor; //Чистый пол
    private boolean workersHasBadge; //Есть ли бейджики у сотрудников
    private int countWorkers; //Количество работников в магазине

    public Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }

    public int getCountWorkers() {
        return countWorkers;
    }

    public boolean isClearFloor() {
        return isClearFloor;
    }

    public boolean isWorkersHasBadge() {
        return workersHasBadge;
    }
}
