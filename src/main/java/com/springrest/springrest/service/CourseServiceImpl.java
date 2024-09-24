package com.springrest.springrest.service;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.ServicesInterfaces.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(10, "Java", "Java Developer"));
        list.add(new Course(11,"Python","Python Developer"));
        list.add(new Course(12,"C++", "Become a Coder"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourseById(long courseId) {
        Course c=null;
        for(Course course: list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }



}
