package info.kinhho;

import info.kinhho.grpc.HelloWorldServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new HelloWorldServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
