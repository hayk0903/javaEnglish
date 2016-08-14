package aca.exam.musicplayer;

public class Song implements Comparable<Song> {
	private String artist;
	private String songTitle;
	private String songGendre;
	private double songDuration;
	private int songRating;
	
	public Song(String artist, String songTitle, String songGendre, double songDuration) {
		this.artist = artist;
		this.songTitle = songTitle;
		this.songGendre = songGendre;
		this.songDuration = songDuration;
	}
	
	
	private int getSongRating() {
		return songRating;
	}


	public void rateSong(int songRating){
		this.songRating = songRating;
	}

	

	public String getSongTitle() {
		return songTitle;
	}



	public String getArtist() {
		return artist;
	}


	@Override
	public String toString() {
		return "Song [artist=" + artist + ", songTitle=" + songTitle + ", songGendre=" + songGendre + ", songDuration="
				+ songDuration + ", songRating=" + songRating + "]";
	}



	@Override
	public int compareTo(Song other) {
		return this.getSongRating() - other.getSongRating();
	}
	

}
