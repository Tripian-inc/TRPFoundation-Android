package com.tripian.trpfoundationkit.enums;

/**
 * This Enum should be used to create MapBox Directions Profile.
 */
public enum DirectionProfile {
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
