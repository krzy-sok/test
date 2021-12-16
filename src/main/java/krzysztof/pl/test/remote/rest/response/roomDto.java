package krzysztof.pl.test.remote.rest.response;

public class roomDto {
    private Integer id;
    private Integer beds;
    private Double price;

    public roomDto() {
    }

    public roomDto(Integer id, Integer beds, Double price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
