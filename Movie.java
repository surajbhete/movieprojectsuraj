package com.movieflex.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's title!")
    private String title;


    //this is director
    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's director!")
    private  String director;


    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's studio!")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's release year!")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's poster!")
    private String poster;
}
