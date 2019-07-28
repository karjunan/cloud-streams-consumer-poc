package com.grpc.server.consumer;

import org.apache.avro.generic.GenericRecord;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;
import org.springframework.context.annotation.Configuration;

@EnableBinding(Sink.class)
@Configuration
@EnableSchemaRegistryClient
public class CloudStreamProcessor {

    @StreamListener(Processor.INPUT)
    public void inputTopic(GenericRecord input) {

        
        System.out.println("Received Input => " + input);
    }

}
