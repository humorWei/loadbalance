＃ 负载均衡
myparen：先构建一个parent工程，该工程仅用来定义一个pom文件，后续工程的pom文件的皆继承该pom。在该pom中我们将定义各工程所共同使用的第三方依赖及相应版本
         定义，比如我们接下来的各工程中对Spring Cloud的依赖等。这样我们就可以统一对第三方依赖及基础信息定义进行管理，后续当我们需要升级第三方依赖时，
         只需要修改一个地方就可以了。
eurekaServer_001:构建Eureka Server。
eurekaClient_000/eurekaClient_001/eruekaClient_003：构建Eureka Client。
         Eureka服务器我们已经编写好了，接下来我们就可以编写一个Eureka的客户端了。这个客户端可能是一个服务提供者，也可能是一个服务消费者，甚至两者都是。
eurekaClient_002:构建服务消费者。 
         为了让我们更能够体会到Eureka所发挥的作用，我们下面来构建一个服务消费者，该服务消费者将调用SERVICE-HELLO所提供的服务。
