package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    //private final List<Topic> topics=new ArrayList<>(List.of(new Topic("spring", "spring Framework", "Spring framework description")));

    public List<Topic> getTopics() {
        //return topics;
        List<Topic> topics= new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Optional<Topic> getTopic(String id){
        return topicRepository.findById(id);
    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }
}
