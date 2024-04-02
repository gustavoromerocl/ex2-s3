package com.example.moviesdbsrv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviesdbsrv.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
