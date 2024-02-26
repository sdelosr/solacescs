# Simple Message Processor using Spring Cloud Stream Solace

This is a simple demo of how to make an message and event-based app 
through Spring Cloud Stream Function (Processor pattern) and StreamBridge.
Do note that this is using the Solace Binder implementation.

### Pre-requisites:
1. Solace Event Broker running on Docker (solace-pubsub-standard)
2. Java 17+.
3. If you're not on MacOS, change the localhost port from 55554 -> 55555.