package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import studentModel.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	@RequestMapping(value="/admissionSucess.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="StudentName" , defaultValue="Mr XYZ" , required=true) String name, 
					@RequestParam("StrudentHobby") String hobby){
		ModelAndView model= new ModelAndView("AdmissionSucess");
		model.addObject("msg", "Details submitted by" +name + "and their hobby is"+hobby);
		return model;
	}
	
	@RequestMapping(value="/admissionSucess1.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm1(@RequestParam Map<String,String> studParams){
		String name=studParams.get("studentName");
		String hobby=studParams.get("studentHobby");
		
		ModelAndView model= new ModelAndView("AdmissionSucess");
		model.addObject("msg", "Details submitted by" +name + "and their hobby is"+hobby);
		return model;
	}
	
	@RequestMapping(value="/admissionSucess.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionFormUsingModel(@RequestParam("StudentName") String name, 
					@RequestParam("StrudentHobby") String hobby){
		Student student=new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);
		
		ModelAndView model= new ModelAndView("AdmissionSucess");
		model.addObject("msg", "Details submitted by" +name + "and their hobby is"+hobby);
		model.addObject("student", student);
		return model;
	}
	
	@RequestMapping(value="/admissionSucess.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionFormUsingWithoutModelAttribute(@RequestParam("StudentName") String name,
			@RequestParam("StudentHobby") String hobby,
			@RequestParam("StudentMobile") String mobile,
			@RequestParam("studentDOB") String dob,
			@RequestParam("studentSkills") String[] skills){
		
		Student stud=new Student();
		stud.setStudentName(name);
		stud.setStudentHobby(hobby);
		stud.setStudentMobile(Long.parseLong(mobile));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
		try {
			stud.setStudentDOB(sdf.parse(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> studentSkills= new ArrayList<String>();
		for (int i=0;i<studentSkills.size();i++) {
			studentSkills.add(skills[i]);
		}
		stud.setStudentSkills(studentSkills);
		
		ModelAndView model= new ModelAndView("AdmissionSucess");
		model.addObject("student", stud);
		return model;
	}
	
	@RequestMapping(value="/admissionSucess.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionFormUsingModelAttribute(@ModelAttribute("student1") Student student1){
		
		
		ModelAndView model= new ModelAndView("AdmissionSucess");
		return model;
	}
	
	@ModelAttribute
	public void addComment(Model model1){
		model1.addAttribute("headerMessage", "Coded by Rajesh");
	}
}
