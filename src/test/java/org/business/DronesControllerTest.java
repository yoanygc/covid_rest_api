package org.business;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DronesControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	private String jsonDrone;
	private String jsonMedication;
	
	@BeforeAll
	public void setup() throws Exception {

		// Registering one drone
//		Drone drone = new Drone();
//		drone.setSerialNumber("AB0001");
//		drone.setBatteryCapacity(100);
//		drone.setModel(DroneModel.Cruiserweight);
//		drone.setState(DroneState.IDLE);
//		drone.setWeightLimit(300);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		jsonDrone = objectMapper.writeValueAsString(drone);
//		this.mockMvc.perform(post("/register_drone").contentType(MediaType.APPLICATION_JSON).content(jsonDrone))
//		.andDo(print()).andExpect(status().isOk());
//
//		// Registering Medications
//		Medication med1 = new Medication();
//		med1.setName("Aspirin");
//		med1.setCode("ASP01");
//		med1.setWeight(10);
//		jsonMedication = objectMapper.writeValueAsString(med1);
//		this.mockMvc.perform(post("/register_medication").contentType(MediaType.APPLICATION_JSON).content(jsonMedication))
//		.andDo(print()).andExpect(status().isOk());
//
//		Medication med2 = new Medication();
//		med2.setName("Tylenol");
//		med2.setCode("TYL01");
//		med2.setWeight(20);
//		jsonMedication = objectMapper.writeValueAsString(med2);
//		this.mockMvc.perform(post("/register_medication").contentType(MediaType.APPLICATION_JSON).content(jsonMedication))
//		.andDo(print()).andExpect(status().isOk());
//
//		Medication med3 = new Medication();
//		med3.setName("Panadol");
//		med3.setCode("PAN01");
//		med3.setWeight(25);
//		jsonMedication = objectMapper.writeValueAsString(med3);
//		this.mockMvc.perform(post("/register_medication").contentType(MediaType.APPLICATION_JSON).content(jsonMedication))
//		.andDo(print()).andExpect(status().isOk());
		
	}

	@Test
	public void helloServiceTest() throws Exception {

//		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("hello")));
	}

	@Test
	public void registerDroneTest() throws Exception {

//		this.mockMvc.perform(post("/register_drone").contentType(MediaType.APPLICATION_JSON).content(jsonDrone))
//				.andDo(print()).andExpect(status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.id").value(2))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.serialNumber").value("AB0001"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.weightLimit").value(300))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.model").value("Cruiserweight"));

	}

	@Test
	public void getDroneTest() throws Exception {

//		this.mockMvc.perform(get("/get_drone/{id}", 1)).andDo(print()).andExpect(status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.serialNumber").value("AB0001"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.weightLimit").value(300))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.model").value("Cruiserweight"));

	}

}
