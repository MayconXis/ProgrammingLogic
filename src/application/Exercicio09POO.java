package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;

public class Exercicio09POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("What's employee ID? :");
            Integer id = sc.nextInt();
            System.out.print("What's employee name? :");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("What's the employee's salary? : ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the empoyee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        Integer pos = position(list, idIncrease);

        if (pos == null) {
            System.out.print("This id does not exist!");
        } else {
            System.out.print("Enter the percentage that will salary increase: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);

        }
        System.out.println();
        System.out.println("List of employees:");
        for(Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    // Outra forma de realizar :
    // Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;

    }
}
