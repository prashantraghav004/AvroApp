package com.avaya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaMessageController {

	@Autowired
	SpringKafkaExample springKafkaExample;

	@RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
	public void sendMessage() {
		springKafkaExample.sendMessage();
	}

}
