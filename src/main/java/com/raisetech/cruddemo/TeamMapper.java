package com.raisetech.cruddemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TeamMapper {
    @Select("SELECT * FROM teams")
    List<Team> findAll();

    @Select("SELECT * FROM teams WHERE id = #{id}")
    Optional<Team> findById(int id);
}
