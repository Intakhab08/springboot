package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.ServicesInterfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourse();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
            return this.courseService.getCourseById(Long.parseLong(courseId));
        }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

            return courseService.addCourse(course);

    }
}
// actutator in sprinng // exception handled ... @ControlAdvice @Excdhandler