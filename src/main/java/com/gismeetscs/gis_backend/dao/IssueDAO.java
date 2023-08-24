package com.gismeetscs.gis_backend.dao;

import java.util.List;

import com.gismeetscs.gis_backend.model.IssueDTO;

public interface IssueDAO {
    public IssueDTO getIssueInfo(int issueId) throws Exception;
    public List<IssueDTO> getIssueList(String issueId) throws Exception;
    public int insertIssue(IssueDTO issueDTO) throws Exception;
    public int updateIssue(IssueDTO issueDTO) throws Exception;
    public int deleteIssue(int issueId) throws Exception;
}
