package parfen;

import java.util.List;
import java.util.TreeSet;

public class WorkMethod implements GetRezults {

    public String getNormalString(String s){
        return s.substring(1,s.length()-1);
    }

    public String getStringDate(String s) {
        s = s.substring(1,s.indexOf('T'))+" "+s.substring(s.indexOf('T')+1,s.indexOf('+'));
        return s;
    }
    public int getIntId(String s){
        return Integer.parseInt(s.substring(s.lastIndexOf(':')+1,s.length()-1));
    }
    public  TreeSet<String> teamAlpha(List<ResClass>res){
        TreeSet<String>team = new TreeSet<>();
        for (ResClass re : res) {
            team.add(re.getTeam1());
            team.add(re.getTeam2());
        }
        return team;
    }

    @Override
    public void getResults() {

    }
}
