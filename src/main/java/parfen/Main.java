package parfen;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import static parfen.ParseResClass.RESULT;

public class Main implements GetRezults{


    public static void main(String[] args) throws IOException, ParseException {


        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to look for?");
        System.out.println("If you want to observe result enter 1");
        System.out.println("If you want to observe team list enter 2");
        int changeNumber= sc.nextInt();
        if (changeNumber==1){
            System.out.println("Enter number of results");
            int n = sc.nextInt();
            while (n<0 || n > RESULT.size()){

                System.out.println("Incorrect number/Please try again. Number must by from 0 to "+(RESULT.size()-1));
                n = sc.nextInt();

            }
            FinishClass.topNRezults(RESULT,n);
        } else if (changeNumber==2) {
            FinishClass.getUnikSortByAlphabet(RESULT)
                    .forEach(System.out::println);
        }
    }


//        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File("BE_data.json");
//        JsonNode jsonNode = objectMapper.readTree(file);
//        JsonNode test = jsonNode.path("Events");
//        List<ResClass> res = new ArrayList<>();
//
//        for(int i = 0; i< test.size(); i++){
//            ResClass resClass = new ResClass();
//            resClass.setData(String.valueOf(test.get(i).get("start_date")));
//            resClass.setStadion(String.valueOf(test.get(i).get("venue").get("name")));
//            resClass.setTeam1(String.valueOf(test.get(i).get("competitors").get(0).get("name")));
//            resClass.setTeam2(String.valueOf(test.get(i).get("competitors").get(1).get("name")));
//            resClass.setHome(Double.parseDouble((test.get(i).get("probability_home_team_winner")).asText()));
//            res.add(resClass);
//
//        }



//
//        ResClass resClass = new ResClass();
//        resClass.setData(String.valueOf(test.get(0).get("start_date")));
//        resClass.setStadion(String.valueOf(test.get(0).get("venue").get("name")));
//        resClass.setTeam1(String.valueOf(test.get(0).get("competitors").get(0).get("name")));
//        resClass.setTeam2(String.valueOf(test.get(0).get("competitors").get(1).get("name")));
//        resClass.setHome(Double.parseDouble((test.get(0).get("probability_home_team_winner")).asText()));
//        res.add(resClass);
//
//        ResClass resClass2 = new ResClass();
//        resClass2.setData(String.valueOf(test.get(1).get("start_date")));
//        resClass2.setStadion(String.valueOf(test.get(1).get("venue").get("name")));
//        resClass2.setTeam1(String.valueOf(test.get(1).get("competitors").get(0).get("name")));
//        resClass2.setTeam2(String.valueOf(test.get(1).get("competitors").get(1).get("name")));
//        resClass2.setHome(Double.parseDouble((test.get(1).get("probability_home_team_winner")).asText()));
//
//        res.add(resClass2);
       // System.out.println(res.get(5).getTeam1());






    @Override
    public void getResults() {

    }
}
