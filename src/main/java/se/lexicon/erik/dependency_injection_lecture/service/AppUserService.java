package se.lexicon.erik.dependency_injection_lecture.service;

import java.time.LocalDate;

import se.lexicon.erik.dependency_injection_lecture.model.AppUser;

public interface AppUserService {

	AppUser createNewAppUser(String name, LocalDate birthDate);

	AppUser findAppUser(int appUserId);

}