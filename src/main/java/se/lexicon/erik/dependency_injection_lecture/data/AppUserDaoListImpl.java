package se.lexicon.erik.dependency_injection_lecture.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import se.lexicon.erik.dependency_injection_lecture.model.AppUser;

@Component
public class AppUserDaoListImpl implements AppUserDao {
	
	private List<AppUser> appUsers = new ArrayList<>();
	
	@Override
	public Optional<AppUser> findById(int userId){
		for(AppUser user : appUsers) {
			if(user.getId() == userId) {
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}
	
	@Override
	public boolean addUser(AppUser user) {
		if(appUsers.contains(user)) {
			return false;
		}else {
			return appUsers.add(user);
		}
	}

}
