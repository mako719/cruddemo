package com.raisetech.cruddemo;

import java.util.List;

public class TeamServiceImpl implements TeamService{
    private TeamMapper teamMapper;

    public TeamServiceImpl(TeamMapper teamMapper) {
        this.teamMapper = teamMapper;
    }

    public List<Team> findAll() {
        return teamMapper.findAll();
    }

    @Override
    public Team findById(int id) throws Exception {
        return this.teamMapper.findById(id).orElseThrow(() -> new NotFoundURLException("resource not found"));
    }
}
