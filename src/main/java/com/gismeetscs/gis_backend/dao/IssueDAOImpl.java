package com.gismeetscs.gis_backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gismeetscs.gis_backend.model.IssueDTO;

@Repository
public class IssueDAOImpl implements IssueDAO {

    @Override
    public IssueDTO getIssueInfo(int issueId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIssueInfo'");
    }

    @Override
    public List<IssueDTO> getIssueList(String issueId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIssueList'");
    }

    @Override
    public int insertIssue(IssueDTO issueDTO) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertIssue'");
    }

    @Override
    public int updateIssue(IssueDTO issueDTO) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateIssue'");
    }

    @Override
    public int deleteIssue(int issueId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIssue'");
    }
    
}
