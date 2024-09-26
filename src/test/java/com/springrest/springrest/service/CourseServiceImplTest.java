package com.springrest.springrest.service;

import com.springrest.springrest.entities.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceImplTest {

    @InjectMocks
    private CourseServiceImpl courseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void GetCoursetest() {
        List<Course> courses = courseService.getCourse();
        assertEquals(3, courses.size());
    }

    @Test
    void GetCourseById_ExistingIdtest() {
        Course course = courseService.getCourseById(10);
        assertNotNull(course);
        assertEquals("Java", course.getTitle());
    }

    @Test
    void GetCourseById_NonExistingIdtest() {
        Course course = courseService.getCourseById(99);
        assertNull(course);
    }

    @Test
    void AddCoursetest() {
        Course newCourse = new Course(13, "JavaScript", "Web Developer");
        Course addedCourse = courseService.addCourse(newCourse);

        assertNotNull(addedCourse);
        assertEquals(newCourse.getId(), addedCourse.getId());
        assertEquals(4, courseService.getCourse().size());
    }
}
