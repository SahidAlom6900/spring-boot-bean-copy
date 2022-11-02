package com.technoelevate.copy.prop.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoelevate.copy.prop.convert.BeanCopy;
import com.technoelevate.copy.prop.dto.BookDto;
import com.technoelevate.copy.prop.dto.StudentDto;
import com.technoelevate.copy.prop.entity.Book;
import com.technoelevate.copy.prop.entity.Student;
import com.technoelevate.copy.prop.exception.BooKNotFound;
import com.technoelevate.copy.prop.repository.BookRepository;
import com.technoelevate.copy.prop.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	private final BookRepository bookRepository;

	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		return BeanCopy.objectProperties(studentRepository.save(BeanCopy.objectProperties(studentDto, Student.class)),
				StudentDto.class);
	}

	@Override
	public StudentDto getStudent(Long stdId) {
		return BeanCopy.objectProperties(studentRepository.findById(stdId).orElseThrow(), StudentDto.class);
	}
	
	@Transactional
	@Override
	public StudentDto saveBook(Long stdId,BookDto bookDto) {
		
		Student student = studentRepository.findById(stdId).orElseThrow();
		Book book = BeanCopy.objectProperties(bookDto, Book.class);
		student.getBooks().add(book);
		return BeanCopy.objectProperties(student, StudentDto.class);
	}

	@Override
	public BookDto getBook(Long bookId) {
		try {
			Book book = bookRepository.findById(bookId).orElseThrow(()->new BooKNotFound("Book Not Found!!!"));
			BookDto bookDto = BeanCopy.objectProperties(book, BookDto.class);
			if (!book.getStudents().isEmpty())
				bookDto.setStudents(book.getStudents().stream().map(std -> {
					std.setBooks(null);
					System.out.print(std);
					return BeanCopy.objectProperties(std, StudentDto.class);
				}).toList());
			return bookDto;
		} catch (BooKNotFound e) {
			throw e;
		}
	}

}