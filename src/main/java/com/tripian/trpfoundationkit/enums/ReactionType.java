package com.tripian.trpfoundationkit.enums;

public enum ReactionType {

    THUMBS_UP {
        @Override
        public String toString() {
            return "Thumbs Up";
        }
    },
    THUMBS_DOWN {
        @Override
        public String toString() {
            return "Thumbs Down";
        }
    },
    NEUTRAL {
        @Override
        public String toString() {
            return "NEUTRAL";
        }
    }
}
