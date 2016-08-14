package aca.exam.musicplayer;
import java.util.ArrayList;

public class MusicApplication implements Playlist,MusicPlayer {
	private Song currentSong;
	private Song song;
	private Album album;
	private ArrayList<Song> playlist = new ArrayList<Song>();
	private ArrayList<Song> currentPlaylist = new ArrayList<Song>();
	private ArrayList<Song> allSongs = new ArrayList<Song>();
	private ArrayList<Album> allAlbums = new ArrayList<Album>();

	@Override
	public void addSong(Song song) {
		playlist.add(this.song);
		
	}

	@Override
	public void addFromAlbum(Album album, int num) {
		playlist.add(this.album.getSong(num));
	}

	@Override
	public void addWholeAlbum(Album album) {
		playlist.addAll(this.album.songList);
		
	}

	@Override
	public String CurrentSong(Song song) {
		return this.currentSong.toString();
	}

	@Override
	public void playSong(Song song) {
		this.currentSong = song;
		
	}

	@Override
	public void nextSong() {
		int index = currentPlaylist.indexOf(this.currentSong);
		this.currentSong = currentPlaylist.get(index+1);
		
	}

	@Override
	public void previousSong() {
		int index = currentPlaylist.indexOf(this.currentSong);
		this.currentSong = currentPlaylist.get(index-1);
		
	}

	@Override
	public String showArtists(ArrayList<Song> songList){
		String output ="";
		for(Song song: allSongs){
			output = output + song.getArtist() +"/n";
		}
		return output;
	}

	@Override
	public String showSongTitles(ArrayList<Song> songList) {
		String output ="";
		for(Song song: allSongs){
			output = output + song.getArtist() +"/n";
		}
		return output;
		
	}

	@Override
	public String showAlbums(ArrayList<Album> albumList) {
		String output ="";
		for(Album album: allAlbums){
			output = output + album.getTitle() +"/n";
		}
		return output;
	}


}
