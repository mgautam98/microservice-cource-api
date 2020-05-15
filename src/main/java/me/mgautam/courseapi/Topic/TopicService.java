package me.mgautam.courseapi.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("java", "JAVA language", "Java lang description"),
        new Topic("c++", "C++ language", "C++ lang description"),
        new Topic("sql", "SQL language", "SQL lang description"),
        new Topic("spring", "Spring framework", "Spring framework description")
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

    public void updateTopic(String id, Topic topic){

        for (int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);

            if(t.getId().equals(id)){
                topics.set(i, topic);
            }
        }
    }

}