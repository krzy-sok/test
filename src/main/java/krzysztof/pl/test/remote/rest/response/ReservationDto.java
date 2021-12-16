package krzysztof.pl.test.remote.rest.response;

import krzysztof.pl.test.domain.model.Status;

import krzysztof.pl.test.remote.rest.request.hotelReservationDto;

public class ReservationDto {
    private Integer id;
    private Status status;
    private hotelReservationDto reservationInfo;
}
