package com.raisetech.cruddemo;

import org.apache.ibatis.annotations.*;

import javax.management.ValueExp;
import java.util.List;
import java.util.Optional;

@Mapper
public interface TeamMapper {
    @Select("SELECT * FROM teams")
    List<Team> findAll();

    @Select("SELECT * FROM teams WHERE id = #{id}")
    Optional<Team> findById(int id);

    @Insert("INSERT INTO teams (id, name, league, founding_year) VALUES (#{id}, #{name}, #{league}, #{foundingYear})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createTeam(CreateForm form);

    @Update("UPDATE teams SET name = #{name}, league = #{league}, founding_year = #{foundingYear} WHERE id = #{id}")
    void updateTeam(UpdateForm form);

    @Delete("DELETE FROM teams WHERE id = #{id}")
    void deleteTeam(int id);
}
