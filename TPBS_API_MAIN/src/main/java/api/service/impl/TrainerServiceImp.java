package api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.entity.Trainer;
import api.repository.TrainerRepository;
import api.service.TrainerService;

@Service
public class TrainerServiceImp implements TrainerService {
	private TrainerRepository trainerRepository;

	
	@Autowired
	public TrainerServiceImp(TrainerRepository trainerRepository) {
		this.trainerRepository = trainerRepository;
	}

	@Override
	public List<Trainer> findAllTrainer() {
		return (List<Trainer>) trainerRepository.findAll();
	}

	@Override
	public Optional<Trainer> findById(Integer id) {
		return trainerRepository.findById(id);
	}

	@Override
	public void save(Trainer trainer) {
		trainerRepository.save(trainer);
	}

	@Override
	public void remove(Trainer trainer) {
		trainerRepository.delete(trainer);
	}

}
