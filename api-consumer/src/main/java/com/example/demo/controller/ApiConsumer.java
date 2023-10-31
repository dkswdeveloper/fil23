package com.example.demo.controller;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
class Details
{
	public String name;
	public int age;
	@Override
	public String toString() {
		return "Details [name=" + name + ", age=" + age + "]";
	}
	
	
}
@RestController
public class ApiConsumer {
//	@Autowired
//	StudentFeignClient studentFeignClient;
//
//	@GetMapping("/students/feign")
//	public List<Student> getFromOtherServerUsingFeign()
//	{
//		List<Student> students = studentFeignClient.getStudents();
//		System.out.println(students);
//		return students;
//		//		return new ArrayList<>();
//	}
	@GetMapping("/students")
	public String getFromOtherServer() throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpGet request = new HttpGet("http://localhost:8080/students");
			// add request headers
			request.addHeader("accept", "application/json");
			CloseableHttpResponse response = httpClient.execute(request);
			try {
				String str = " { \"name\" : \"dinesh\", \"age\": 30 } ";
				ObjectMapper mapper = new ObjectMapper();
				Details details = mapper.readValue(str, Details.class);
				System.out.println("after conversion " + details);
				Map<String,String> mapFromString = mapper.readValue(str, Map.class);
				System.out.println("map from String:" + mapFromString);
				Details det = new Details();
				det.age = 88;
				det.name = "Bharat";
				String objectToStr = mapper.writeValueAsString(det);
				System.out.println("object details to String :" + objectToStr);
				System.out.println(response.getProtocolVersion());              // HTTP/1.1
				System.out.println(response.getStatusLine().getStatusCode());   // 200
				System.out.println(response.getStatusLine().getReasonPhrase()); // OK
				System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					// return it as a String
					String result = EntityUtils.toString(entity);
					System.out.println(result);
					return result;
				}

			} finally {
				response.close();
			}
		} finally {
			httpClient.close();
		}	
		return "Could not find the result";
	}

}
