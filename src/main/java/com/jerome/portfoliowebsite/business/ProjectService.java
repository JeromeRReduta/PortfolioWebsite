package com.jerome.portfoliowebsite.business;

import com.jerome.portfoliowebsite.data.Project;
import com.jerome.portfoliowebsite.data.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.*;

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
        Comparator<Project> newestToOldest = Comparator.comparing(Project::getId).reversed();
        projects.sort(newestToOldest);
        return projects;
    }

    public Project getProjectNamed(String name) {
        Map<String, Project> projects = new HashMap();
        List<Project> searchResults = new ArrayList<>(
                this.projectRepository.findAll()
        );
        searchResults.forEach( project ->
            projects.put(project.getName(), project)
        );
        return projects.get(name);
    }


}
