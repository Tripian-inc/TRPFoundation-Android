package com.tripian.trpfoundationkit.enums;

public enum AddPoiMode {

    LOCALLY {
        @Override
        public String toString() {
            return "LOCALLY";
        }
    },
    TRIP {
        @Override
        public String toString() {
            return "TRIP";
        }
    },
    CHANGE_POI {
        @Override
        public String toString() {
            return "CHANGE_POI";
        }
    }

}
