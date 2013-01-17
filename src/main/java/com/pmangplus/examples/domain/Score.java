package com.pmangplus.examples.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import com.mysema.query.annotations.QueryEntity;

@Entity
@QueryEntity
@Data
public class Score {

	@Id
	Long id;
	Long score;
	
//	public void setScore(Long score) {
//		throw new UnsupportedOperationException();
//	}
	
}
