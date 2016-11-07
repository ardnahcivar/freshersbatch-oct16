package com.hibernate.chat;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Chat Room")
public class ChatRoom {
	
	@Id
	@GeneratedValue
	@Column(name="chat_room_id")
	private long chat_room_id;
	
	@Column(name="Name of Chatroom")
	private String name;


	@OneToMany(mappedBy = "chatRoom",cascade=CascadeType.ALL)
	private Set<Users> allUsers;

	public ChatRoom(String name) {
		this.name = name;
	}
	
	public ChatRoom(){
		
	}
	public long getChat_room_id() {
		return chat_room_id;
	}

	public void setChat_room_id(long chat_room_id) {
		this.chat_room_id = chat_room_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addToChatList(Users user){
		allUsers.add(user);
	}


	
	
	
	
	

}
	