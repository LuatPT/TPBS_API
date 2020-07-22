package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.entity.Trainer;
import api.service.TrainerService;

@RestController
@RequestMapping("/api")
public class TrainerController {

	private TrainerService trainerService;
	@Autowired
	public TrainerController(TrainerService trainerService) {
		this.trainerService = trainerService;
	}

	@RequestMapping(value = "/trainers/", method = RequestMethod.GET)
	public ResponseEntity<List<Trainer>> listAllTrainer(){
		List<Trainer> listTrainer= trainerService.findAllTrainer();
		return new ResponseEntity<List<Trainer>>(listTrainer, HttpStatus.OK);
	}
}
