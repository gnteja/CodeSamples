package com.learngn.springdatajpa;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.learngn.springdatajpa.dto.CustomerDto;
import com.learngn.springdatajpa.entity.AddressEntity;
import com.learngn.springdatajpa.entity.CustomerEntity;
import com.learngn.springdatajpa.entity.PhoneNumber;
import com.learngn.springdatajpa.files.entity.Image;
import com.learngn.springdatajpa.files.repository.ImageRepo;
import com.learngn.springdatajpa.manytomany.entity.Programmer;
import com.learngn.springdatajpa.manytomany.entity.Project;
import com.learngn.springdatajpa.manytomany.repository.ProgrammerRepo;
import com.learngn.springdatajpa.map.entity.Datapipeline;
import com.learngn.springdatajpa.map.entity.MultilingualString;
import com.learngn.springdatajpa.map.entity.ProjectMap;
import com.learngn.springdatajpa.map.repository.MultilingualStringRepo;
import com.learngn.springdatajpa.map.repository.ProjectMapRepo;
import com.learngn.springdatajpa.onetoone.entity.License;
import com.learngn.springdatajpa.onetoone.entity.Person;
import com.learngn.springdatajpa.onetoone.repository.LicenseRepo;
import com.learngn.springdatajpa.patientscheduling.entity.Appointment;
import com.learngn.springdatajpa.patientscheduling.entity.Doctor;
import com.learngn.springdatajpa.patientscheduling.entity.Insurance;
import com.learngn.springdatajpa.patientscheduling.entity.Patient;
import com.learngn.springdatajpa.patientscheduling.repository.AppointmentRepo;
import com.learngn.springdatajpa.patientscheduling.repository.DoctorRepo;
import com.learngn.springdatajpa.patientscheduling.repository.PatientRepo;
import com.learngn.springdatajpa.repository.CustomerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaLearnApplicationTests {

	@Autowired
	ProjectMapRepo projectRepo;
	
	@Autowired
	MultilingualStringRepo multilingualRepo;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testMapMultilingualString() {
		
		//MultilingualString sample = new MultilingualString("hindi", "namaskar");
		//multilingualRepo.save();
		
		
	}
/*	
	@Test
	public void projectMapMethod() {
		ProjectMap project1 = new ProjectMap(1L, "test", "gnteja", "4", 1L);
		Map<String, KeyValuePair> datapipeline;

		
		//project1.setDatapipeline(datapipeline);
	}
	*/
/*	@Test
	public void projectMapMethodSave() {
		
		ProjectMap project1 = new ProjectMap(1L, "test", "gnteja", "4", 1L);
		
		Datapipeline datapipeline = new Datapipeline();
		datapipeline.setConfiguration("DataSource");
		datapipeline.setTool("Sql Server");
		datapipeline.setConfiguration("DataStreaming");
		datapipeline.setTool("kafka");
		
		project1.setDatapipeline(datapipeline);
		projectRepo.save(project1);
		
	}*/
/*	
	@Autowired
	CustomerRepo customerRepo;/

	@Autowired
	ProgrammerRepo programmerRepo;
	
	@Autowired
	LicenseRepo licenseRepo;
	
	@Autowired
	ImageRepo imageRepo;
	
	@Autowired
	DoctorRepo doctorRepo;
	
	@Autowired
	PatientRepo patientRepo;
	
	@Autowired
	AppointmentRepo appointmentRepo;
	
	@Test
	public void saveCustomerInfo() {
		
		CustomerEntity customer = new CustomerEntity();
		customer.setCustomerName("teja");
		customer.setCustomerEmail("gn.teja1902@gmail.com");
		
		AddressEntity address = new AddressEntity();
		address.setDoorNumber("115");
		address.setStreet("Halstead Rd");
		address.setState("MI");
		customer.setAddress(address);
		
		PhoneNumber num1 = new PhoneNumber();
		num1.setPhNumner("44");
		num1.setPhType("mobile");
		
		PhoneNumber num2 = new PhoneNumber();
		num1.setPhNumner("44");
		num1.setPhType("mobile");
		
		customer.addPhoneNumber(num1);
		customer.addPhoneNumber(num2);
		
		CustomerDto customerSave = new CustomerDto(customerRepo);
		//System.out.println(customerSave.equals(null));
		customerSave.saveCustomerInfo(customer);
	}
	
	@Test
	public void ManyToManyCreateProgrammer() {
		Programmer developer = new Programmer();
		developer.setName("Teja");
		developer.setSalary(100000);
		
		HashSet<Project> projects = new HashSet();
		Project e = new Project();
		e.setName("Project1");
		projects.add(e);
		
		Project e1 = new Project();
		e1.setName("Project2");
		projects.add(e1);
		
		developer.setProjects(projects);
		
		programmerRepo.save(developer);
		
	}
	
	@Test
	public void ManyToManyFindProgrammer() {


	}
	
	@Test
	public void OneToOneCreateLicense() {
		
		License license = new License();
		license.setType("car");
		Date date = new Date();
		
		license.setExpirationDate(date);
		
		Person person = new Person();
		person.setName("John");
		person.setAge(22);
		
		license.setPerson(person);
		
		licenseRepo.save(license);
	}
	
	@Test
	@Transactional
	public void testLevelOneCaching() {
		
	}
	
	@Test
	public void testImageSave() throws IOException {
		
		Image image = new Image();
		
		image.setId(1L);
		image.setName("WALLPAPER");
		
		File file = new File("/Users/gn.teja/Desktop/WallPapers/justiceLeague.png");
		byte fileContent[] = new byte[(int) file.length()];
		
		FileInputStream inputStream = new FileInputStream(file);
		inputStream.read(fileContent);
		image.setData(fileContent);
		
		imageRepo.save(image);
		inputStream.close();
		
	}
	
	@Test
	public void testReadImage() {
		
	}
	
	@Test
	public void testCreateDoctor() {
		
		Doctor doctor = new Doctor();
		doctor.setName("Srini");
		doctor.setSpeciality("General");
		
		doctorRepo.save(doctor);
	}
	
	@Test
	public void testCreatePatient() {
	
		Patient patient = new Patient();
		
		patient.setName("Navin");
		patient.setPhone("1234567890");
		
		Insurance insurance = new Insurance();
		insurance.setProviderName("BLUE CROSS");
		insurance.setCopay(20d);
		patient.setInsurance(insurance);
		
		Doctor doctor = new Doctor();
		doctor.setName("Srini");
		doctor.setSpeciality("General");
		doctor.setId(1l);
		
		List <Doctor> doctors = Arrays.asList(doctor);
	
		patient.setDoctors(doctors);
		
		patientRepo.save(patient);
		
	}
	
	@Test
	public void testCreateAppointment() {
		
		Appointment appointment = new Appointment();
		
		Timestamp appointmentTime = new Timestamp(new Date().getTime());
		appointment.setAppointmentTime(appointmentTime);
		appointment.setReason("Stomach cramps");
		appointment.setStarted(true);
		
		Doctor doctor = new Doctor();
		doctor.setName("Srini");
		doctor.setSpeciality("General");
		doctor.setId(1l);
		
		appointment.setDoctor(doctor);
		
		Patient patient = new Patient();
		
		patient.setName("Navin");
		patient.setPhone("1234567890");
		patient.setId(1L);
		
		Insurance insurance = new Insurance();
		insurance.setProviderName("BLUE CROSS");
		insurance.setCopay(20d);
		patient.setInsurance(insurance);
		
		appointment.setPatient(patient);
		appointmentRepo.save(appointment);
		
	}*/
}













