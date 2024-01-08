package com.location.location.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Movie {
    String movieTitle;
    String description;
    int durationInMins;
    String language;
    String genre;
    Date releaseDate;
    Cast cast;
    Crew crew;
    Votes votes;
}
