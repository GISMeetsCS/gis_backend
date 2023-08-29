package com.gismeetscs.gis_backend.Issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@Api(tags="Issue")
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

    @GetMapping(value = "find")
    public Issue find(int issueId){
        Issue issue = issueRepository.findById(issueId).get();
        return issue;
    }

    @PutMapping(value = "modify")
    public boolean modify(Issue issue){
        issueRepository.save(issue);
        return true;
    }

    @DeleteMapping(value = "delete")
    public boolean delete(Issue issue){
        issueRepository.delete(issue);
        return true;
    }

}
