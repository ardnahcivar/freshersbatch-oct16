package com.hibernate.chat;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		Configuration cfg = new Configuration();
		cfg.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		int dec = -1;
		do{
			System.out.println("1.create a user");
			System.out.println("1.switch to chat room");
			System.out.println("enter your choice");
			ch = sc.nextInt();
			switch(ch){
			case 1:
					Users users =new Users();
					System.out.println("enter the name");
					String u_name =sc.next();
					users.setUser(u_name);
					System.out.println("create chat room");
					ChatRoom chatRoom  = new ChatRoom();
					System.out.println("enter the name of chat room");
					String nameOFChatroom = sc.next();
					chatRoom.setName(nameOFChatroom);
					System.out.println("switching to the chat room");
					//chatRoom.addToChatList(users);
					session.persist(chatRoom);		
			}
			System.out.println("if u want to continue");
			System.out.println("press 1, 0 to end");
			dec = sc.nextInt();
			
		}while(dec != 0);
	}

}
