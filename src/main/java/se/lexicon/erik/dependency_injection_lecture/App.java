package se.lexicon.erik.dependency_injection_lecture;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.lexicon.erik.dependency_injection_lecture.service.AppUserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
        AppUserService service = context.getBean(AppUserService.class);
        System.out.println(service.createNewAppUser("Erik", LocalDate.now()));
        
        context.close();
    }
}
