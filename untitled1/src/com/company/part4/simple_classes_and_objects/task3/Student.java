package com.company.part4.simple_classes_and_objects.task3;
/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/
public class Student {
    private String name;
    private int group;
    private int grades[] = new int[5];

    public Student(String nm, int grp, int grad[]) {
        name = nm;
        group = grp;
        grades[0] = grad[0];
        grades[1] = grad[1];
        grades[2] = grad[2];
        grades[3] = grad[3];
        grades[4] = grad[4];
    }
    public boolean isExcellentStudent() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != 9 && grades[i] != 10) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Student students[] = new Student[10];
        students[0] = new Student("Ivanov", 1, new int[]{9, 10, 9, 9, 9});
        students[1] = new Student("Petrov" , 2, new int[]{9, 10, 9, 10, 9});
        students[2] = new Student("Smirnov", 2, new int[]{3, 9, 2, 10, 4});
        students[3] = new Student("Obolev", 1, new int[]{6, 6, 6, 6, 4});
        students[4] = new Student("Sobolev", 4, new int[]{3, 1, 2, 6, 4});
        students[5] = new Student("Fedorov", 3, new int[]{1, 1, 10, 3, 7});
        students[6] = new Student("Duda", 2, new int[]{10, 10, 9, 10, 10});
        students[7] = new Student("Chubaka", 3, new int[]{9, 9, 9, 9, 9});
        students[8] = new Student("Ivanova", 4, new int[]{3, 10, 2, 6, 4});
        students[9] = new Student("Smirbova", 1, new int[]{3, 8, 2, 6, 4});
        for (Student person : students) {
            if (person.isExcellentStudent()) {
                System.out.println(person.name + " " + person.group);
            }
        }
    }
}