package com.pluralsight.courseinfo.cli.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Duration;
import java.time.LocalTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PluralsightCourse(
        String id,
        String title,
        String duration,
        String contentUrl,
        boolean isRetired) {

    public long durationInMinutes() {
        return Duration.between(
                LocalTime.MIN,
                LocalTime.parse(duration())
        ).toMinutes();
    }
}

/* Java 8 way of doing this
public class PluralsightCourse {
    private String id;
    private String title;
    private String duration;
    private String contentUrl;
    private boolean isRetired;
    private String status;
    private String level;
    private boolean isNew;

    public PluralsightCourse(String id, String title, String duration, String contentUrl,
                             boolean isRetired, String status, String level, boolean isNew) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.contentUrl = contentUrl;
        this.isRetired = isRetired;
        this.status = status;
        this.level = level;
        this.isNew = isNew;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public String getStatus() {
        return status;
    }

    public String getLevel() {
        return level;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
}
*/