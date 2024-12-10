package info.kinhho.grpc;

import info.kinhho.helloworld.HelloRequest;
import info.kinhho.helloworld.HelloResponse;
import info.kinhho.helloworld.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloWorldServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        String greeting = "Hello " + request.getName() + " from Huong Dan Java";
        HelloResponse helloResponse = HelloResponse.newBuilder().setMessage(greeting).build();
        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
    }
}
