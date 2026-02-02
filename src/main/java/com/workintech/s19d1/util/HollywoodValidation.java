package com.workintech.s19d1.util;

import com.workintech.s19d1.entity.Actor;
import com.workintech.s19d1.exceptions.ApiException;
import org.springframework.http.HttpStatus;

public class HollywoodValidation {

    public static void validateActorForSave(Actor actor) {
        if (actor.getMovies() == null || actor.getMovies().isEmpty()) {
            throw new ApiException(
                    "Actor must have at least one movie",
                    HttpStatus.BAD_REQUEST
            );
        }
    }
}