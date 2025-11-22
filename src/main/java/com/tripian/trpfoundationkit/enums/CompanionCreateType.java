package com.tripian.trpfoundationkit.enums;

public enum CompanionCreateType {
    EDIT {
        @Override
        public String toString() {
            return "EDIT";
        }
    },
    CREATE {
        @Override
        public String toString() {
            return "CREATE";
        }
    }

}
