package org.business;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PeriodicTasks {
	private static final Logger log = LoggerFactory.getLogger(PeriodicTasks.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Autowired
	private Controller controller;

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
//		log.info("Actual Time {}", dateFormat.format(new Date()));
	}

	@Scheduled(fixedRate = 5000)
	public void systemRunningEventLog() {

//		List<Drone> drones = controller.allDrones();
//		for (Drone drone : drones) {
//			if (drone.getBatteryCapacity() < 25) {
//				log.info("Drone Battery Low -- DroneId: " + drone.getId() + 
//						" -- Battery Level: " + drone.getBatteryCapacity() + "%");
//			}
//		}

	}

}
