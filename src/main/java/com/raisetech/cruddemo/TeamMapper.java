package com.raisetech.cruddemo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.management.ValueExp;
import java.util.List;
import java.util.Optional;

@Mapper
public interface TeamMapper {
    @Select("SELECT * FROM teams")
    List<Team> findAll();

    @Select("SELECT * FROM teams WHERE id = #{id}")
    Optional<Team> findById(int id);

    @Insert("INSERT INTO teams (id, name, league, founding_year) VALUES (#{id}, #{name}, #{league}, #{founding_year})")
    void createTeam(CreateForm form);
}
