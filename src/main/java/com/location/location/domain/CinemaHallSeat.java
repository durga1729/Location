package com.location.location.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CinemaHallSeat {
    int seatRow;
    int seatColumn;
    SeatType seatType;
}
