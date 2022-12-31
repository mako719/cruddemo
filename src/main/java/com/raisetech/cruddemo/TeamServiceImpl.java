package com.raisetech.cruddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService{
    private TeamMapper teamMapper;

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
}
