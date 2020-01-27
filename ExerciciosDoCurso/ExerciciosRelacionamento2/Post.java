package ExerciciosRelacionamento2;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private Date moment = new Date();
	private String title;
	private String content;
	private int likes;
	private ArrayList<Comment> comments;
	
	public Post() {
		comments = new ArrayList<>();
	}
	public Comment getComment(int i) {
		return this.comments.get(i);
	}
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	public void remComment(Comment comment) {
		this.comments.remove(comment);
	}
	public int quantity() {
		return this.comments.size();
	}
	
	public void setPost(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void setMoment(Date moment){
		this.moment = moment;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public void setLikes(int like){
		this.likes = like;
	}
	
		public Date getMoment(){
		return moment;
	}
	
	public String getTitle(){
		 return title;
	}
	
	public String getContent(){
		return content;
	}
	
	public int getLikes(){
		return likes;
	}
	
	
	
	
}
