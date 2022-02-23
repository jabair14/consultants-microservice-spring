package com.example.demo.consultant;

public class Consultant {
    private Long id;
    private String name;
    private String email;
    private String location;
    private Integer experience;

    public Consultant() {

    }

    public Consultant(Long id,
                      String name,
                      String email,
                      String location,
                      Integer experience){
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
        this.experience = experience;
    }

    public Consultant(String name,
                      String email,
                      String location,
                      Integer experience) {
        this.name = name;
        this.email = email;
        this.location = location;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", experience=" + experience +
                '}';
    }
}
