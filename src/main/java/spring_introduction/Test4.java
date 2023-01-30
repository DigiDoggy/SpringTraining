package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml"); // we can write more than 1
        // configuration file, we need just put comma and add one more config files

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog= context.getBean("myPet", Dog.class);

        /**
         * if we set the name for objects in singleton scope, then we just rename all objects to the last specified name
         */
        myDog.setName("Denny");
        yourDog.setName("Charly");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        /**
         // Checking if objects refer to the same bean
         if we have singleton scope, then solution is true - because in spring container we have only one bean whit
         the same name
         If we have prototype scope, the solution is false - because in spring container we create another bean, when we
         write context.getBean()
         */
        System.out.println("Arguments refer for the same object? " + (myDog==yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);


        context.close();
    }
}
