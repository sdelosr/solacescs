# Simple Message Processor using Spring Cloud Stream Solace

This is a simple demo of how to make an message and event-based app 
through Spring Cloud Stream Function (Processor pattern) and StreamBridge.
Do note that this is using the Solace Binder implementation.

### Pre-requisites:
1. Solace Event Broker running on Docker (solace-pubsub-standard)
2. Java 17+.
3. If you're not on MacOS, change the localhost port from 55554 -> 55555.

_For Win/Linux:_
`docker run -d -p 8080:8080 -p 55555:55555 -p 8008:8008 -p 1883:1883 -p 8000:8000 -p 5672:5672 -p 9000:9000 -p 2222:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard`

_For MacOS:_
`docker run -d -p 8080:8080 -p 55554:55555 -p 8008:8008 -p 1883:1883 -p 8000:8000 -p 5672:5672 -p 9000:9000 -p 2222:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard`

_For Codespace:_
`docker run -d -p 8080:8080 -p 55555:55555 -p 8008:8008 -p 1883:1883 -p 8000:8000 -p 5672:5672 -p 9000:9000 -p 2223:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard`
