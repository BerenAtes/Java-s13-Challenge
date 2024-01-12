package employeeApp;

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
        Healthplan healthplan=new Healthplan(16,"Beren", Plan.MEDIUM);
        System.out.println("Healthplan*************************");
        System.out.println(healthplan);
        System.out.println("healthplan.getId(): " + healthplan.getId());
        System.out.println("healthplan.getName(): " + healthplan.getName());
        System.out.println("healthplan.getPlan(): " + healthplan.getPlan());


        System.out.println("-------------------------------");
        Employee employee=new Employee(3,"Beren","beren@beren.com","123456",new String[2]);
        System.out.println("Healthplan*************************");
        System.out.println(employee);


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
