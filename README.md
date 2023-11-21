# springboot-hystrix-circuit-breaker
A Simple springboot Hystrix example explaining how Circuit Breaker Pattern Behaves


1. start the client-app project on port http://localhost:9000/client-app?client-id=HystrixApp

2. start the circuit-breaker project on port http://localhost:8080/circuit-breaker, it will give output from fallback method defined in the project (as I have simulated an error in the service class)

3. Open the histrix Dashboard @ 8080/hytrix and provide the url http://localhost:8080/hystrix.stream inorder to stream the ping services in a graphical interface @ http://localhost:8080/hystrix
