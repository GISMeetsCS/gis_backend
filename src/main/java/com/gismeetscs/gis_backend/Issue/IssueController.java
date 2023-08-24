package com.gismeetscs.gis_backend.Issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "issue")
public class IssueController {
    
    @Autowired
    IssueRepository issueRepository;

    @PostMapping(value = "create")
    public boolean create(Issue issue){
        issueRepository.save(issue);
        return true;
    }

}
