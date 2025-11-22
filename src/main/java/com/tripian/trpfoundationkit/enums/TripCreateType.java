package com.tripian.trpfoundationkit.enums;

public enum TripCreateType {
    EDIT {
        @Override
        public String toString() {
            return "Edit";
        }
    },
    CREATE {
        @Override
        public String toString() {
            return "Create";
        }
    }

}
