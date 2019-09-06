package se.lexicon.erik.dependency_injection_lecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import se.lexicon.erik.dependency_injection_lecture.data.AppUserDao;
import se.lexicon.erik.dependency_injection_lecture.data.AppUserDaoListImpl;
import se.lexicon.erik.dependency_injection_lecture.service.AppUserService;
import se.lexicon.erik.dependency_injection_lecture.service.AppUserServiceImpl;

@Configuration
public class BeanConfigurations {
	
	@Bean
	public AppUserService appUserService() {		
		return new AppUserServiceImpl(appUserDao());
	}
	
	@Bean
	public AppUserDao appUserDao() {
		return new AppUserDaoListImpl();
	}

}
