package com.LibMS.LibraryDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.LibMS.LibraryDemo.bean.Library;
import com.LibMS.LibraryDemo.repository.LibRepo;

@SpringBootTest
class Testrepo {

	@Autowired
	private LibRepo librepo;
	Library lib;
	
	@BeforeEach
	void setUp() throws Exception {
		lib = new Library("108","580","Rahul");
		librepo.save(lib);
	}

//	@AfterEach
//	void tearDown() throws Exception {
//		lib=null;
//		librepo.deleteAll();
//	}

	@Test
	void test() {
		
	}

}
