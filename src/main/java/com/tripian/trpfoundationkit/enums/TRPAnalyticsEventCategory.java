package com.tripian.trpfoundationkit.enums;

public enum TRPAnalyticsEventCategory {

    CREATE_TRIP_INFO {
        @Override
        public String toString() {
            return "create_trip_info";
        }
    },
    EDIT_TRIP_INFO {
        @Override
        public String toString() {
            return "edit_trip_info";
        }
    },
    DELETE_TRIP_INFO {
        @Override
        public String toString() {
            return "delete_trip_info";
        }
    },
    USER_LOCATION {
        @Override
        public String toString() {
            return "user_location";
        }
    },
    LOGOUT {
        @Override
        public String toString() {
            return "logout";
        }
    },
    MAP_VIEW_INFO {
        @Override
        public String toString() {
            return "map_view_info";
        }
    },
    ADD_FAVORITE_INFO {
        @Override
        public String toString() {
            return "add_favorite_info";
        }
    },
    REMOVE_FAVORITE_INFO {
        @Override
        public String toString() {
            return "remove_favorite_info";
        }
    },
    //CUSTOM ALERT
    CUSTOM_ALERT {
        @Override
        public String toString() {
            return "custom_alert";
        }
    }
}
