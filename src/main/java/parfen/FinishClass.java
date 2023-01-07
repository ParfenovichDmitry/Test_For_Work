package parfen;

import java.util.*;

public class FinishClass extends WorkMethod {
    static Analiz analiz = new Analiz();
    String date;



    public static void topNRezults(List<ResClass> list, int n){
        HashMap<Integer,Double> map = Analiz.sortByValue(analiz.getTop(list));
        List<Integer>sotr =new ArrayList<>();
        for (Map.Entry <Integer,Double> entry: map.entrySet()){
            sotr.add(entry.getKey());
        }
        List<ResClass> endPoint = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (ResClass res:list){
                if(sotr.get(i)==res.getId()){
                    endPoint.add(res);
                    break;
                }
            }
        }

        String str = null;
        for (ResClass res: endPoint){
            if (Math.max((Math.max(res.getHome(),res.getDraw())),res.getAway())==res.getHome()){
               str = MaxWin.HOME_TEAM_WIN+"("+res.getHome()+")";
            } else if (Math.max((Math.max(res.getHome(),res.getDraw())),res.getAway())==res.getAway()) {
                str = MaxWin.AWAY_TEAM_WIN+"("+res.getAway()+")";
            } else if (Math.max((Math.max(res.getHome(),res.getDraw())),res.getAway())==res.getDraw()) {
                str = MaxWin.DRAW+"("+res.getDraw()+")";
            }


            System.out.println("Start date: "+res.getData()+","+"\n"
                    +res.getTeam1()+" "+res.getCountry1()+" vs. "+res.getTeam2()+" "+res.getCountry2()+","+"\n"
                    +res.getCity_stadion()+" "+res.getStadion()+","+"\n"+"Highest probable result : "+
                    str);

            System.out.println();

        }

    }
    public static TreeSet<String> getUnikSortByAlphabet(List<ResClass>res){
        TreeSet<String> set = new TreeSet<>();
        for (ResClass team:res){
            set.add(team.getTeam1());
            set.add(team.getTeam2());
        }
        return set;
    }

}
