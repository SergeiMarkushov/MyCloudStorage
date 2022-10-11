package ru.markush.cloud.model;

import java.io.Serializable;

public abstract class  AbstractMessage implements Serializable {
    public abstract MessageType getMessageType();
}
