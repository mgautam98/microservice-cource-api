package me.mgautam.courseapi.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    private List<Topic> topics = Arrays.asList(
        new Topic("Java", "JAVA language", "Java lang description"),
        new Topic("C++", "C++ language", "C++ lang description"),
        new Topic("sql", "SQL language", "SQL lang description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

}