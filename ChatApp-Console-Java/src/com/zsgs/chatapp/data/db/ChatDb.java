package com.zsgs.chatapp.data.db;

public class ChatDb {

    private static ChatDb chatDb;

    public ChatDb() {

    }

    public static ChatDb getInstance(){
        if (chatDb == null){
            chatDb = new ChatDb();
        }
        return chatDb;
    }
}
