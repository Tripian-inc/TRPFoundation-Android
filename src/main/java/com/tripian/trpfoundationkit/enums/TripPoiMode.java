package com.tripian.trpfoundationkit.enums;

public enum TripPoiMode {

    ROUTE {
        @Override
        public String toString() {
            return "Route";
        }
    },
    ALTERNATIVE {
        @Override
        public String toString() {
            return "Alternative";
        }
    },
    ROUTE_ALTERNATIVE {
        @Override
        public String toString() {
            return "Route&Alternative";
        }
    },
    PART_OF_DAY {
        @Override
        public String toString() { return "PartOfDay"; }
    },
    STANDARD {
        @Override
        public String toString() {
            return "Standard";
        }
    },
    HOMEBASE {
        @Override
        public String toString() {
            return "Homebase";
        }
    },
    FROM_BUTTERFLY {
        @Override
        public String toString() {
            return "FROM_BUTTERFLY";
        }
    }
}
