package se.lexicon.erik.dependency_injection_lecture.data;

import java.util.Optional;

import se.lexicon.erik.dependency_injection_lecture.model.AppUser;

public interface AppUserDao {

	Optional<AppUser> findById(int userId);

	boolean addUser(AppUser user);

}