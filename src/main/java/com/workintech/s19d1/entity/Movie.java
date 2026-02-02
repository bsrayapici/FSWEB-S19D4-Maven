package com.workintech.s19d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String directorName;
    private int rating;
    private LocalDate releaseDate;

    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors = new ArrayList<>();

    public void addActor(Actor actor) {
        this.actors.add(actor);
        actor.getMovies().add(this);
    }
}