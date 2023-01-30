package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//hard dependency injection
// Жесткое внедрение зависимости из-за того что пришлось прописать объект персон
public class Test3 {
    public static void main(String[] args) {
        //обощение к контексту
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = context.getBean("myPet", Pet.class);

        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        // закрытие обязательно
        context.close();


    }
}
