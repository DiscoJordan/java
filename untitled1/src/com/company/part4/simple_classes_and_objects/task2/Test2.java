package com.company.part4.simple_classes_and_objects.task2;
/*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
        класса.*/

public class Test2 {
    private int variable1;
    private int variable2;

    public Test2() {
        variable1 = 10;
        variable2 = 20;
    }
    public Test2(int value1, int value2) {
        variable1 = value1;
        variable2 = value2;
    }

    public void setVariable1(int value) {
        variable1 = value;
    }
    public void setVariable2(int value) {
        variable2 = value;
    }

    public int getVariable1() {
        return variable1;
    }
    public int getVariable2() {
        return variable2;
    }

    public static void main(String[] args) {
        Test2 temp1 = new Test2();
        Test2 temp2 = new Test2(1, 2);
        System.out.println("temp1 value1: " + temp1.getVariable1()
                + " temp1 value2: " + temp1.getVariable2());
        System.out.println("temp2 value1: " + temp2.getVariable1()
                + " temp2 value2: " + temp2.getVariable2());

        temp1.setVariable1(11);
        temp1.setVariable2(12);
        System.out.println("temp1 value1: " + temp1.getVariable1()
                + " temp1 value2: " + temp1.getVariable2());
    }
}
