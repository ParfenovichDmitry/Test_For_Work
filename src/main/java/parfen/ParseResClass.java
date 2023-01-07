package parfen;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseResClass {
    public static final List<ResClass>RESULT;

    static {
        try {
            RESULT = new ParseResClass().parse(new File("BE_data.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ResClass> parse(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<ResClass> res = new ArrayList<>();

        JsonNode jsonNode = objectMapper.readTree(file);
        JsonNode test = jsonNode.path("Events");


        for (int i = 0; i < test.size(); i++) {
            ResClass resClass = new ResClass();
            resClass.setId(new WorkMethod().getIntId(String.valueOf(test.get(i).get("sport_event_id"))));
            resClass.setData(new WorkMethod().getStringDate(String.valueOf(test.get(i).get("start_date"))));
            resClass.setCity_stadion(new WorkMethod().getNormalString(String.valueOf(test.get(i).get("venue").get("city_name"))));
            resClass.setStadion(String.valueOf(test.get(i).get("venue").get("name")));
            resClass.setTeam1(String.valueOf(test.get(i).get("competitors").get(0).get("name")));
            resClass.setCountry1(new WorkMethod().getNormalString(String.valueOf(test.get(i).get("competitors").get(0).get("country"))));
            resClass.setTeam2(String.valueOf(test.get(i).get("competitors").get(1).get("name")));
            resClass.setCountry2(new WorkMethod().getNormalString(String.valueOf(test.get(i).get("competitors").get(1).get("country"))));
            resClass.setHome(Double.parseDouble((test.get(i).get("probability_home_team_winner")).asText()));
            resClass.setDraw(Double.parseDouble((test.get(i).get("probability_draw")).asText()));
            resClass.setAway(Double.parseDouble((test.get(i).get("probability_away_team_winner")).asText()));
            res.add(resClass);


        }
        return res;
    }
}
