package com.ludo.coursespringboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private List<Topic> topics =new ArrayList<>(Arrays.asList(
        new Topic("spirng","Spring Framework","Spring Framework Description"),
        new Topic("java","Core Java","Core Java Description"),
        new Topic("javascript","JavaScript","JavaScript Description")
        ));
    
    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

}
