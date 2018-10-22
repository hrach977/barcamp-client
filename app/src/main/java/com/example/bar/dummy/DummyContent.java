package com.example.bar.dummy;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Workshop " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details of Workshop: ").append(position);
        builder.append(System.getProperty("line.separator"));
        builder.append("Speaker: ");
        builder.append(System.getProperty("line.separator"));
        builder.append("Topic: ");
        builder.append(System.getProperty("line.separator"));

//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
        return builder.toString();
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details; //this should be the Workshop Object
        public Workshop workshop;

        public DummyItem(String id, String content, String details, Workshop workshop) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.workshop = workshop;
        }

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    //the actual Workshop object that should be in each DummyItem, to show the workshop info
    public static class Workshop {
        public String speaker;
        public String topic;

        public Workshop(String speaker, String topic) {
            this.speaker = speaker;
            this.topic = topic;
        }
    }
}
