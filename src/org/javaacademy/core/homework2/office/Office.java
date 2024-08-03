package org.javaacademy.core.homework2.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workingDay() {
        boss.customize(manager);
        manager.cry();
        security.askAdvancePayment();
        secretary.ask(manager, boss, security);
    }
}
