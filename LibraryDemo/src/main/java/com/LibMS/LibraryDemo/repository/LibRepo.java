package com.LibMS.LibraryDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.LibMS.LibraryDemo.bean.Library;

public interface LibRepo extends JpaRepository<Library, String> {


}
