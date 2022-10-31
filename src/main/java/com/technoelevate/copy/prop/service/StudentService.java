package com.technoelevate.copy.prop.service;

import com.technoelevate.copy.prop.dto.BookDto;
import com.technoelevate.copy.prop.dto.StudentDto;

public interface StudentService {
	StudentDto saveStudent(StudentDto studentDto);
	
	StudentDto getStudent(Long stdId);
	
	BookDto getBook(Long bookId);
    StudentDto saveBook(Long stdId,BookDto bookDto);
}
