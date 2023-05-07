package com.jerome.portfoliowebsite.data;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GITHUB")
    private String github;

    @Column(name = "SKILLS_USED")
    private String skillsUsed;

    @Column(name = "SUMMARY")
    private String summary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSkillsUsed() {
        return skillsUsed;
    }

    public void setSkillsUsed(String skillsUsed) {
        this.skillsUsed = skillsUsed;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", github='" + github + '\'' +
                ", skillsUsed='" + skillsUsed + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
