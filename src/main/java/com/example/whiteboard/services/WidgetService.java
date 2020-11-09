package com.example.whiteboard.services;

import com.example.whiteboard.models.Widget;
import com.example.whiteboard.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class WidgetService {
    @Autowired
    WidgetRepository widgetRepository;

    public Widget createWidget(Widget widget) {
        return widgetRepository.save(widget);
    }

    public List<Widget> findWidgetsForTopic(String tid) {
        return widgetRepository.findWidgetsForTopic(tid);
    }

    public Widget updateWidget(Integer widgetId, Widget newWidget) {
        Widget widget = widgetRepository.findById(widgetId).get();
        BeanUtils.copyProperties(newWidget, widget);
        return widgetRepository.save(widget);
    }

    public List<Widget> findAllWidgets() {
        return (List<Widget>) widgetRepository.findAll();
    }

    public Widget findWidgetById(Integer widgetId) {
        return widgetRepository.findById(widgetId).get();
    }

    public void deleteWidget(Integer widgetId) {
        widgetRepository.deleteById(widgetId);
    }
}
