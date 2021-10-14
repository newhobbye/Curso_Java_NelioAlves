package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post120 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private List<Coment120> coments = new ArrayList<>();
	private Integer likes;
	
	public Post120() {
		
	}

	public Post120(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Coment120> getComents() {
		return coments;
	}
	
	public void addComent(Coment120 coment) { //metodo para adicionar comentarios.
		coments.add(coment);
	}
	
	public void removeComent(Coment120 coment) { //metodo para remover comentarios.
		coments.remove(coment);
	}


	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(likes);
		sb.append("Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Coments:\n");
		for(Coment120 c: coments) {
			sb.append(c.getComent() + "\n");}
		return sb.toString();
		}
	
	
	

}
