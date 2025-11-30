package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        int years = seconds / 31536000;
        seconds %= 31536000;

        int days = seconds / 86400;
        seconds %= 86400;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        List<String> parts = new ArrayList<>();
        if (years > 0) parts.add(years + " year" + (years > 1 ? "s" : ""));
        if (days > 0) parts.add(days + " day" + (days > 1 ? "s" : ""));
        if (hours > 0) parts.add(hours + " hour" + (hours > 1 ? "s" : ""));
        if (minutes > 0) parts.add(minutes + " minute" + (minutes > 1 ? "s" : ""));
        if (seconds > 0) parts.add(seconds + " second" + (seconds > 1 ? "s" : ""));

        if (parts.size() == 1)
            return parts.get(0);

        if (parts.size() == 2)
            return parts.get(0) + " and " + parts.get(1);

        return String.join(", ", parts.subList(0, parts.size() - 1))
                + " and "
                + parts.get(parts.size() - 1);
    }
}
