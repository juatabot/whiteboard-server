package com.example.whiteboard.models;
import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String widget_type;
    private String name;
    private String src;
    private String className;
    private Integer height;
    private Integer width;
    private String topicId;
    private Integer widget_order;
    private String url;

    public Widget(Integer id, String widget_type, String name, String topicId) {
        this.id = id;
        this.widget_type = widget_type;
        this.name = name;
        this.topicId = topicId;
    }

    public Widget(Integer id, String widget_type, String name) {
        this.id = id;
        this.widget_type = widget_type;
        this.name = name;
    }

    public Widget() {
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidget_order() {
        return widget_order;
    }

    public void setWidget_order(Integer widget_order) {
        this.widget_order = widget_order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWidget_type() {
        return widget_type;
    }

    public void setWidget_type(String widget_type) {
        this.widget_type = widget_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}