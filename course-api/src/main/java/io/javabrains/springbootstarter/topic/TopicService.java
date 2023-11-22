package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	public List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "spring framework", "spring framework description"),
			new Topic("java","core java","core java description"),
			new Topic("javascript", "javascript", "javascript description")
			));
	
	public List<Topic> getAllTopic()
	{
		return topics;
	}
	public Topic getTopicById(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addtopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
		
		
	}
	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		System.out.println(topic);
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			System.out.println(t);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
			return;	
			
			}
		}
		
	}
	
	
}
