package consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class Consumer {

    @KafkaListener(topics = "${cloudkarafka.topic}")
    public void processMessage(String message,
                               @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
                               @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
                                System.out.println("---------------------------------------------------");
    	System.out.println("|\t\tTopic\t\t|\tPartitions\t|\tOffset\t\t|\tMessage\t\t|");
    	System.out.print("------------------------------------------------------");
    	System.out.println("---------------------------------------------------");
    	System.out.println("|\t"+topics.get(0)+"\t|\t"+partitions.get(0)+"\t\t|\t"+offsets.get(0)+"\t\t|\t"+message+"\t|");
        System.out.print("------------------------------------------------------");
        System.out.printf("%s-%d[%d] \"%s\"\n", topics.get(0), partitions.get(0), offsets.get(0), message);
    }

}