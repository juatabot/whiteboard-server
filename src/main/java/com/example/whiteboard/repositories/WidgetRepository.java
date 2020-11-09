package com.example.whiteboard.repositories;

import com.example.whiteboard.models.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WidgetRepository extends CrudRepository<Widget, Integer> {

    @Query(value = "SELECT * FROM widget WHERE topic_id=:topicId", nativeQuery = true)
    public List<Widget> findWidgetsForTopic(@Param("topicId") String topicId);
}
