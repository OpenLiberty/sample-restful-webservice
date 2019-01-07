![](https://github.com/OpenLiberty/open-liberty/blob/master/logos/logo_horizontal_light_navy.png)

This sample application is a simple JAX-RS Restful web service.

## Navigate to the sample-rest-lillibrary directory
	cd sample-rest-lillibrary

## Start the OpenLiberty server
    mvn clean package liberty:run-server

## Run microprofile Open API to test the application 
    http://localhost:9080/openaip/ui/

## Optional:  Continue and exectute the microprofile rest client 
This sample demonstrates a microprofile rest client configuration using a simple JAX-RS Restful web service.

## Prerequisite:
	Ensure that the simple JAX-RS Restful web service sample above has been installed and that the server at localhost:9080 is currently running

## Start the OpenLiberty server
    mvn clean package liberty:run-server


### Run microprofile Open API to test the application 
    http://localhost:9081/client/test
