/* (c) 2006-2009 Oracle.  All rights reserved. */
package com.bea.wlevs.example.helloworld;

import pojo.Average;

import com.bea.wlevs.ede.api.StreamSink;
import com.bea.wlevs.event.example.helloworld.HelloWorldEvent;

public class HelloWorldBean implements StreamSink {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bea.wlevs.ede.api.StreamSink#onInsertEvent(java.lang.Object)
	 */
	public void onInsertEvent(Object event) {
		if (event instanceof Average) {
			Average averageEvent = (Average) event;
			System.out.println("Message: " + averageEvent);
		}
		// if (event instanceof HelloWorldEvent) {
		// HelloWorldEvent helloWorldEvent = (HelloWorldEvent) event;
		// System.out.println("Message: " + helloWorldEvent.getMessage());
		// }
	}
}
