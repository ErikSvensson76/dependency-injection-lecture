package se.lexicon.erik.dependency_injection_lecture.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.lexicon.erik.dependency_injection_lecture.data.AppUserDao;
import se.lexicon.erik.dependency_injection_lecture.model.AppUser;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	private AppUserDao appUserDao;	
	
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
