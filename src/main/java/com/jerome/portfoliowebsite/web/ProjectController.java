package com.jerome.portfoliowebsite.web;

import com.jerome.portfoliowebsite.business.ProjectService;
import com.jerome.portfoliowebsite.data.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/all-projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping()
    public String getAllProjects(Model model) {
        List<Project> projects = this.projectService.getProjects();
        model.addAttribute("projects", projects);
        return "all-projects";
    }
    @GetMapping("/portfolio")
    public String getPortfolio(Model model) {
        Project portfolio = this.projectService.getProjectNamed("Portfolio");
        return getProject(portfolio, model);
    }

    @GetMapping("/java follow-along")
    public String getJavaFollowAlong(Model model) {
        Project javaFollowAlong = this.projectService.getProjectNamed("Java Follow-Along");
        return getProject(javaFollowAlong, model);
    }

    private String getProject(Project project, Model model) {
        model.addAttribute("project", project);
        return "project-template";
    }

}
