package employeeApp;

import com.workintech.challenge.Company;
import com.workintech.challenge.Employee;
import com.workintech.challenge.Healthplan;
import com.workintech.challenge.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan healthplan1=new Healthplan(1,"A Sigorta", Plan.BASIC);
        Healthplan healthplan2=new Healthplan(2,"B Sigorta", Plan.MEDIUM);
        Healthplan healthplan3=new Healthplan(3,"C Sigorta", Plan.ADVANCE);
        System.out.println("Healthplan*************************");
        System.out.println("healthplan1: " +healthplan1);
        System.out.println("healthplan2: " +healthplan2);
        System.out.println("healthplan3: " +healthplan3);
        System.out.println("healthplan1.getId(): " + healthplan1.getId());
        System.out.println("healthplan2.getName(): " + healthplan2.getName());
        System.out.println("healthplan3.getPlan(): " + healthplan3.getPlan());


        System.out.println("-------------------------------");
        System.out.println("Employee*************************");
        String [] healthPlans= new String[4];
        //new String[]{"A Sigorta","B Sigorta","C Sigorta",null}
        Employee employee=new Employee(1,"Beren","beren@beren.com","123456",healthPlans);
        System.out.println(employee);
        employee.addHealthPlan(0,"A Sigorta");
        employee.addHealthPlan(1,"B Sigorta");
        employee.addHealthPlan(2,":C Sigorta");
        System.out.println(employee);
        employee.addHealthPlan(2,":D Sigorta");
        employee.addHealthPlan(-2,":D Sigorta");
        employee.addHealthPlan(5,":D Sigorta");

        System.out.println("-------------------------------");
        System.out.println("Company*************************");
        String [] developerNames= new String[3];
        Company company=new Company(1,"HediyeDükkanı",125245.5,developerNames);
        System.out.println(company);
        company.addEmployee(1,"John");
        company.addEmployee(3,"John");
        company.addEmployee(-1,"John");
        company.addEmployee(1,"John");
        System.out.println(company);






    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
