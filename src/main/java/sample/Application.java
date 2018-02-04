package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import sample.city.City;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
while (true)
{
		RestTemplate restTemplate = new RestTemplate();
		 String pp = restTemplate.getForObject("https://gentle-mountain-45294.herokuapp.com/", String.class);
		log.info(pp.toString());
		try {
			Thread.sleep(2000*60*15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	}
}
