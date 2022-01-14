package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Pet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Feeding extends BaseEntity{
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy/MM/dd")
    LocalDate startDate;
    
	@NotNull
	@Positive
    double weeksDuration;
    
	@ManyToOne
	@NotEmpty
	@NotNull
	Pet pet;
}
