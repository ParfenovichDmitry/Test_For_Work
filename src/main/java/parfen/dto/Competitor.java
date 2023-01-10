package parfen.dto;

import lombok.Data;

@Data
public class Competitor {
    private String id;
    private String name;
    private String country;
    private String countryCode;
    private String abbreviation;
    private String qualifier;
    private String gender;
}
