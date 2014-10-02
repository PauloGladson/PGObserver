package de.zalando.pgobserver.gatherer;


public class LoadStatsValue {

    public int load_1min;
    public int load_5min;
    public int load_15min;
    public long timestamp;

    public LoadStatsValue(final long time, final int min1, final int min5, final int min15) {
        timestamp = time;
        load_1min = min1;
        load_5min = min5;
        load_15min = min15;
    }

    @Override
    public String toString() {
        return "LoadStatsValue{" +
                "load_1min=" + load_1min +
                ", load_5min=" + load_5min +
                ", load_15min=" + load_15min +
                ", timestamp=" + timestamp +
                '}';
    }
}
