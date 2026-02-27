Project to demonstrate usage of docker and docker compose

## Local development

To build docker image for local purpose run:  

`docker build --target build -t app-runner:local .`

To run application in Debug mode and connect to it for debugging purpose:

First run: `docker build --target production -t app-runner:local .`  

Application will be waiting for a remote debugger connection.  
If you are using IntelliJ add Run/Debug Configuration which points to debugging port (5005) and run it.
Now application should start and you should be able to debug application from IDE.

When you make a change in code just run repeat step:  
`docker build --target production -t app-runner:local .` 