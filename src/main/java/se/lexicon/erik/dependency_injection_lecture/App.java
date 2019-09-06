package se.lexicon.erik.dependency_injection_lecture;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.lexicon.erik.dependency_injection_lecture.service.AppUserService;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
        AppUserService service = context.getBean(AppUserService.class);
        String name = "Olof";
        LocalDate birthDate = LocalDate.now();
        System.out.println(service.createNewAppUser(name, birthDate));
        
        context.close();
    }
}
