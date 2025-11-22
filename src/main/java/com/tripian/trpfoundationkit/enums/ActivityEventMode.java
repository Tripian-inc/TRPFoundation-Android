package com.tripian.trpfoundationkit.enums;

public enum ActivityEventMode {

    OPEN_USER_PROFILE_ACTIVITY {
        @Override
        public String toString() {
            return "OPEN_USER_PROFILE_ACTIVITY";
        }
    },
    LOG_OUT {
        @Override
        public String toString() {
            return "LOG_OUT";
        }
    },
    LOG_IN {
        @Override
        public String toString() {
            return "LOG_IN";
        }
    },
    REGISTER {
        @Override
        public String toString() {
            return "REGISTER";
        }
    },
    CUSTOM_ALERT {
        @Override
        public String toString() { return "CUSTOM_ALERT"; }
    }
}
