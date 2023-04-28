package org.howard.edu.lsp.finalsycs363.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Morgan Thornton
 */
public class SongsDatabase {

/* Key is the genre, HashSet contains associated songs */
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        HashSet<String> songsSet = (HashSet)getSongs(genre);
        if(songsSet==null){
            songsSet = new HashSet<>();
        }
        songsSet.add(songTitle);
        map.put(genre, songsSet);
    }

  /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.get(genre);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        String genre = "";
        for (Map.Entry<String, HashSet<String>> set : map.entrySet()) {
            Set<String> songsSet = set.getValue();
            if(songsSet.contains(songTitle)){
                genre = set.getKey();
                break;
            }
        }
        return genre;
    }