package com.raisetech.cruddemo;

import java.util.List;

public interface TeamService {
    List<Team> findAll();

    Team findById(int id) throws Exception;

    void createTeam(CreateForm form);

    void updateTeam(int id, UpdateForm form);
}
