package com.example.whiteboard.services;

import com.example.whiteboard.models.Widget;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WidgetService {
    List<Widget> widgetList = new ArrayList<>();

    public Widget createWidget(Widget widget) {
        String newId = (new Date()).toString();
        widget.setId(newId);
        widget.setOrder(0);
        widgetList.add(widget);
        return widget;
    }

    public List<Widget> findWidgetsForTopic(String tid) {
        List<Widget> widgetsForTopic = new ArrayList<Widget>();
        for(Widget w: widgetList) {
            if(w.getTopicId().equals(tid)) {
                widgetsForTopic.add(w);
            }
        }
        return widgetsForTopic;
    }

    public Integer updateWidget(String widgetId, Widget newWidget) {
        for (int i = 0; i < widgetList.size(); i++) {
            if (widgetList.get(i).getId().equals(widgetId)) {
                widgetList.set(i, newWidget);
                return 1;
            }
        }
        return 0;
    }

    public List<Widget> findAllWidgets() {
        return widgetList;
    }

    public Widget findWidgetById(String widgetId) {
        for(Widget w: widgetList) {
            if(w.getId().equals(widgetId)) {
                return w;
            }
        }
        return null;
    }

    public Integer deleteWidget(String widgetId) {
        for (int i = 0; i < widgetList.size(); i++) {
            if (widgetList.get(i).getId().equals(widgetId)){
                widgetList.remove(i);
                return 1;
            }
        }
        return 0;
    }
}
