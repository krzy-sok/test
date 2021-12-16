package krzysztof.pl.test.remote.rest.response;

import java.util.List;

public class HotelsCollctionDto {
    private List<hotelDto> hotels;

    public HotelsCollctionDto() {
    }

    public HotelsCollctionDto(List<hotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<hotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<hotelDto> hotels) {
        this.hotels = hotels;
    }
}
