package com.tripian.trpfoundationkit.enums;

public enum FilterMode {

    RECOMMENDATION {
        @Override
        public String toString() {
            return "Recommendation";
        }
    },
    NEAR_BY {
        @Override
        public String toString() {
            return "Nearby";
        }
    }

}
