package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Training;

public interface Trainingrepository extends CrudRepository <Training,String> {

}
