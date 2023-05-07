package com.jerome.portfoliowebsite.business;

import com.jerome.portfoliowebsite.data.Project;
import com.jerome.portfoliowebsite.data.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>(
                this.projectRepository.findAll()
        );
        projects.sort(Comparator.comparing(Project::getName));
        return projects;
    }


}
