package com.raisetech.cruddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    private final TeamMapper teamMapper;

    @Autowired
    public TeamServiceImpl(TeamMapper teamMapper) {
        this.teamMapper = teamMapper;
    }

    @Override
    public List<Team> findAll() {
        return teamMapper.findAll();
    }

    @Override
    public Team findById(int id) {
        return this.teamMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }

    @Override
    public void createTeam(CreateForm form) {
        teamMapper.createTeam(form);
    }

    @Override
    public void updateTeam(int id, UpdateForm form){
        teamMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
        teamMapper.updateTeam(form);
    }

    @Override
    public void deleteTeam(int id){
        teamMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
        teamMapper.deleteTeam(id);
    }
}
