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
    public String showProjects(Model model) {
        List<Project> projects = this.projectService.getProjects();
        model.addAttribute("projects", projects);
        return "all-projects";
    }

}
