package com.facebookApi.facebookApi.controllers;

import com.facebookApi.facebookApi.models.Story;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/facebook/story")
public class StoryController {
    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public void getAllStory(){

        System.out.println("Showing All Stories, public content");
    }

    @GetMapping(path = "{storyId}")
    public void getStory(@PathVariable("storyId") Integer storyId){
        System.out.println("Showing");
    }

    @PostMapping
    @PreAuthorize("hasROLE('ADMIN')")
    public void createStory(){
        System.out.println("Creating new Story");
    }

    @DeleteMapping(path="{storyId}")
    @PreAuthorize("hasROLE('ADMIN')")
    public void deleteStory(@PathVariable("storyId") Integer storyId){
        System.out.println("Deleting Story");
    }

    @PutMapping(path = "{storyId}")
    @PreAuthorize("hasROLE('ADMIN')")
    public void updateStory(@PathVariable("storyId") Integer storyId, @RequestBody Story story){
        System.out.println("Updating Story");
    }

}
