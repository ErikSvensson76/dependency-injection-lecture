package se.lexicon.erik.dependency_injection_lecture;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.erik.dependency_injection_lecture.config.BeanConfigurations;
import se.lexicon.erik.dependency_injection_lecture.service.AppUserService;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(BeanConfigurations.class);
        
        AppUserService service = context.getBean(AppUserService.class);
        
        System.out.println(service.createNewAppUser("Rasmus", LocalDate.now()));
        
        context.close();
    }
}
