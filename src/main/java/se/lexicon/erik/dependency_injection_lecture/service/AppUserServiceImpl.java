package se.lexicon.erik.dependency_injection_lecture.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.erik.dependency_injection_lecture.data.AppUserDao;
import se.lexicon.erik.dependency_injection_lecture.model.AppUser;

@Component
public class AppUserServiceImpl implements AppUserService {
	
	private AppUserDao appUserDao;

	@Autowired
	public AppUserServiceImpl(AppUserDao appUserDao) {
		this.appUserDao = appUserDao;
	}
	
	@Override
	public AppUser createNewAppUser(String name, LocalDate birthDate) {
		AppUser user = new AppUser(name, birthDate);
		if(appUserDao.addUser(user)) {
			return user;
		}else {
			throw new IllegalArgumentException("User already exists!");
		}
	}
	
	@Override
	public AppUser findAppUser(int appUserId) {
		Optional<AppUser> result = appUserDao.findById(appUserId);
		
		return result.orElseThrow(IllegalArgumentException::new);
	}

}
