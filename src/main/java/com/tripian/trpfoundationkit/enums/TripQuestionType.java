package com.tripian.trpfoundationkit.enums;

public enum TripQuestionType {

    TRIP {
        @Override
        public String toString() {
            return "trip";
        }
    },
    PROFILE {
        @Override
        public String toString() {
            return "profile";
        }
    },
    COMPANION {
        @Override
        public String toString() {
            return "companion";
        }
    }

}
