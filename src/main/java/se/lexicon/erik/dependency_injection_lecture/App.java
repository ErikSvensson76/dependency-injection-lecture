package se.lexicon.erik.dependency_injection_lecture;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.erik.dependency_injection_lecture.config.AppConfig;
import se.lexicon.erik.dependency_injection_lecture.service.AppUserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(AppConfig.class);
        
        AppUserService service = context.getBean(AppUserService.class);
        System.out.println(service.createNewAppUser("Erik", LocalDate.now()));
        
        context.close();
    }
}
