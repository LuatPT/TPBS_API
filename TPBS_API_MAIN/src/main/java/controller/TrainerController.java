package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Trainer;
import service.TrainerService;

@Controller
@RequestMapping("/api")
public class TrainerController {

	@Autowired
	TrainerService trainerService;
	
	@RequestMapping(value = "/contact/", method = RequestMethod.GET)
	public ResponseEntity<List<Trainer>> listAllTrainer(){
		List<Trainer> listTrainer= trainerService.getAllTrainer();
		if(listTrainer.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Trainer>>(listTrainer, HttpStatus.OK);
	}
}
