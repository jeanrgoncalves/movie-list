package com.movielist.movielist.movie.movieactor.api.dto;

import com.movielist.movielist.actor.api.dto.ActorDTO;
import com.movielist.movielist.genericentitydto.DataTransferObject;
import lombok.*;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MovieActorDTO extends DataTransferObject {

    private UUID id;
    private UUID movieId;
    private ActorDTO actorDTO;

}
