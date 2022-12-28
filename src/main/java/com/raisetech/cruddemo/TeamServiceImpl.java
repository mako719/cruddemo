package com.raisetech.cruddemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService{
    private TeamMapper teamMapper;

    public TeamServiceImpl(TeamMapper teamMapper) {
        this.teamMapper = teamMapper;
    }

    @Override
    public List<Team> findAll() {
        return teamMapper.findAll();
    }

    @Override
    public Team findById(int id) throws Exception {
        return this.teamMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }
}
