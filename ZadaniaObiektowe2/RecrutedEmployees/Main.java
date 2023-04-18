package ZadaniaObiektowe2.RecrutedEmployees;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        end:
        while(true){
            System.out.println("""
                    What you want to do?
                    1 -> Hire new employee.
                    2 -> Print all hired employees.
                    3 -> Nothing""");
            int x = in.nextInt();
            switch (x){
                case 1:
                    System.out.print("Do you want to hire Miner(1) or Doctor(2): ");
                    int y = in.nextInt();
                    System.out.print("Name: "); String name = inn.nextLine();
                    System.out.print("Age: "); int age = Integer.parseInt(inn.nextLine());
                    System.out.print("Town: "); String town = inn.nextLine();
                    System.out.print("Mail: "); String mail = inn.nextLine();
                    System.out.print("Tel_num: "); String tel = inn.nextLine();
                    switch (y) {
                        case 1 -> {
                            System.out.print("Strength: ");
                            int Str = Integer.parseInt(inn.nextLine());
                            employees.add(new Miner(name, age, town, mail, tel, Str));
                        }
                        case 2 -> {
                            System.out.print("Degree: ");
                            String degree = inn.nextLine();
                            employees.add(new Doctor(name, age, town, mail, tel, degree));
                        }
                        default -> {
                        }
                    }
                    break;
                case 2:
                    for(Employee i: employees){
                       System.out.println(i.toString());
                    }
                    break;
                case 3:
                    break end;
                }
            }
        }
    }
