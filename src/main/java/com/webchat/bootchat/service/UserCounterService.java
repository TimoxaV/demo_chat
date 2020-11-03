package com.webchat.bootchat.service;

public class UserCounterService {
    private static int activeUsersCount = 0;

    public static void addUser() {
        activeUsersCount++;
    }

    public static void removeUser() {
        if (activeUsersCount > 0) {
            activeUsersCount--;
        }
    }

    public static int getActiveUsers() {
        return activeUsersCount;
    }
}
