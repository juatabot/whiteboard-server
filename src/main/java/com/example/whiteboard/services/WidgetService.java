package com.example.whiteboard.services;

import com.example.whiteboard.models.Widget;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WidgetService {
    List<Widget> widgetList = new ArrayList<>();

    {
        widgetList.add(new Widget("123", "HTML", "Widget 1", "topic123"));
        widgetList.add(new Widget("234", "YOU_TUBE", "Widget 2", "topic123"));
        widgetList.add(new Widget("345", "SLIDE", "Widget 3", "topic123"));
        widgetList.add(new Widget("456", "HEADER", "Widget 4", "topic123"));
        widgetList.add(new Widget("567", "HEADING", "Widget A", "topic234"));
        widgetList.add(new Widget("678", "PARAGRAPH", "Widget B", "topic234"));
    }

    public Widget createWidget(Widget widget) {
        String newId = (new Date()).toString();
        widget.setId(newId);
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
        for(Widget w: widgetList) {
            if (w.getId().equals(widgetId)){
                w = newWidget;
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
        for(Widget w: widgetList) {
            if (w.getId().equals(widgetId)){
                widgetList.remove(w);
                return 1;
            }
        }
        return 0;
    }

}
