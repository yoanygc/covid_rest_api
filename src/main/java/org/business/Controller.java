package org.business;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.persistence.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EntityScan("org.persistence")
@ComponentScan("org.business")
class Controller {

	private static final Logger log = LoggerFactory.getLogger(Controller.class);

	@Autowired
	private UserRepository userRepository;

	Controller(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// Testing the REST api
	@GetMapping("/hello")
	Map<String, Integer> hello() {
		return Collections.singletonMap("hello", 1);
	}

	// Get All Users
	@GetMapping("/users")
	List<User> allDeliveries() {
		return userRepository.findAll();
	}

	// Register a new user
	@PostMapping("/register_user")
	User registerDrone(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	
//	// Assign drone to delivery
//	@GetMapping("/assign_drone/{deliveryId}/assign/{droneId}")
//	Map<String, Integer> assignDroneToDelivery(@PathVariable Long deliveryId, @PathVariable Long droneId) {
//
//		Delivery delivery = deliveryRepository.findById(deliveryId)
//				.orElseThrow(() -> new ObjectNotFoundException(deliveryId));
//		Optional<Drone> drone = droneRepository.findById(droneId);
//		if (drone.isPresent()) {
//			delivery.setDrone(drone.get());
//			deliveryRepository.save(delivery);
//			return Collections.singletonMap("OK", 1);
//
//		}
//		return Collections.singletonMap("error", -1); // Drone not found
//
//	}
//
//	// Add one medication to one delivery
//	@GetMapping("/add_medication/{deliveryId}/add/{medId}")
//	Map<String, Integer> addMedicationsToDelivery(@PathVariable Long deliveryId, @PathVariable Long medId) {
//		Integer total = 0;
//
//		Delivery delivery = findDeliveryById(deliveryId);
//
//		if (delivery.getDrone().getBatteryCapacity() < 25 ) {
//			this.changeStateDrone(delivery.getDrone().getId(), 1L);
//			return Collections.singletonMap("error", -5); // "ERROR: Battery Death.“
//		}
//		
//		if (delivery.getDrone() != null) {
//			if (delivery.getDrone().getState() != DroneState.IDLE
//					&& delivery.getDrone().getState() != DroneState.LOADING) {
//				return Collections.singletonMap("error", -2); // "ERROR: Drone
//																// is not
//																// available for
//																// loading"
//			}
//			for (Medication med : delivery.getMedications()) {
//				total = total + med.getWeight();
//			}
//			Optional<Medication> medicationToAdd = medicRepository.findById(medId);
//			if (!medicationToAdd.isPresent()) {
//				return Collections.singletonMap("error", -3); // "ERROR:
//																// Medication
//																// not found"
//			}
//			if (total + medicationToAdd.get().getWeight() > delivery.getDrone().getWeightLimit()) {
//				// "ERROR: Medication can not be added to this drone. Weight
//				// exceed the limit."
//				return Collections.singletonMap("error", -4);
//
//			}
//			return Collections.singletonMap("error", -1); // Drone not found
//		}
//
//		Medication medication = medicRepository.findById(medId).orElseThrow(() -> new ObjectNotFoundException(medId));
//		delivery.getMedications().add(medication);
//		deliveryRepository.save(delivery);
//		return Collections.singletonMap("OK", 1);
//	}
//
//	// TODO **************** This is something to test **************
//	@PostMapping("/register_delivery/{droneId}")
//	Delivery registerDeliveryByDroneId(@RequestBody Delivery newDelivery) {
//		return deliveryRepository.save(newDelivery);
//	}
//
//	// Get one delivery by Id
//	@GetMapping("/get_delivery/{id}")
//	Delivery findDeliveryById(@PathVariable Long id) {
//		return deliveryRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
//	}
//
//	// Get all delveries of a given drone
//	@GetMapping("/deliveries/{droneId}")
//	List<Delivery> findDeliveriesByDroneId(@PathVariable Long droneId) {
//		return deliveryRepository.findByDroneId(droneId);
//	}
//
//	// Delete one delivery
//	@DeleteMapping("/delete_delivery/{id}")
//	void deleteDelivery(@PathVariable Long id) {
//		deliveryRepository.deleteById(id);
//	}
//
//	// Get all drones
//	@GetMapping("/drones")
//	List<Drone> allDrones() {
//		return droneRepository.findAll();
//	}
//
//	// Get one drone
//	@GetMapping("/get_drone/{id}")
//	Drone findDroneById(@PathVariable Long id) {
//		return droneRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
//	}
//
//	// Register a new drone
//	@PostMapping("/register_drone")
//	Drone registerDrone(@RequestBody Drone newDrone) {
//		newDrone.setState(DroneState.IDLE);
//
//		return droneRepository.save(newDrone);
//	}
//
//	// Change Status to a given drone
//	@GetMapping("/change_state_drone/{droneId}/state/{state}")
//	Drone changeStateDrone(@PathVariable Long droneId, @PathVariable Long state) {
//
//		Optional<Drone> drone = droneRepository.findById(droneId);
//		if (!drone.isPresent()) {
//
//			drone.orElseThrow(() -> new ObjectNotFoundException(droneId));
//		}
//
//		switch (state.intValue()) {
//		case 1:
//			drone.get().setState(DroneState.IDLE);
//			break;
//		case 2:
//			drone.get().setState(DroneState.LOADING);
//			break;
//		case 3:
//			drone.get().setState(DroneState.LOADED);
//			break;
//		case 4:
//			drone.get().setState(DroneState.DELIVERING);
//			break;
//		case 5:
//			drone.get().setState(DroneState.DELIVERED);
//			break;
//		case 6:
//			drone.get().setState(DroneState.RETURNING);
//			break;
//
//		default:
//			return drone.get();
//		}
//
//		return droneRepository.save(drone.get());
//	}
//
//	// Check if the given drone is available
//	@GetMapping("/is_drone_available/{droneId}")
//	Map<String, Integer> isDroneAvailableForLoading(@PathVariable Long droneId) {
//
//		Optional<Drone> drone = droneRepository.findById(droneId);
//		if (!drone.isPresent()) {
//			return Collections.singletonMap("error", -1);
//		}
//
//		if (drone.get().getState() != DroneState.IDLE) {
//			return Collections.singletonMap("error", -2);
//		}
//
//		return Collections.singletonMap("Ok", 1);
//
//	}
//
//	// List all available drones for loading
//	@GetMapping("/available_drones")
//	List<Drone> allAvailableDrones() {
//		return droneRepository.findByState(DroneState.IDLE);
//	}
//
//	// Check if the given drone is available
//	@GetMapping("/check_drone_battery/{droneId}")
//	Map<String, Integer> checkBatteryLevel(@PathVariable Long droneId) {
//
//		Optional<Drone> drone = droneRepository.findById(droneId);
//		if (drone.isPresent()) {
//			return Collections.singletonMap("result", drone.get().getBatteryCapacity());
//		}
//
//		// ERROR: Drone not found
//		return Collections.singletonMap("error", -1);
//
//	}
//
//	// delete the given drone
//	@DeleteMapping("/delete_drone/{id}")
//	void deleteDrone(@PathVariable Long id) {
//		droneRepository.deleteById(id);
//	}
//
//	// Get all medications
//	@GetMapping("/medications")
//	List<Medication> allMedications() {
//		return medicRepository.findAll();
//	}
//
//	// Get medication by Id
//	@GetMapping("/get_medications/{id}")
//	Medication findMedicationById(@PathVariable Long id) {
//		return medicRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
//	}
//
//	// Register new medication
//	@PostMapping("/register_medication")
//	Medication registerMedication(@RequestBody Medication newMedication) {
//		return medicRepository.save(newMedication);
//	}
//
//	// Delete the given medication
//	@DeleteMapping("/delete_medication/{id}")
//	void deleteMedication(@PathVariable Long id) {
//		medicRepository.deleteById(id);
//	}

}
