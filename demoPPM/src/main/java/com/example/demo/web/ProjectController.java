package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Project;
import com.example.demo.services.ProjectService;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@PostMapping("")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project){
		Project _project = projectService.SaveRUpdateProject(project);
		return new ResponseEntity<Project>(_project,HttpStatus.CREATED);
	}
}
