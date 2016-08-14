package aca.exam.musicplayer;
import java.util.ArrayList;

public class Album {
	private String albumTitle;
	public ArrayList<Song> songList = new ArrayList<Song>();
	
	public Album(String albumTitle, String artist) {
		this.albumTitle = albumTitle;
	}

	public Album(ArrayList<Song> songList) {
		this.songList = songList;
	}
	
	public Song getSong(int i){
		return songList.get(i);
	}
	
	public String getTitle(){
		return this.albumTitle;
	}
	
}
