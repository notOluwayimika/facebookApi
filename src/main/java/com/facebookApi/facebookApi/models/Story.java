package com.facebookApi.facebookApi.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="story")
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String heading;
    private String body;
    private List<String> sharedWith;
    private String accessType;

    public Story() {
    }

    public Story( String heading, String body, List<String> sharedWith, String accessType) {
        this.heading = heading;
        this.body = body;
        this.sharedWith = sharedWith;
        this.accessType = accessType;
    }

    public Long getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public List<String> getSharedWith() {
        return sharedWith;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSharedWith(List<String> sharedWith) {
        this.sharedWith = sharedWith;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
}
