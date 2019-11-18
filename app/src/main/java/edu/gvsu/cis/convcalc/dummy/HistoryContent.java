package edu.gvsu.cis.convcalc.dummy;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class HistoryContent {



    public static final List<HistoryItem> ITEMS = new ArrayList<HistoryItem>();

    public static void addItem(HistoryItem item) {
        ITEMS.add(item);
    }

    /*
    static {
        DateTime now = DateTime.now();
        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.minusDays(1).toString()));
        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.minusDays(1).toString()));
        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.plusDays(1).toString()));
        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.plusDays(1).toString()));
    }
     */


    public static class HistoryItem {
        public Double fromVal;
        public Double toVal;
        public String mode;
        public String fromUnits;
        public String toUnits;

        public String timestamp;
        public String _key;

        public HistoryItem(){

        }

        public HistoryItem(Double fromVal, Double toVal, String mode,
                           String fromUnits, String toUnits, String timestamp) {
            this.fromVal = fromVal;
            this.toVal = toVal;
            this.mode = mode;
            this.fromUnits = fromUnits;
            this.toUnits = toUnits;
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return this.fromVal + " " + this.fromUnits + " = " + this.toVal + " " + this.toUnits;
        }
    }
}

