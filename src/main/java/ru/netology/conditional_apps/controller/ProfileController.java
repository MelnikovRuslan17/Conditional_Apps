package ru.netology.conditional_apps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.conditional_apps.systemProfile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile profile;
    public ProfileController(SystemProfile profile) {
        this.profile = profile;

    }
    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}