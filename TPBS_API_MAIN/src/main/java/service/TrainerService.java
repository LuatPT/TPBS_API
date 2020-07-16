package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TrainerDao;
import entity.Trainer;

@Service
public class TrainerService {
	
	@Autowired
	TrainerDao trainerDao;
	public List<Trainer> getAllTrainer() {
		return trainerDao.getAllTrainerDao();
	}

}
