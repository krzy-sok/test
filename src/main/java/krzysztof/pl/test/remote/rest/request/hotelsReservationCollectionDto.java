package krzysztof.pl.test.remote.rest.request;

import java.util.List;

public class hotelsReservationCollectionDto {
    private List<hotelReservationDto> rooms;
    private personReservationDto person;

    public hotelsReservationCollectionDto() {
    }

    public hotelsReservationCollectionDto(List<hotelReservationDto> rooms, personReservationDto person) {
        this.rooms = rooms;
        this.person = person;
    }

    public List<hotelReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<hotelReservationDto> rooms) {
        this.rooms = rooms;
    }

    public personReservationDto getPerson() {
        return person;
    }

    public void setPerson(personReservationDto person) {
        this.person = person;
    }
}
