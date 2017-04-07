package com.dev.event.factory;

import com.dev.event.Event;
import com.dev.event.Follow;

public class FollowFactory implements EventFactory {

	@Override
	public Event create(String type, String[] splitMessage, String message) {
		final int seq = Integer.parseInt(splitMessage[0]);
		final String toUserId = splitMessage[3];
		return new Follow(seq, toUserId, message);
	}

}
