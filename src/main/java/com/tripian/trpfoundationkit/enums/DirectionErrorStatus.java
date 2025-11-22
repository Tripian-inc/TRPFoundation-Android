package com.tripian.trpfoundationkit.enums;

/**
 * This Enum should be used to set error status in MapBox Directions.
 */
public enum DirectionErrorStatus {
    NONE {
        @Override
        public String toString() {
            return "NONE";
        }
    },
    WALKING {
        @Override
        public String toString() {
            return "WALKING";
        }
    },
    AUTOMOBILE {
        @Override
        public String toString() {
            return "AUTOMOBILE";
        }
    }

}
