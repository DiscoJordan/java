package com.company.part4.simple_classes_and_objects.task1;

public class Test1 {
    /* 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/
    private int variable1;
    private int variable2;

    public void print() {
        System.out.println("var 1 :" + variable1);
        System.out.println("var 2 :" + variable2);
    }

    public void setVariable1(int value) {
        variable1 = value;
    }

    public void setVariable2(int value) {
        variable2 = value;
    }

    public int getSum() {
        return variable1 + variable2;
    }

    public int getMax() {
        if (variable1 > variable2) {
            return variable1;

        } else {
            return variable2;
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setVariable1(10);
        test1.setVariable2(20);
        test1.print();
        System.out.println(test1.getSum());
        System.out.println(test1.getMax());

    }
}