package com.github.itdaag.memflow.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public final class UsersHandler {

    private final Function<String, User> NEW_USER = s -> new User(s, new ArrayList<>());
    private final Map<String, User> users = new HashMap<>();

    public User get(final String userName) {
        return users.computeIfAbsent(userName, NEW_USER);
    }
}
