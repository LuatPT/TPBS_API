package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "trainers")
@Data
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Trainer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "trainer_id")
	private int trainerId;
	
	@Column(name = "trainer_name")
	private String trainerName;
	
	@Column(name = "experience")
	private int experience;
	
	@Column(name = "trainer_avatar")
	private String trainerAvatar;
	
	@Column(name = "trainer_quote")
	private String trainerQuote;
	
	@Column(name = "trainer_cost")
	private String trainerCost;
}
