package parfen;

import lombok.Data;

import java.util.List;

@Data
public class UEFAResult {
    private String sportEventId;
    private String startDate;
    private String sportName;
    private String competitionName;
    private String competitionId;
    private String seasonName;
    private List<Competitor> competitor;
    private Venue venue;
    private Double probabilityHomeTeamWinner;
    private Double probabilityDraw;
    private Double probabilityAwayTeamWinner;
}
