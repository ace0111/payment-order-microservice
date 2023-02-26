# payment-order-microservice

run as springboot 
	1.server registry
	2.config-server
	3.gateway
	4.order or payment service
	5.HystrixDashboard 

http://localhost:9192/h2-console - H2 < port :9192 of microservice> see logs h2 instance address

http://localhost:8761/ - eureka server

http://localhost:9196/order-service/default - config server

http://localhost:8989/actuator/hystrix.stream - hystrix stream

http://localhost:9195/hystrix - hystrix dashborad 

http://localhost:9200/ - elastic search

http://localhost:5601/ - kibana

edit logstashconfig - logstash

http://localhost:9411/ - zipkin

run zipkin first

## Request for order
'''
POST http://localhost:8989/order/bookOrder

{
    "order": {
        "id": 115,
        "name": "Mobile",
        "qty": 1,
        "price": 180001
    },
    "payment": {}
}
'''
## Request for payment

'''
POST http://localhost:8989/payment/doPayment

{
    "paymentStatus":"success"
}

GET http://localhost:8989/payment/115

'''
