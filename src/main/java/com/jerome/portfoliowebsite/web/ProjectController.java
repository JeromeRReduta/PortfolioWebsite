package com.jerome.portfoliowebsite.web;

import com.jerome.portfoliowebsite.business.ProjectService;
import com.jerome.portfoliowebsite.data.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/* Controller in charge of all project pages, including all-projects and each individual project template */
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
        return getProject("Portfolio" ,model);
    }

    @GetMapping("top v2")
    public String getTopV2(Model model) {
        return getProject("Top v2" ,model);
    }

    @GetMapping("search engine")
    public String getSearchEngine(Model model) {
        return getProject("Search Engine" ,model);
    }

    @GetMapping("search engine mvc")
    public String getSearchEngineMVC(Model model) {
        return getProject("Search Engine MVC" ,model);
    }

    @GetMapping("react tic-tac-toe")
    public String getReactTicTacToe(Model model) {
        return getProject("React Tic-Tac-Toe" ,model);
    }

    @GetMapping("calculator with logs")
    public String getCalculatorWithLogs(Model model) {
        return getProject("Calculator With Logs", model);
    }

    @GetMapping("bank app")
    public String getBankApp(Model model) {
        return getProject("Bank App", model);
    }

    private String getProject(String name, Model model) {
        Project project = this.projectService.getProjectNamed(name);
        model.addAttribute("project", project);
        return "project-template";
    }

}
