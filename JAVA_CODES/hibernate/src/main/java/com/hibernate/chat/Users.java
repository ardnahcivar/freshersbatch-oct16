package com.hibernate.chat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class Users {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="userName")
	private String user;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="chat_room_id")
	private ChatRoom chatRoom;

	public Users(String user) {
		this.user = user;
	}
	
	public Users(){
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}
	
	
	
	

}
