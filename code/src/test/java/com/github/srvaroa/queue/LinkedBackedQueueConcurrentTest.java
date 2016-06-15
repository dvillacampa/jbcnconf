package com.github.srvaroa.queue;

public class LinkedBackedQueueConcurrentTest extends QueueConcurrentTest {
    @Override
    Queue<Long> getInstance(int capacity) {
        return new LinkedBackedQueue<>(capacity);
    }
}
