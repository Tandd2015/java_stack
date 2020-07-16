import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public HashMap<String, String>trackListMaker(){
    HashMap<String, String> trackList = new HashMap<String, String>();
    int count = 0;
    String printTrackList = "";
    trackList.put("trackTitle 1", "trackTitle 1 track lyrics 1 !");
    trackList.put("trackTitle 2", "trackTitle 2 track lyrics 2 !");
    trackList.put("trackTitle 3", "trackTitle 3 track lyrics 3 !");
    trackList.put("trackTitle 4", "trackTitle 4 track lyrics 4 !");
    
    String luckyTrack = trackList.get("trackTitle 3");
    System.out.println(luckyTrack);
    
    Set<String> tracks = trackList.keySet();
    for(String track : tracks){
        if(count == 0) {
            printTrackList.concat("Track Title: ").concat(track).concat(", ");
            count += 1;
        } else {
            printTrackList.concat("Track Lyrics: ").concat(track);
            count = 0;
        }
    }
    System.out.println(printTrackList);
    return trackList;
    }
}