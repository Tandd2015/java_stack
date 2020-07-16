import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        MapOfTheHashmatique maMat = new MapOfTheHashmatique();
        HashMap<String, String> oneTrackList = maMat.trackListMaker();
        System.out.println(oneTrackList);
    }
}