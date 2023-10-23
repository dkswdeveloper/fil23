package com.dk.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.engine.FetchTiming;

import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label;
//what should be the default names : naming strategy jpa, legacy, 
@Entity
@Table(name="mybatch")
public class MyBatch {
	@SequenceGenerator(name="batch_seq")
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="batch_seq")
	private int bid;
	private String bname,technlogoy,trainer;
	
	//by default table : mybatch_student
	//FK : mybatch_bid, student_sid
	//enrollment ( key from myside(mybatch) : bid
	// inverse join column key from opposite(Student) sid
	// one to one, many to one (EAGER)
	//one to many , many to many( LAZY)
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="enrollment", 
		joinColumns = @JoinColumn(name="bid"),
		inverseJoinColumns = @JoinColumn(name="sid") 
	)
	List<Student> student = new ArrayList<>();
	
	
	public MyBatch(int bid, String bname, String technlogoy, String trainer) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.technlogoy = technlogoy;
		this.trainer = trainer;
	}
	public MyBatch() {
		super();
	}
	@Override
	public String toString() {
		return "MyBatch [bid=" + bid + ", bname=" + bname + ", technlogoy=" + technlogoy + ", trainer=" + trainer + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getTechnlogoy() {
		return technlogoy;
	}
	public void setTechnlogoy(String technlogoy) {
		this.technlogoy = technlogoy;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
