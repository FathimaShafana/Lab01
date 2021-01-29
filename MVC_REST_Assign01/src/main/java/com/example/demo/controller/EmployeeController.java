package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.EmployeeJPADao;
import com.example.demo.model.Employee;




//@RestController
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;

	@Autowired
	EmployeeJPADao jpaDao;
	
	
@RequestMapping(path= "/", method=RequestMethod.GET)
public String home() {
	return "home.jsp";
}
	

@RequestMapping(path="/addEmployee",method=RequestMethod.GET)
public String addEmployee(Employee emp) {
	dao.save(emp);
	return "home.jsp";
}

@RequestMapping(path="/getEmployee", method = RequestMethod.GET)
public ModelAndView getUser(@RequestParam int empid){
	
	ModelAndView mv = new ModelAndView("viewUser.jsp");
	Employee emp = dao.findById(empid).orElse(new Employee());
	mv.addObject(emp);
	
	return mv;
}

//Method to view all EMployees
@RequestMapping(path="/employeesJPA",method=RequestMethod.GET)
@ResponseBody
public List<Employee> getUsersRESTJPA(){
		return jpaDao.findAll();
}

//@RequestMapping(path="/employeesJPA",method=RequestMethod.GET)
//@ResponseBody
//public List<Employee> employees= jpaDao.findAll(Sort.by(Sort.Direction.DESC, "empid"));

	/*@Override
public List<Employee> findAll()
{
	return jpaDao.findAll(sortByIdAsc());
}

private Sort sortByIdAsc() {
	// TODO Auto-generated method stub
	return new Sort(Sort.Direction.ASC,"empid");
}
*/

//Method to delete a User
@RequestMapping(path="/employeeJPA/{empid}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("empid") int empid) {
		Employee emp = jpaDao.getOne(empid);
		jpaDao.delete(emp);
		return "deleted";
	}
}

