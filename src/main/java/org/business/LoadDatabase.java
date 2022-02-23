package org.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(Controller dronesController) {
		return args -> {

			// Registering Drone1
//			Drone drone1 = new Drone();
//			drone1.setSerialNumber("ABC0001");
//			drone1.setBatteryCapacity(100);
//			drone1.setModel(DroneModel.Cruiserweight);
//			drone1.setState(DroneState.IDLE);
//			drone1.setWeightLimit(100);
//			log.info("Registering Drone: " + dronesController.registerDrone(drone1));
//
//			// Registering Drone1
//			Drone drone2 = new Drone();
//			drone2.setSerialNumber("ABC0002");
//			drone2.setBatteryCapacity(100);
//			drone2.setModel(DroneModel.Middleweight);
//			drone2.setState(DroneState.IDLE);
//			drone2.setWeightLimit(250);
//			log.info("Registering Drone: " + dronesController.registerDrone(drone2));

			
			//			// Registering Medications
//			Medication med1 = new Medication();
//			med1.setName("Aspirin");
//			med1.setCode("ASP01");
//			med1.setWeight(10);
//			log.info("Registering Medication: " + dronesController.registerMedication(med1));
//
//			Medication med2 = new Medication();
//			med2.setName("Tylenol");
//			med2.setCode("TYL01");
//			med2.setWeight(20);
//			log.info("Registering Medication: " + dronesController.registerMedication(med2));
//
//			Medication med3 = new Medication();
//			med3.setName("Panadol");
//			med3.setCode("PAN01");
//			med3.setWeight(25);
//			log.info("Registering Medication: " + dronesController.registerMedication(med3));
//
//			Set<Medication> medicationsDeliv1 = new HashSet<Medication>();
//			medicationsDeliv1.add(med1);
//			medicationsDeliv1.add(med2);
//
//			Delivery delivery1 = new Delivery();
//			log.info("Creating Delivery: " + dronesController.registerDelivery());
//			log.info("Creating Delivery: " + dronesController.addMedicationsToDelivery(delivery1.getId(), 
//					medicationsDeliv1.);
//			delivery1.setMedications(medicationsDeliv1);
//			
//			delivery1.setDrone(drone1);
//
//			Set<Medication> medicationsDeliv2 = new HashSet<Medication>();
//			medicationsDeliv2.add(med1);
//			medicationsDeliv2.add(med2);
//			medicationsDeliv2.add(med3);
//
//			Delivery delivery2 = new Delivery();
//			delivery2.setMedications(medicationsDeliv2);
//			delivery2.setDrone(drone2);
//			log.info("Creating Delivery: " + dronesController.registerDelivery(delivery2));

		};

	}
}
