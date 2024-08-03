package org.javaacademy.core.homework2.office;

public class Secretary {

    public void ask(Manager manager, Boss boss, Security security) {
        System.out.println(boss.getName() + ", не волнуйтесь, " + manager.getName() + " всё успеет. "
                + security.getName() + ", подождите!");
    }
}
