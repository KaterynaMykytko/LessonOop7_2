package org.courses.ex7_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Worker> workersList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter worker " + i);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter fio");
            String fio = sc.next();
            System.out.println("Enter position");
            String position = sc.next();
            ;
            System.out.println("Enter employementYear");
            String strEmpYear = sc.next();
            int employementYear = 0;
            try {
                employementYear = Integer.parseInt(strEmpYear);
            } catch (InputMismatchException e) {
                throw new RuntimeException("Employement year must be Integer");
            }
            Worker worker = new Worker(fio, position, employementYear);
            workersList.add(worker);
        }

        Collections.sort(workersList, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getFio().compareTo(o2.getFio());
            }
        });

        for (int i = 0; i < workersList.size(); i++) {
            System.out.println(workersList.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter work experience");
        int experience = scanner.nextInt();

        for (Worker w : workersList) {
            Boolean result = w.isExperienceHigher(experience);
            if (result == true) {
                System.out.println(w.getFio());
            }
        }
    }
}
