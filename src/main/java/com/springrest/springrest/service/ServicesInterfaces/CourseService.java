package com.springrest.springrest.service.ServicesInterfaces;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();
    public Course getCourseById(long courseId);

   public Course addCourse(Course course);

}
