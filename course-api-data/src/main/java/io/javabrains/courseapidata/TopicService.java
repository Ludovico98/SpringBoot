package io.javabrains.courseapidata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics =new ArrayList<>(Arrays.asList(
        new Topic("spring","Spring Framework","Spring Framework Description"),
        new Topic("java","Core Java","Core Java Description"),
        new Topic("javascript","JavaScript","JavaScript Description")
        ));
    
    public List<Topic> getAllTopics()
    {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;

    }

    public Topic getTopic(String id)
    {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        
        if(optionalTopic.isPresent())
            return optionalTopic.get();
        return null;


    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic)
    {

        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }

}
