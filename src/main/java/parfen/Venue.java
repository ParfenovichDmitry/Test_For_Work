package parfen;

import lombok.Data;

@Data
public class Venue {
    private String id;
    private String name;
    private Integer capacity;
    private String cityName;
    private String countryName;
    private String mapCoordinates;
    private String countryCode;
}
