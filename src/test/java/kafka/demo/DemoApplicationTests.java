// package kafka.demo;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.cloud.stream.binder.test.InputDestination;
// import org.springframework.cloud.stream.binder.test.OutputDestination;
// import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
// import org.springframework.context.annotation.Import;
// import org.springframework.messaging.support.GenericMessage;
// import static org.junit.Assert.*;
// import static org.hamcrest.CoreMatchers.*;

// import consumer.Consumer;

// @SpringBootTest(classes =  Consumer.class)
// @Import({TestChannelBinderConfiguration.class})
// class KafkaApplicationTests {

// 	@Autowired
// 	private InputDestination input;

// 	@Autowired
// 	private OutputDestination output;

// 	@Test
// 	void contextLoads() {
// 		input.send(new GenericMessage<byte[]>("hello".getBytes()));
// 		// assertThat(output.receive().getPayload()).isEqualTo("HELLO".getBytes());
// 	}

// }
